package com.bishop.market.model.crud.articulo;

import com.bishop.market.entities.articulo.computadora.Computadora;
import org.springframework.data.repository.CrudRepository;

public interface ComputadoraCrudRepository extends CrudRepository<Computadora,Integer> {
}
