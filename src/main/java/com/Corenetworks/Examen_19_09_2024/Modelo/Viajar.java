package com.Corenetworks.Examen_19_09_2024.Modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
public class Viajar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fsalida;
    private LocalTime hsalida;
    private String destino;

    @ManyToOne
    @JoinColumn(name = "barco_id")
    private Barco barco;

    @ManyToOne
    @JoinColumn(name = "patron_id")
    private Patron patron;  // Relación con la entidad Patron
}
