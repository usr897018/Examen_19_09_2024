package com.Corenetworks.Examen_19_09_2024.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="personas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {
    @Id
    private String dni;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(length = 120, nullable = false)
    private String direccion;
}
