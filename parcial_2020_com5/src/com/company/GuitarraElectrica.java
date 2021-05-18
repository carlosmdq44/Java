package com.company;

public class GuitarraElectrica extends Cuerda implements sonido{
    private int cantidadCuerdas = 6;
    private String modelo;
    private final double aumento = 5;

    public GuitarraElectrica(String marca,double Precio, String modelo) {
        super(marca, Precio);
        this.setCantidadCuerdas(cantidadCuerdas);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "GuitarraElectrica{" +
                "cantidadCuerdas=" + cantidadCuerdas +
                ", cantidadCuerdas=" + cantidadCuerdas +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void aumentoPrecio(){
        this.setPrecio(this.getPrecio()*(1.05));
    }

    @Override
    public String sonidoAmplificado() {
        return "Sonido Amplificado";
    }
}
