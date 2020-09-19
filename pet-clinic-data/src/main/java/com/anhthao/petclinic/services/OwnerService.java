package com.anhthao.petclinic.services;

import com.anhthao.petclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
