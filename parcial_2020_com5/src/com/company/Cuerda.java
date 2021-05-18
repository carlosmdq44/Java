package com.company;

public abstract class Cuerda extends Instrumento{

    protected int cantidadCuerdas;

    public Cuerda(String marca, double precio) {
        super(marca,precio);
        this.cantidadCuerdas = cantidadCuerdas;
    }

    public int getCantidadCuerdas() {
        return cantidadCuerdas;
    }

    public void setCantidadCuerdas(int cantidadCuerdas) {
        this.cantidadCuerdas = cantidadCuerdas;
    }

    public abstract void aumentoPrecio();

    @Override
    public String toString() {
        return "Cuerda{" +
                "cantidadCuerdas=" + cantidadCuerdas +
                '}';
    }
}
