package com.bishop.market.model.crud;

import com.bishop.market.entities.Archivo;
import org.springframework.data.repository.CrudRepository;

public interface FileCrudRepository extends CrudRepository<Archivo, String> {
    //metodos espesificos
}
