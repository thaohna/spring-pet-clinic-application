package com.anhthao.petclinic.services.springdatajpa;

import com.anhthao.petclinic.models.Vet;
import com.anhthao.petclinic.repositories.VetRepositories;
import com.anhthao.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepositories vetRepositories;

    public VetSDJpaService(VetRepositories vetRepositories) {
        this.vetRepositories = vetRepositories;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepositories.findById(aLong).orElse(null);
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepositories.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet save(Vet object) {
        return vetRepositories.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepositories.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepositories.deleteById(aLong);
    }
}
