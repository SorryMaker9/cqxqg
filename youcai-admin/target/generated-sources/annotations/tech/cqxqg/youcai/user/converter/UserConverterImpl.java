package tech.cqxqg.youcai.user.converter;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import tech.cqxqg.youcai.persistence.entity.SysUser;
import tech.cqxqg.youcai.user.dto.UserVo;
import tech.cqxqg.youcai.user.dto.request.UserCommand;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-17T13:55:03+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class UserConverterImpl implements UserConverter {

    @Override
    public UserVo entityToVo(SysUser user) {
        if ( user == null ) {
            return null;
        }

        UserVo userVo = new UserVo();

        userVo.setDeptId( user.getDeptId() );
        userVo.setLoginName( user.getLoginName() );
        userVo.setUserName( user.getUserName() );
        userVo.setUserType( user.getUserType() );
        userVo.setEmail( user.getEmail() );
        userVo.setPhone( user.getPhone() );
        userVo.setSex( user.getSex() );
        userVo.setAvatar( user.getAvatar() );

        return userVo;
    }

    @Override
    public SysUser toEntity(UserCommand command) {
        if ( command == null ) {
            return null;
        }

        SysUser sysUser = new SysUser();

        sysUser.setDeptId( command.getDeptId() );
        sysUser.setLoginName( command.getLoginName() );
        sysUser.setUserName( command.getUserName() );
        sysUser.setEmail( command.getEmail() );
        sysUser.setPhone( command.getPhone() );
        sysUser.setSex( command.getSex() );
        sysUser.setAvatar( command.getAvatar() );

        return sysUser;
    }
}
