package tech.cqxqg.frame.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.cqxqg.frame.persistence.entity.UserOffice;
import tech.cqxqg.frame.persistence.mapper.UserOfficeMapper;
import tech.cqxqg.frame.persistence.service.MpUserOfficeService;

@Service
public class MpUserOfficeServiceImpl extends ServiceImpl<UserOfficeMapper, UserOffice> implements MpUserOfficeService {
}
