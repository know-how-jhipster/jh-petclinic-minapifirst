package dev.knowhowto.jh.petclinic.minapifirst.service.mapper;

import org.mapstruct.*;
import dev.knowhowto.jh.petclinic.minapifirst.domain.Vets;
import dev.knowhowto.jh.petclinic.minapifirst.service.dto.VetsDTO;

/**
 * Mapper for the entity {@link Vets} and its DTO {@link VetsDTO}.
 */
@Mapper(componentModel = "spring")
public interface VetsMapper extends EntityMapper<VetsDTO, Vets> {}
