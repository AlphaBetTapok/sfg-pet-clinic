package com.taranenkoant.sfgpetclinic.services;

import com.taranenkoant.sfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
