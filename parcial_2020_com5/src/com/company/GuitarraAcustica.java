package com.company;

public class GuitarraAcustica extends Cuerda implements sonido {
    private final int cantCuerda = 6;
    private String madera;
    private final double aumento = 10;


    public GuitarraAcustica(String marca,double Precio, String madera) {
        super(marca,Precio); //creas la clase padre
        this.setCantidadCuerdas(cantCuerda);// seteas el atributo despues
        this.madera = madera;
    }

    public String getMadera() {
        return madera;
    }

    public void setMadera(String madera) {
        this.madera = madera;
    }

    @Override
    public String toString() {
        return "GuitarraAcustica{" +
                "cantidadCuerdas=" + cantidadCuerdas +
                ", cantCuerda=" + cantCuerda +
                ", madera='" + madera + '\'' +
                '}';
    }
    public void aumentoPrecio(){
        this.setPrecio(this.getPrecio()*(1.10));
    }

    @Override
    public String sonidoAmplificado() {
        return "Sonido Amplificado";
    }
}
