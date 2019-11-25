package com.taranenkoant.sfgpetclinic.repositories;

import com.taranenkoant.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
