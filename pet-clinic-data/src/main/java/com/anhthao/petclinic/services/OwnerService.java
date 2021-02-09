package com.anhthao.petclinic.services;

import com.anhthao.petclinic.models.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{
    List<Owner> findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
