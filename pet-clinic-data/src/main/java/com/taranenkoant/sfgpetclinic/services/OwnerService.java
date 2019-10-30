package com.taranenkoant.sfgpetclinic.services;

import com.taranenkoant.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
