package com.company.excercise2;
import com.company.excercise2.*;

public class Students extends Person{
    private double yearsingreso;
    private double quota;
    private String career;

    public Students() {
        super();
    }

    public Students(String name, String lastName, String email, String adrres, double yearsingreso, double quota, String career) {
        super(name, lastName, email, adrres);
        this.yearsingreso = yearsingreso;
        this.quota = quota;
        this.career = career;
    }

    public double getYearsingreso() {
        return yearsingreso;
    }

    public void setYearsingreso(double yearsingreso) {
        this.yearsingreso = yearsingreso;
    }

    public double getQuota() {
        return quota;
    }

    public void setQuota(double quota) {
        this.quota = quota;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "Students{" +
                "SubClass "+super.toString()+
                "yearsingreso=" + yearsingreso +
                ", quota=" + quota +
                ", career='" + career + '\'' +
                '}';
    }
}
