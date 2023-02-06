package com.bishop.market.service.articulo;

import com.bishop.market.entities.articulo.Articulo;
import com.bishop.market.entities.articulo.computadora.Computadora;
import com.bishop.market.model.crud.articulo.ArticuloCrudRepository;
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
