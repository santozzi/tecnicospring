package com.bishop.market.service;

import com.bishop.market.entities.Archivo;
import com.bishop.market.model.crud.FileCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FileServices {
    @Autowired
    private FileCrudRepository fileCrudRepository;

    public List<Archivo> getAll(){
        return (List<Archivo>) fileCrudRepository.findAll();
    }
    public Archivo save(Archivo file){
        return (Archivo) fileCrudRepository.save(file);
    }
    public Optional<Archivo> get(String id){
        return fileCrudRepository.findById(id);
    }
    public boolean delete(String id){
        boolean existe = false;
        if(get(id).isPresent()){
            fileCrudRepository.deleteById(id);
            existe = true;
        }
        return existe;
    }
}
