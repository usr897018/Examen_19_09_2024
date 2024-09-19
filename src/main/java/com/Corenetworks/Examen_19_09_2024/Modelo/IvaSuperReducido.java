package com.Corenetworks.Examen_19_09_2024.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data
@Component("IvaSuperReducido")

public class IvaSuperReducido implements Iimpuesto{
    private final double tasaIva = 1.04;
    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio()*tasaIva;
    }
}
