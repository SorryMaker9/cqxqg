package tech.cqxqg.frame.user.converter;

import org.mapstruct.Mapper;
import tech.cqxqg.frame.persistence.entity.Offices;
import tech.cqxqg.frame.user.dto.request.OfficesCommand;
import tech.cqxqg.frame.user.dto.vo.OfficesVo;

@Mapper(componentModel = "spring")
public interface OfficesConverter {

    OfficesVo entityToVo(Offices offices);

    Offices toEntity(OfficesCommand command);
}
