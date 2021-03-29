package com.utn;
import java.util.Arrays;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import com.utn.excercise1.Author;
import com.utn.excercise1.Book;
import com.utn.excercise2.Client;
import com.utn.excercise2.ItemSale;
import com.utn.excercise2.Bill;
import com.utn.excercise3.Account;
import com.utn.excercise3.ClientAccount;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int excercise = 1;

        do {
            menu();
            System.out.println("Enter Excercise Numer o 0 to Exit");
            excercise = scanner.nextInt();

            switch (excercise){
                case 0:
                    System.out.println("Execution completed");
                    break;
                case 1:
                    System.out.println("Excercise 1 - Authors");
                    Author Jblonch = new Author("Joshua", "Bloch", "joshua@email.com", 'M');
                    System.out.println(Jblonch);
                    Author[] authors = new Author[2];
                    authors[0] = Jblonch;
                    Book eJava = new Book("effective Java", 150, 450, authors);
                    System.out.println(eJava);
                    eJava.setPrice(500);
                    eJava.setStock(500);
                    System.out.println(eJava);
                    break;

                case 2:
                    Client client1 = new Client("Carlos","med_msad@gfs.com",30);
                    System.out.println(client1);
                    ItemSale item1 = new ItemSale("galletita","chocolate",2,3);
                    ItemSale item2 = new ItemSale("sopa","liquida",12,8);
                    ItemSale item3 = new ItemSale("gelatina","chocolate",4,32);
                    ItemSale[] itemss = new ItemSale[3];
                    itemss[0]=item1;
                    itemss[1]=item2;
                    itemss[2]=item3;
                    Bill bill = new Bill(client1,itemss);
                    System.out.println(client1);
                    break;

                case 3:
                    ClientAccount client1biz = new ClientAccount("carlos",'m');
                    Account account1Biz = new Account(client1biz,10000);
                    System.out.println(account1Biz);
                    System.out.println("\nDeposito 150.50, el balance es " + account1Biz.depositar(150.50) + "\n");
                    System.out.println("Retiro 150, el balance es " + account1Biz.extraer(150) + "\n");
                    System.out.println("Retiro 11000.50, el balance es " + account1Biz.extraer(11000.50) + "\n");
                    System.out.println("Deposito 1250.50, el balance es " + account1Biz.depositar(1250.50) + "\n");

                    break;
            }
            System.out.println("Do you want to do another exercise? Press 0 to exit");
        } while (excercise != 0);
    }

    public static void menu() {
        System.out.println("[ 01 ] - Objeto Book / Authors");
        System.out.println("[ 02 ] - Objeto Client - Bill - ItemSale.");
        System.out.println("[ 03 ] - Objeto .");
    }
}