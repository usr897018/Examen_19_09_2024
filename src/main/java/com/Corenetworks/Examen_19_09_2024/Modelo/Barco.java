package com.Corenetworks.Examen_19_09_2024.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="barcos")
public class Barco {
    @Id
    private String matricula;
    @Column(length = 60,nullable = false)
    private String amarre;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(nullable = false)
    private double cuota;

    @ManyToOne
    @JoinColumn(name="idsocio", nullable = false,
            foreignKey = @ForeignKey(name = "FK_socios_barcos"))
    private Socio s1;
}
