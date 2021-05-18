package com.company.excercise3;

import com.company.excercise1.Circle;

public class Circulo extends Figuras {
    private double radio = 1.0;

    public Circulo() {
        super();
    }

    public Circulo(String colours, double radio) {
        super(colours);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", colours='" + colours + '\'' +
                '}';
    }

    @Override
    public double AreaCalculate() {
        return (Math.PI * Math.pow(this.radio, 2));
    }

    @Override
    public double PerimeterCalculate() {
        return (2 * Math.PI * this.radio);
    }
}
