package com.bishop.market.service;

import com.bishop.market.entities.Articulo;
import com.bishop.market.model.crud.ArticuloCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloServices {

    @Autowired
    private ArticuloCrudRepository articuloCrudRepository;
    public List<Articulo> getAll(){
        return (List<Articulo>)articuloCrudRepository.findAll();

    }
    public Articulo save(Articulo articulo){
        return (Articulo) articuloCrudRepository.save(articulo);
    }

}
