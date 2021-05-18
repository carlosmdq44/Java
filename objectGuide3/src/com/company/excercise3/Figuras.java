package com.company.excercise3;
import com.company.excercise3.*;

public abstract class Figuras {
    protected String colours;

    public Figuras(){
    }

    public Figuras(String colours) {
        this.colours = colours;
    }

    public String getColours() {
        return colours;
    }

    public void setColours(String colours) {
        this.colours = colours;
    }

    @Override
    public String toString() {
        return "Figuras{" +
                "colours='" + colours + '\'' +
                '}';
    }

    public abstract double AreaCalculate();
    public abstract double PerimeterCalculate();

}
