package com.utn;
import com.utn.excercise1.Rectangle;
import com.utn.excercise2.Employee;
import com.utn.excercise3.Sales;
import com.utn.excercise4.Account;
import com.utn.excercise5.hour;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int excercise = 1;

        do {
            menu();
            System.out.println("Enter Exercise Number | 0 to exit.");
            excercise = scanner.nextInt();

            switch (excercise) {
                case 0:
                    System.out.println("execution completed");
                    break;
                case 1:
                    System.out.println("Excercise 1 - Rectangle");
                    Rectangle rectangle = new Rectangle();
                    System.out.println(rectangle);
                    rectangle.setLenght(2);
                    rectangle.setBroad(5);
                    System.out.println(rectangle);
                    System.out.println("AREA: " + rectangle.area());
                    System.out.println("Perimeter: " + rectangle.perimeter());
                    break;

                case 2:
                    System.out.println("Excercise 2 - Employee");
                    Employee employee1 = new Employee(23456345, "Carlos", "Gutierrez", 25000);
                    Employee employee2 = new Employee(34234123, "Ana", "Sanchez", 27500);
                    System.out.println("\nEMPLOYESS ");
                    System.out.println(employee1);
                    System.out.println(employee2);
                    System.out.println("Anual Salary, employee 1 " + employee1.anualSalary());
                    System.out.println("Anual Salary, employee 2 " + employee2.anualSalary());
                    System.out.println("Enter porcentage to increase");
                    double porc = scanner.nextDouble();
                    System.out.println("El sueldo aumento del empleado 1 dando un total de: " + employee1.increaseSalary(porc));
                    break;

                case 3:
                    System.out.println("Excercise 3 - Sales ");
                    Sales sale1 = new Sales(1, "sardina", 2, 30, 60);
                    System.out.println(sale1);
                    break;
                case 4:
                    System.out.println("Exercise 4 - Account");
                    Account account1 = new Account(1, "Carlos", 15000);
                    System.out.println(account1);
                    System.out.println("Deposit 2500: " + account1.credit(2500));
                    System.out.println("Extraction: 1500: " + account1.debit(1500));
                    System.out.println("Extraction: 30000: " + account1.debit(30000));
                    System.out.println(account1);

                    break;

                case 5:
                    System.out.println("Excercise 5 - Hours ");
                    hour hora = new hour(23, 59, 59);
                    System.out.println(hora.getHora());

                    hora.sumarSegundo();
                    System.out.println(hora.getHora());

                    hora.retrocederSegundo();
                    System.out.println(hora.getHora());

                    break;
            }
            System.out.println("Do you want to do another exercise? Press 0 to exit");
        } while (excercise != 0);
    }

    public static void menu() {
        System.out.println("[ 01 ] - Objeto Rectangle.");
        System.out.println("[ 02 ] - Objeto Employee.");
        System.out.println("[ 03 ] - Objeto Sales.");
        System.out.println("[ 04 ] - Objeto Account.");
        System.out.println("[ 05 ] - Objeto Hours.");
    }
}

