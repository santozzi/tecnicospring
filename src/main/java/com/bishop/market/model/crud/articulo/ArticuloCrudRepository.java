package com.bishop.market.model.crud.articulo;

import com.bishop.market.entities.articulo.Articulo;
import com.bishop.market.entities.articulo.computadora.Computadora;
import org.springframework.data.repository.CrudRepository;



public interface ArticuloCrudRepository extends CrudRepository<Articulo,Integer> {
}
