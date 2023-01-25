package com.bishop.market.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table (name="archivos")
public class Archivo {
    @Id
    @Column(name = "id_archivos")

    private String id = UUID.randomUUID().toString();
    private String name;
    private int bytes;
    private String path;
    private String extension;
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return path+"/"+id+"."+extension;
    }
}
