package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Alquiler {

    public static int cont = 0;

    private int id;
    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDate fechaRetiro;
    private LocalDate fechaDevolucion;


    /** CONSTRUCTORES **/
    public Alquiler() {
        this.id = cont++;
    }

    public Alquiler(int id, Cliente cliente, Pelicula pelicula, LocalDate fechaRetiro, LocalDate fechaDevolucion) {
        this.id = id;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fechaRetiro = fechaRetiro;
        this.fechaDevolucion = fechaDevolucion;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Alquiler.cont = cont;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(LocalDate fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", pelicula=" + pelicula +
                ", fechaRetiro=" + fechaRetiro +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
