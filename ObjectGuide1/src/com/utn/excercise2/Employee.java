package com.utn.excercise2;

public class Employee {
    private double dni;
    private String name;
    private String lastName;
    private double salary;

    public Employee(){
    }

    public Employee(double dni,String name,String lastName,double salary){
        this.dni=dni;
        this.name=name;
        this.lastName=lastName;
        this.salary=salary;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double increaseSalary(double porcent){
        return this.salary*porcent*100;
    }

    public double anualSalary(){
        return this.salary*12;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

}
