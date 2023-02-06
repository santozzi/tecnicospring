package com.bishop.market.controller;

import com.bishop.market.entities.articulo.Articulo;
import com.bishop.market.entities.articulo.computadora.Computadora;
import com.bishop.market.service.articulo.ArticuloServices;
import com.bishop.market.service.articulo.ComputadoraServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("articulos/computadoras")
public class ComputadoraController {
    @Autowired
    private ComputadoraServices computadoraServices;

    @GetMapping("all")
    @CrossOrigin
    public ResponseEntity<List<Computadora>> articulos(){
        return new ResponseEntity<>(computadoraServices.getAll(), HttpStatus.OK);
    }
    @PostMapping("save")
    public Computadora save(@RequestBody Computadora articulo){

        return  computadoraServices.save(articulo);
    }

}
