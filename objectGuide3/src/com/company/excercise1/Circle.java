package com.company.excercise1;

public class Circle {
    private double radio = 1.0;
    private String colours = "Red";

    public Circle(){
    }

    public Circle(double radio, String colours) {
        this.radio = radio;
        this.colours = colours;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColours() {
        return colours;
    }

    public void setColours(String colours) {
        this.colours = colours;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", colours='" + colours + '\'' +
                '}';
    }

    public double circleArea(){
        return 2*Math.PI*Math.pow(radio,2);
    }
}
