package com.bishop.market.controller;

import com.bishop.market.entities.Archivo;
import com.bishop.market.service.FileServices;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("files")
public class FileController {
   @Autowired
    private FileServices fileServices;
    @GetMapping("all")
    @CrossOrigin
    public ResponseEntity<List<Archivo>> files(){
        return new ResponseEntity<>(fileServices.getAll(), HttpStatus.OK);
    }
    @GetMapping("allurl")
    @CrossOrigin
    public ResponseEntity<List<String>> filesUrl(){
        List<Archivo> archivos= fileServices.getAll();
        List<String> urls = new ArrayList<String>();
        for (Archivo archivo: archivos) {
            urls.add(archivo.toString());
        }
        return new ResponseEntity<>(urls, HttpStatus.OK);
    }
    @GetMapping("all/{id}")
    @CrossOrigin
    public ResponseEntity<Archivo> get(@PathVariable String id){
        return new ResponseEntity<>(fileServices.get(id).get(), HttpStatus.OK);
    }
    @GetMapping("geturl/{id}")
    @CrossOrigin
    public ResponseEntity<String> getUrl(@PathVariable String id){
        Archivo archivo = fileServices.get(id).get();

        return new ResponseEntity<String>(archivo.toString(), HttpStatus.OK);
    }

    @PostMapping("save")
    public ResponseEntity<Archivo> save(@RequestBody Archivo archivo){
        return new ResponseEntity<>(fileServices.save(archivo),HttpStatus.OK);
    }
    @PostMapping("img/{category}")
    @CrossOrigin
    public ResponseEntity<Archivo> uploadImage (@RequestParam("file") MultipartFile imagen,@PathVariable("category") String category){

        Path directorioImage = Paths.get("src//main//resources//static//images//"+category);
        String rutaAbsuluta = directorioImage.toFile().getAbsolutePath();
        Archivo archivo;
        try {
            byte[] bytesImg = imagen.getBytes();
            String extension = imagen.getContentType().split("/")[1];
            if(extension.equals("jpeg")||extension.equals("png")) {
                Path rutaCompleta = Paths.get(rutaAbsuluta + "//" + imagen.getOriginalFilename());
                archivo = new Archivo();
                archivo.setBytes((int) imagen.getSize());
                archivo.setName(imagen.getOriginalFilename());
                archivo.setPath("images/"+category);
                archivo.setExtension("jpg");
                archivo.setCategory(category);
                archivo = fileServices.save(archivo);
                rutaCompleta = Paths.get(rutaAbsuluta + "//" + archivo.getId().toString() + ".jpg");
                //System.out.println(archivo);

                Files.write(rutaCompleta, bytesImg);
                return new ResponseEntity<>(archivo,HttpStatus.CREATED);

            }
        }catch(IOException e){
            System.out.println(e);
        }

        return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
    }
    @DeleteMapping("delete/{id}")
    @CrossOrigin
    public void delete (@PathVariable String id){
        Optional<Archivo> archivo = fileServices.get(id);
        if((archivo.isPresent())) {
            Path directorioImage = Paths.get("src//main//resources//static//"+archivo.get().toString());
            System.out.println(directorioImage);
            try {
                Files.delete(directorioImage);
                fileServices.delete(id);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
