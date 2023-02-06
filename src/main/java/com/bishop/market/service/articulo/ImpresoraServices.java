package com.bishop.market.service.articulo;

import com.bishop.market.entities.articulo.Impresora;
import com.bishop.market.entities.articulo.computadora.Computadora;
import com.bishop.market.model.crud.articulo.ComputadoraCrudRepository;
import com.bishop.market.model.crud.articulo.ImpresoraCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpresoraServices {
    @Autowired
    private ImpresoraCrudRepository impresoraCrudRepository;
    public List<Impresora> getAll(){
        return (List<Impresora>)impresoraCrudRepository.findAll();

    }
    public Impresora save(Impresora articulo){
        return (Impresora) impresoraCrudRepository.save(articulo);
    }
}
