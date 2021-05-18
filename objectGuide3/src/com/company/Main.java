package com.company;
import com.company.excercise1.*;
import com.company.excercise2.*;
import com.company.excercise3.*;

public class Main {

    public static void main(String[] args) {
        /// EJERCICIO NUMERO 1
/*
        Circle c1 = new Circle();
        Cylinder cy1 = new Cylinder();
        System.out.println(c1);
        System.out.println(cy1);
        System.out.println("Area: "+cy1.cylinderArea());
        System.out.println("Perimeter: "+cy1.cylinderVolumen());
        Cylinder cy2 = new Cylinder();
        cy2.setRadio(6);
        cy2.setHight(2.4);
        System.out.println(cy2);
        System.out.println("Area: "+cy2.cylinderArea());
        System.out.println("Perimeter: "+cy2.cylinderVolumen());
*/
        /// EJERCICIO NUMERO 2
     /*
        Students e1 = new Students("Carlos","Figueroa","carlos@hotmail.com","asd",2,2,"Programacion");
        Students e2 = new Students("Romina","Figueroa","carlos@hotmail.com","asd",2,2,"Programacion");
        Students e3 = new Students("Nicoles","Figueroa","carlos@hotmail.com","asd",2,2,"Programacion");
        Students e4 = new Students("Dolores","Figueroa","carlos@hotmail.com","asd",2,3,"Programacion");
        Staff st1 = new Staff("Dolores","Figueroa","carlos@hotmail.com","Rivadavia",22000);
        Staff st2 = new Staff("pepe","Figueroa","carlos@hotmail.com","Rivadavia",22000);
        Staff st3 = new Staff("res","Figueroa","carlos@hotmail.com","Rivadavia",22000);
        Staff st4 = new Staff("josefina","Figueroa","carlos@hotmail.com","Rivadavia",22000);
        Person [] institucion  = new Person[10];
        institucion[0] = e1;
        institucion[1] = e2;
        institucion[2] = e3;
        institucion[3] = e4;
        institucion[4] = st1;
        institucion[5] = st2;
        institucion[6] = st3;
        institucion[7] = st4;

        /// INSTANCEOFF
        int std = 0;
        int stf = 0;

        for(Person persona:institucion) {
                if (persona != null) {
                    if (persona instanceof Students) std++;
                    if (persona instanceof Staff) stf++;
                }
            }
        System.out.println("El total de estudiantes es: "+std);
        System.out.println("El total de Staff es: "+stf);

        int total=0;

        for(Person persona:institucion){
            if(persona!=null){
                if(persona instanceof Students){
                    total +=((Students)persona).getQuota();
                }
            }
        }
        System.out.println("Total de students: "+total);

        */
        /// EJERCICIO NUMERO 3
        Figuras circle = new Circulo("Red",2);
        Figuras rectangle = new Rectangulo("Negro",3,5);
        System.out.println(circle);
        System.out.println(rectangle);

        Figuras[] figurita = new Figuras[3];
        figurita[0] = circle;
        figurita[1]=rectangle;

    }
}
