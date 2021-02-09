package com.anhthao.petclinic.repositories;

import com.anhthao.petclinic.models.Pet;
import org.springframework.data.repository.CrudRepository;



public interface PetRepository extends CrudRepository<Pet, Long> {
}
