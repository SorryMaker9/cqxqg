package tech.cqxqg.frame.user.converter;

import tech.cqxqg.frame.user.dto.UserVo;
import tech.cqxqg.frame.user.dto.request.UserCommand;
import tech.cqxqg.frame.persistence.entity.SysUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserConverter {

    UserVo entityToVo(SysUser user);

    SysUser toEntity(UserCommand command);
}

