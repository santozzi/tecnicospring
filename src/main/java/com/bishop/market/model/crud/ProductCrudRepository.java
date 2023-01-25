package com.bishop.market.model.crud;

import com.bishop.market.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductCrudRepository extends CrudRepository<Product,Integer> {
    //List<Product> findByIdCategoriaOrderByNombreAsc(int idCategoria);

}
