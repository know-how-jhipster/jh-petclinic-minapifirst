package dev.knowhowto.jh.petclinic.minapifirst.service.mapper;

import org.mapstruct.*;
import dev.knowhowto.jh.petclinic.minapifirst.domain.Owners;
import dev.knowhowto.jh.petclinic.minapifirst.service.dto.OwnersDTO;

/**
 * Mapper for the entity {@link Owners} and its DTO {@link OwnersDTO}.
 */
@Mapper(componentModel = "spring")
public interface OwnersMapper extends EntityMapper<OwnersDTO, Owners> {}
