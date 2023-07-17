package tech.cqxqg.frame.persistence.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import tech.cqxqg.frame.persistence.service.MpUserService;
import tech.cqxqg.frame.persistence.entity.SysUser;
import tech.cqxqg.frame.persistence.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class MpUserServiceImpl extends ServiceImpl<UserMapper, SysUser>
        implements MpUserService {


}