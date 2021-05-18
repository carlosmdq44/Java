package com.company.excercise3;

public class Rectangulo extends Figuras {
    private double alto = 1.0;
    private double largo = 1.0;

    public Rectangulo(){
        super();
    }

    public Rectangulo(String colours, double alto, double largo) {
        super(colours);
        this.alto = alto;
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "colours='" + colours + '\'' +
                ", alto=" + alto +
                ", largo=" + largo +
                '}';
    }

    @Override
    public double AreaCalculate(){
        return (this.largo+this.alto);
    }

    @Override
    public double PerimeterCalculate(){
        return (2*(this.alto+this.largo));
    }
}
