package tech.cqxqg.frame.user.service;

import com.swak.frame.dto.Pagination;
import com.swak.frame.dto.Result;
import tech.cqxqg.frame.persistence.entity.Offices;
import tech.cqxqg.frame.user.dto.request.OfficesCommand;
import tech.cqxqg.frame.user.dto.request.OfficesPageReq;
import tech.cqxqg.frame.user.dto.vo.OfficesVo;

import java.util.List;

public interface OfficesService {

    OfficesVo selectOfficesById(Integer id);

    Result<Pagination<OfficesVo>> selectOfficesList(OfficesPageReq query);

    Result<Void> addOffices(OfficesCommand officesCommand);

    Result<Void> updateOffices(OfficesCommand officesCommand);


    Result<Void> deleteOfficesByIds(List<Integer> ids);
}
