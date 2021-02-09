package com.anhthao.petclinic.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "types")
public class PetType extends BaseEntity{

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "petType")
    private Set<Pet> pets = new HashSet<>();

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
