package com.anhthao.petclinic.repositories;

import com.anhthao.petclinic.models.PetType;
import org.springframework.data.repository.CrudRepository;



public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
