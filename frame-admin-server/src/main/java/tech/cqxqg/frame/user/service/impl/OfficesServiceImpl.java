package tech.cqxqg.frame.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.swak.frame.dto.PageInfo;
import com.swak.frame.dto.Pagination;
import com.swak.frame.dto.Result;
import com.swak.frame.enums.Status;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import tech.cqxqg.frame.core.enums.ResultCode;
import tech.cqxqg.frame.persistence.entity.Offices;
import tech.cqxqg.frame.persistence.service.MpOfficesService;
import tech.cqxqg.frame.user.converter.OfficesConverter;
import tech.cqxqg.frame.user.dto.request.OfficesCommand;
import tech.cqxqg.frame.user.dto.request.OfficesPageReq;
import tech.cqxqg.frame.user.dto.vo.OfficesVo;
import tech.cqxqg.frame.user.service.OfficesService;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OfficesServiceImpl implements OfficesService {
    @Resource
    private MpOfficesService mpOfficesService;
    @Resource
    private OfficesConverter officesConverter;

    @Override
    public OfficesVo selectOfficesById(Integer id) {
        Offices offices = mpOfficesService.getBaseMapper().selectById(id);
        return officesConverter.entityToVo(offices);
    }

    @Override
    public Result<Pagination<OfficesVo>> selectOfficesList(OfficesPageReq query) {
        QueryWrapper<Offices> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(query.getId() != null, Offices::getId, query.getId())
                .like(StringUtils.isNotEmpty(query.getName()), Offices::getName, query.getName())
                .like(StringUtils.isNotEmpty(query.getAddress()), Offices::getAddress, query.getAddress());
        IPage<Offices> page = mpOfficesService.page(new Page<>(query.getCurrentPage(), query.getPageSize()), queryWrapper);
        List<OfficesVo> officesVos = page.getRecords().stream().map(officesConverter::entityToVo).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(officesVos)) {
            return Result.success(Pagination.builder(Collections.emptyList(), PageInfo.page(query, 0L)));
        }
        return Result.success(Pagination.builder(officesVos, PageInfo.page(query, page.getTotal())));
    }

    @Override
    public Result<Void> addOffices(OfficesCommand officesCommand) {
        Offices offices = officesConverter.toEntity(officesCommand);
        offices.setCreatedAt(LocalDateTime.now());
        //todo 获取创建者信息
        offices.setCreatedUserId(123456);
        return mpOfficesService.save(offices) ? Result.success() : Result.fail(ResultCode.UPDATE_ERROR);
    }

    @Override
    public Result<Void> updateOffices(OfficesCommand officesCommand) {
        Assert.notNull(officesCommand.getId(), "办公室ID不能为空");
        Offices offices = officesConverter.toEntity(officesCommand);
        //todo 获取更新操作这信息
        offices.setUpdatedUserId(123456);
        offices.setUpdateAt(LocalDateTime.now());
        return mpOfficesService.updateById(offices) ? Result.success() : Result.fail(ResultCode.UPDATE_ERROR);
    }


    @Override
    public Result<Void> deleteOfficesByIds(List<Integer> ids) {
        if (CollectionUtils.isNotEmpty(ids)) {
            UpdateWrapper<Offices> updateWrapper = new UpdateWrapper();
            updateWrapper.lambda().set(Offices::getStatus, Status.INVALID.getValue())
                    .in(Offices::getId, ids);
            if (CollectionUtils.isNotEmpty(ids)) {
                return mpOfficesService.update(updateWrapper) ? Result.success() : Result.fail(ResultCode.DELETE_ERROR);
            }
        }
        return Result.success();
    }


}
