package com.bishop.market.entities.articulo.computadora;

import com.bishop.market.entities.articulo.Articulo;
import com.bishop.market.entities.articulo.clave.Clave;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "computadoras")

public class Computadora extends Articulo {


    private String so;
    private String informe;
    //  private List<Clave> claves;


    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }
}

