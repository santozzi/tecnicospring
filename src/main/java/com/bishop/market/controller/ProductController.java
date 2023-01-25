package com.bishop.market.controller;

import com.bishop.market.entities.Product;
import com.bishop.market.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    private ProductServices productServices;

    @GetMapping("all")
    @CrossOrigin
    public ResponseEntity<List<Product>> productos(){

        return new ResponseEntity<>(productServices.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public Product productById(@PathVariable("id") int id){
        if(productServices.get(id).isPresent())
            return productServices.get(id).get();
        else
            return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") int id){
        if(productServices.delete(id)){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity edit (@PathVariable("id") int id,@RequestBody Product product){
         if(productServices.update(id,product)){
             return new ResponseEntity(HttpStatus.OK);
         }else{
             return new ResponseEntity(HttpStatus.NOT_FOUND);
         }
    }
    @PostMapping("save")
    public ResponseEntity<Product> save (@RequestBody Product product){

    return new ResponseEntity<Product>(productServices.save(product),HttpStatus.OK);

    }

}
