package com.company.excercise2;
import com.company.excercise2.*;

public class Staff extends Person {
    private double salary;
    private String turno;

    public Staff() {
        super();
    }

    public Staff(String name, String lastName, String email, String adrres, double salary) {
        super(name, lastName, email, adrres);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salary=" + salary +
                ", turno='" + turno + '\'' +
                '}';
    }
}
