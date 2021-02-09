package com.anhthao.petclinic.bootstrap;

import com.anhthao.petclinic.models.*;
import com.anhthao.petclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        loadData();
    }

    private void loadData() {
        Speciality speciality = new Speciality();
        speciality.setDescription("chich ngua");
        Speciality chichNgua = specialityService.save(speciality);

        Speciality speciality1 = new Speciality();
        speciality1.setDescription("phau thuat");
        Speciality phauThuat = specialityService.save(speciality1);

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType petType1 = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType petType = petTypeService.save(cat);
        Owner owner = new Owner();
        owner.setFirstName("ok");
        owner.setLastName("baybi");
        owner.setAddress("123 Black1 Street");
        owner.setCity("Hue1");
        owner.setTelephone("97343249334");
        Pet pet1 = new Pet();
        pet1.setName("name of pet");
        pet1.setOwner(owner);
        pet1.setBirthDay(LocalDate.now());
        pet1.setPetType(cat);
        owner.getPets().add(pet1);

        ownerService.save(owner);

        Visit catVisit = new Visit();
        catVisit.setPet(pet1);
        catVisit.setLocalDate(LocalDate.now());
        catVisit.setDescription("Sneezy Kitty");
        visitService.save(catVisit);

        Owner owner1 = new Owner();
        owner1.setFirstName("ok1");
        owner1.setLastName("baybi1");
        owner1.setAddress("123 Black Street");
        owner1.setCity("Hue");
        owner1.setTelephone("973432493");
        Pet pet = new Pet();
        pet.setName("name of pet");
        pet.setOwner(owner1);
        pet.setBirthDay(LocalDate.now());
        pet.setPetType(petType1);
        owner1.getPets().add(pet);

        ownerService.save(owner1);

        System.out.println("Saving owner...");

        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("vet1");
        vet.setLastName("name of vet1");
        vet.getSpecialities().add(chichNgua);

        Vet vet1 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("vet 2");
        vet1.setLastName("name of vet 2");
        vet.getSpecialities().add(phauThuat);

        vetService.save(vet);
        vetService.save(vet1);
        System.out.println("Saving vet...");
    }
}
