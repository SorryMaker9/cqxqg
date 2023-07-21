package tech.cqxqg.frame.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.cqxqg.frame.persistence.entity.Offices;
import tech.cqxqg.frame.persistence.mapper.OfficesMapper;
import tech.cqxqg.frame.persistence.service.MpOfficesService;

@Service
public class MpOfficeServiceImpl extends ServiceImpl<OfficesMapper, Offices> implements MpOfficesService {
}
