package com.bishop.market.entities.articulo;

import com.bishop.market.entities.articulo.computadora.Computadora;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="impresoras")
public class Impresora extends Articulo {
    //si es multifuncion, color, laser, etc
    private String tipoImpresora;


}
