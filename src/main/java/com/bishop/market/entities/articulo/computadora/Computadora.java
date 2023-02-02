package com.bishop.market.entities.articulo.computadora;

import com.bishop.market.entities.articulo.Articulo;
import com.bishop.market.entities.articulo.clave.Clave;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
@Entity
@Table(name="computadoras")
public class Computadora extends Articulo {

    private String so;
    private String informe;
    private List<Clave> claves;
}
