package com.bishop.market.model.crud;

import com.bishop.market.entities.articulo.Articulo;
import org.springframework.data.repository.CrudRepository;

public interface ArticuloCrudRepository extends CrudRepository<Articulo,Integer> {
}
