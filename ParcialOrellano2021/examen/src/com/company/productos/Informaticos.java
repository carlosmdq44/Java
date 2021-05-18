package com.company.productos;

public abstract class Informaticos extends Productos {
    protected String fabricante;

    public Informaticos(int stock, String nombre, Double precio, String fabricante) {
        super(stock, nombre, precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return super.toString() + "Informaticos{" +
                "fabricante='" + fabricante + '\'' +
                '}';
    }
}
