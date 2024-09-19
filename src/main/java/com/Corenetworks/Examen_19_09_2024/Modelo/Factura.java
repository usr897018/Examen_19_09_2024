package com.Corenetworks.Examen_19_09_2024.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Factura {

    @Autowired
    @Qualifier("IvaGeneral")
    private Iimpuesto impuesto;
    private List<Producto> productos;

    public double calcularTotalFactura()
    {
        double precioTotal = 0;
        for(Producto elemento:productos)
        {
            precioTotal += impuesto.calcularImpuesto(elemento);
        }
        return precioTotal;
    }

}
