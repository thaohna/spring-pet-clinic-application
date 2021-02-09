package com.anhthao.petclinic.services.map;

import com.anhthao.petclinic.models.Speciality;
import com.anhthao.petclinic.models.Vet;
import com.anhthao.petclinic.services.SpecialityService;
import com.anhthao.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long>
        implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {

        if(object != null) {
            if(object.getSpecialities().size() > 0) {
                object.getSpecialities().forEach(speciality -> {
                    if(speciality.getId() == null) {
                        Speciality specialitySaved = specialityService.save(speciality);
                        speciality.setId(specialitySaved.getId());
                    }
                });
            }
        }

        return super.save(object);
    }
}

