package com.ciclo4.reto.repositorio;


import com.ciclo4.reto.interfaces.InterfaceSupplements;
import com.ciclo4.reto.modelo.Supplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SupplementsRepositorio {
    @Autowired
    private InterfaceSupplements repository;

    public List<Supplements> getAll() {
        return repository.findAll();
    }

    public Optional<Supplements> getSupplements(String reference) {
        return repository.findById(reference);
    }

    public Supplements create(Supplements supplements) {
        return repository.save(supplements);
    }

    public void update(Supplements supplements) {
        repository.save(supplements);
    }

    public void delete(Supplements supplements) {
        repository.delete(supplements);
    }
}
