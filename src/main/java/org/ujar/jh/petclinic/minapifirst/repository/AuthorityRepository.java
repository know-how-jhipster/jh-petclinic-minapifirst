package org.ujar.jh.petclinic.minapifirst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ujar.jh.petclinic.minapifirst.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
