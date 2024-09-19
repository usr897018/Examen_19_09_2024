package com.Corenetworks.Examen_19_09_2024.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="patrones")
public class Patron extends Persona{
    private double hrsnavegadas;
    private String titulo;
    private String Carnet;
}
