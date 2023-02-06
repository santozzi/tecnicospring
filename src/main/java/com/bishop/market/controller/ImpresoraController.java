package com.bishop.market.controller;

import com.bishop.market.entities.articulo.Impresora;
import com.bishop.market.entities.articulo.computadora.Computadora;
import com.bishop.market.service.articulo.ComputadoraServices;
import com.bishop.market.service.articulo.ImpresoraServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("articulos/impresoras")
public class ImpresoraController {
    @Autowired
    private ImpresoraServices impresoraServices;

    @GetMapping("all")
    @CrossOrigin
    public ResponseEntity<List<Impresora>> articulos(){
        return new ResponseEntity<>(impresoraServices.getAll(), HttpStatus.OK);
    }
    @PostMapping("save")
    public Impresora save(@RequestBody Impresora articulo){

        return  impresoraServices.save(articulo);
    }
}
