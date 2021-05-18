package com.company.excercise1;

public class Cylinder extends Circle {
    private double hight = 1.0;

    public Cylinder() {
        super();
    }

    public Cylinder(double radio, String colours, double hight) {
        super(radio, colours);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "Sub Class"+super.toString() +
                "hight=" + hight +
                '}';
    }

    public double cylinderArea(){
        return ((2*Math.PI*this.hight*super.getRadio())+(2*super.circleArea()));
    }

    public double cylinderVolumen(){
        return (super.circleArea()*this.hight);
    }
}
