package com.Corenetworks.Examen_19_09_2024;

import com.Corenetworks.Examen_19_09_2024.Modelo.Factura;
import com.Corenetworks.Examen_19_09_2024.Modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Examen19092024Application implements CommandLineRunner {
	@Autowired
	Factura nuevaFactura;
	public static void main(String[] args) {
		SpringApplication.run(Examen19092024Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Producto> productos = new ArrayList<>();
		Producto p1 = new Producto("Manzana",15);
		Producto p2 = new Producto("Platano",5);
		productos.add(p1);
		productos.add(p2);
		nuevaFactura.setProductos(productos);
		for(Producto elemento:productos)
		{
			System.out.println(elemento.getNombre() + " --------- " + elemento.getPrecio());
		}
		System.out.println("Iva del 21%");
		System.out.println("Total a Pagar: " + nuevaFactura.calcularTotalFactura());
	}
}
