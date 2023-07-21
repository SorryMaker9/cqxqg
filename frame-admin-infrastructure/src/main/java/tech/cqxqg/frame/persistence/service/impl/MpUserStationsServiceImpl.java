package tech.cqxqg.frame.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.cqxqg.frame.persistence.entity.UserStations;
import tech.cqxqg.frame.persistence.mapper.UserStationsMapper;
import tech.cqxqg.frame.persistence.service.MpUserStationsService;

@Service
public class MpUserStationsServiceImpl extends ServiceImpl<UserStationsMapper, UserStations> implements MpUserStationsService {
}
