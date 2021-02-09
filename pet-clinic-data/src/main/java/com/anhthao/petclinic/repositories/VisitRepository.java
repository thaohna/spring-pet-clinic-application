package com.anhthao.petclinic.repositories;

import com.anhthao.petclinic.models.Visit;
import org.springframework.data.repository.CrudRepository;



public interface VisitRepository extends CrudRepository<Visit, Long> {
}
