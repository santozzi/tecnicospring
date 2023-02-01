package com.bishop.market.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="articulos")
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_articulos")
    private int id;
    private String tipo;
    private String marca;
    private String modelo;
    @Column(name="serie_prov")
    private String serieProv;
    @Column(name="serie_def")
    private String serieDef;
    @Column(name="a_cargo_de")
    private String aCargoDe;
    private Date ingreso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerieProv() {
        return serieProv;
    }

    public void setSerieProv(String serieProv) {
        this.serieProv = serieProv;
    }

    public String getSerieDef() {
        return serieDef;
    }

    public void setSerieDef(String serieDef) {
        this.serieDef = serieDef;
    }

    public String getaCargoDe() {
        return aCargoDe;
    }

    public void setaCargoDe(String aCargoDe) {
        this.aCargoDe = aCargoDe;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }
}
