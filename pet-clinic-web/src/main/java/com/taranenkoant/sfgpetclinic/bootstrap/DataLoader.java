package com.taranenkoant.sfgpetclinic.bootstrap;

import com.taranenkoant.sfgpetclinic.model.Owner;
import com.taranenkoant.sfgpetclinic.model.Vet;
import com.taranenkoant.sfgpetclinic.services.OwnerService;
import com.taranenkoant.sfgpetclinic.services.VetService;
import com.taranenkoant.sfgpetclinic.services.map.OwnerServiceMap;
import com.taranenkoant.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Mickhael");
        owner1.setLastName("Wetson");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fioona");
        owner2.setLastName("Glinvane");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Axewwd");
        vet2.setLastName("Sassa");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
