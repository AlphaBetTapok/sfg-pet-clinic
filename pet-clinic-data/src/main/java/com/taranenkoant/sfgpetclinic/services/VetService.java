package com.taranenkoant.sfgpetclinic.services;

import com.taranenkoant.sfgpetckinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
