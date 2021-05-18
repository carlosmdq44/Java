package com.company;

public class Bajo extends Cuerda{
    private String modelo;
    private final int cantCuerda = 4;
    private final double aumento = 20;

    public Bajo(String marca,double Precio, String modelo) {
        super(marca,Precio);
        this.modelo = modelo;
        this.setCantidadCuerdas(cantCuerda);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantCuerda() {
        return cantCuerda;
    }
    public void aumentoPrecio(){
       this.setPrecio(this.getPrecio()*(1.20));
    }


    @Override
    public String toString() {
        return "Bajo{" +
                "modelo='" + modelo + '\'' +
                ", cantCuerda=" + cantCuerda +
                ", cantidadCuerdas=" + cantidadCuerdas +
                '}';
    }
}
