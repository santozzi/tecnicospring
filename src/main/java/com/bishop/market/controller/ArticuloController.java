package com.bishop.market.controller;

import com.bishop.market.entities.articulo.Articulo;

import com.bishop.market.entities.articulo.computadora.Computadora;
import com.bishop.market.service.articulo.ArticuloServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("articulos")
public class ArticuloController {



        @Autowired
        private ArticuloServices articuloServices;

        @GetMapping("all")
        @CrossOrigin
        public ResponseEntity<List<Articulo>> articulos(){

            return new ResponseEntity<>(articuloServices.getAll(), HttpStatus.OK);
        }

    @PostMapping("save")
    public Articulo save(@RequestBody Computadora articulo){
            return  articuloServices.save(articulo);
    }


}
