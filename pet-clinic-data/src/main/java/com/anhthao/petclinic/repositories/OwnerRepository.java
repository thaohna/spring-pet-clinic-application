package com.anhthao.petclinic.repositories;

import com.anhthao.petclinic.models.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface OwnerRepository extends CrudRepository<Owner, Long> {
    List<Owner> findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
