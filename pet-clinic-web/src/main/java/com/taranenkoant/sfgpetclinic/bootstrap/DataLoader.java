package com.taranenkoant.sfgpetclinic.bootstrap;

import com.taranenkoant.sfgpetclinic.model.Owner;
import com.taranenkoant.sfgpetclinic.model.PetType;
import com.taranenkoant.sfgpetclinic.model.Vet;
import com.taranenkoant.sfgpetclinic.services.OwnerService;
import com.taranenkoant.sfgpetclinic.services.PetTypeService;
import com.taranenkoant.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Mickhael");
        owner1.setLastName("Wetson");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fioona");
        owner2.setLastName("Glinvane");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");


        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Axewwd");
        vet2.setLastName("Sassa");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
