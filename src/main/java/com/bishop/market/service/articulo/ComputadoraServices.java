package com.bishop.market.service.articulo;

import com.bishop.market.entities.articulo.computadora.Computadora;
import com.bishop.market.model.crud.articulo.ComputadoraCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComputadoraServices {
    @Autowired
    private ComputadoraCrudRepository computadoraCrudRepository;
    public List<Computadora> getAll(){
        return (List<Computadora>)computadoraCrudRepository.findAll();

    }
    public Computadora save(Computadora articulo){
        return (Computadora) computadoraCrudRepository.save(articulo);
    }
}
