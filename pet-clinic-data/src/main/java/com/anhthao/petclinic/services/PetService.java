package com.anhthao.petclinic.services;


import com.anhthao.petclinic.models.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
