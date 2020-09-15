package com.anhthao.petclinic.services;


import com.anhthao.petclinic.models.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
