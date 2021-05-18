package com.company.productos;

public class Escritorios extends Muebles {
    private int alto;
    private int ancho;

    public Escritorios(int stock, String nombre, Double precio, String paisOrigen, String fecha, int alto, int ancho) {
        super(stock, nombre, precio, paisOrigen, fecha);
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorios{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                '}';
    }
}
