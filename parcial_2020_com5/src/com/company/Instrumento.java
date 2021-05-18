package com.company;

public abstract class Instrumento {
    private String marca;
    private double precio;

    public Instrumento(String marca) {
        this.marca = marca;
    }

    public Instrumento(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio){

     this.precio=precio;
    }

    public abstract void aumentoPrecio();

    @Override
    public String toString() {
        return "Instrumento{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
