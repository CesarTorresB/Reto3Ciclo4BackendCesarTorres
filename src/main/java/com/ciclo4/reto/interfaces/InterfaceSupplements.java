package com.ciclo4.reto.interfaces;

import com.ciclo4.reto.modelo.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceSupplements extends MongoRepository <Supplements, String>{
}
