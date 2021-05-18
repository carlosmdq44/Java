package com.company.productos;

public class Notebooks extends Informaticos {

    private int gbRam;

    public Notebooks(int stock, String nombre, Double precio, String fabricante, int gbRam) {
        super(stock, nombre, precio, fabricante);
        this.gbRam = gbRam;
    }

    public int getGbRam() {
        return gbRam;
    }

    public void setGbRam(int gbRam) {
        this.gbRam = gbRam;
    }

    @Override
    public String toString() {
        return super.toString() + "Notebooks{" +
                "gbRam=" + gbRam +
                '}';
    }
}
