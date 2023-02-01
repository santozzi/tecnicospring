package com.bishop.market.controller;

import com.bishop.market.entities.Articulo;

import com.bishop.market.entities.Product;
import com.bishop.market.service.ArticuloServices;
import com.bishop.market.service.ProductServices;
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
    public Articulo save(@RequestBody Articulo articulo){
            return  articuloServices.save(articulo);
    }


}
