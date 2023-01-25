package com.bishop.market.service;

import com.bishop.market.entities.Product;
import com.bishop.market.model.crud.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {
    @Autowired
    private ProductCrudRepository productCrudRepository;
    public List<Product> getAll(){
        return (List<Product>)productCrudRepository.findAll();

    }
    public Optional<Product> get(int id)
    {
       return productCrudRepository.findById(id);
    }


    public boolean delete(int id){
        boolean toReturn = false;
        Product producto = get(id).get();
        if(producto!=null){
            productCrudRepository.delete(producto);
            toReturn = true;
        }
        return toReturn;
    }
    public boolean update(int id, Product product){
        boolean aRetornar = false;
        System.out.println(get(id).isPresent());
        if(get(id).isPresent()){
            aRetornar= true;
            productCrudRepository.save(product);
        }
        return aRetornar;
    }
    public Product save(Product product){
           return  productCrudRepository.save(product);
    }


}
