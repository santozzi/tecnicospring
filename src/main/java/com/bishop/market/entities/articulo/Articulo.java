package com.bishop.market.entities.articulo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "articulos")
public class Articulo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String tipo;
    private String marca;
    private String modelo;

    private String serieProv;

    private String serieDef;

    private String aCargoDe;
    private Date ingreso;
    private String detalle;

    public Long getId() {
        return id;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setId(Long id) {
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
