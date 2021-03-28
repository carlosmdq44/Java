package com.utn.excercise1;

public class Rectangle {
    private double broad=1.0;
    private double lenght=1.0;
    
    public Rectangle(){
    }

    public Rectangle(double broad, double lenght){
        this.broad=broad;
        this.lenght=lenght;
    }

    public double getBroad() {
        return broad;
    }

    public void setBroad(double broad) {
        this.broad = broad;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public  double area(){
        return broad*lenght;
    }
    public double perimeter(){
        return 2*(broad+lenght);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "broad=" + broad +
                ", lenght=" + lenght +
                '}';
    }
}
