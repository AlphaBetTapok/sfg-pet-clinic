package com.taranenkoant.sfgpetclinic.repositories;

import com.taranenkoant.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
