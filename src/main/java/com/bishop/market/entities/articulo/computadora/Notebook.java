package com.bishop.market.entities.articulo.computadora;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "notebooks")
public class Notebook extends Computadora{
    private String pantalla;
}
