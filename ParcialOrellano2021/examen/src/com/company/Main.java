package com.company;

import com.company.productos.Escritorios;
import com.company.productos.Impresoras;
import com.company.productos.Notebooks;
import com.company.productos.Productos;
import com.company.productos.Sillas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Creo las instancias
        Sillas sillas = new Sillas(10, "Gam800", 18000., "UK", "14/7", true);
        Escritorios escritorios = new Escritorios(15, "juan", 2000., "Argentina", "", 10, 15);

        Notebooks notebooks = new Notebooks(30, "dell", 6500.0, "dell", 24);
        Impresoras impresoras = new Impresoras(15, "Brother", 1500., "Brother", 500);
        // Genero mi lista de productos
        List<Productos> inventario = new ArrayList<>();

        inventario.add(sillas);
        inventario.add(escritorios);
        inventario.add(notebooks);
        inventario.add(impresoras);

        // Printeo
        for (Productos p : inventario) {
            if (p instanceof Sillas) {
                System.out.println("Soy silla no te sientes");
            } else if (p instanceof Escritorios) {
                System.out.println("Soy escritorio no apoyes tazas");
            } else if (p instanceof Notebooks) {
                System.out.println("Soy Notebook comprate una Mac");
            } else {
                System.out.println("Soy una impresora a laser");
            }
        }

        // Aplicamos el descuento especial en Silla e impresora

        System.out.println("\nAplicando descuento especial:\n");
        System.out.println(sillas);
        System.out.println("Descuento especial 15%. Nuevo precio: " + sillas.precioDescuento(15));
        System.out.println(impresoras);
        System.out.println("Descuento especial 20%. Nuevo precio: " + impresoras.precioDescuento(20));

        // Actualizamos los precios con el nuevo aumento.

        System.out.println("\nActualizando valores...\n");

        for (Productos p : inventario) {
            p.actualizarPrecio();
        }
    }
}
