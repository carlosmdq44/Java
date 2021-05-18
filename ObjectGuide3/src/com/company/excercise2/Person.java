package com.company.excercise2;

public class Person {
    private String name;
    private String lastName;
    private String email;
    private String adrres;

    public Person(){
    }

    public Person(String name, String lastName, String email, String adrres) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.adrres = adrres;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdrres() {
        return adrres;
    }

    public void setAdrres(String adrres) {
        this.adrres = adrres;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", adrres='" + adrres + '\'' +
                '}';
    }

}
