package com.bishop.market.model.crud.articulo;

import com.bishop.market.entities.articulo.Impresora;
import com.bishop.market.entities.articulo.computadora.Computadora;
import org.springframework.data.repository.CrudRepository;

public interface ImpresoraCrudRepository extends CrudRepository<Impresora,Integer> {

}
