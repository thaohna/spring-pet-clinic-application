package com.anhthao.petclinic.bootstrap;

import com.anhthao.petclinic.models.Owner;
import com.anhthao.petclinic.models.Vet;
import com.anhthao.petclinic.services.OwnerService;
import com.anhthao.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setFirstName("ok");
        owner.setLastName("baybi");

        ownerService.save(owner);

        Owner owner1 = new Owner();
        owner1.setFirstName("ok1");
        owner1.setLastName("baybi1");

        ownerService.save(owner1);

        System.out.println("Saving owner...");

        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("ok");
        vet.setLastName("conde");

        vetService.save(vet);
        System.out.println("Saving vet...");
    }
}
