package com.utn.excercise1;
import java.util.Arrays;

import sun.security.krb5.internal.PAForUserEnc;

public class Book {
    /// VARIABLES
    private String title;
    private double stock;
    private int price;
    private Author[] authors;

    /// CONSTRUCTORES
    public Book(){
    }

    public Book(String title,double stock,int price,Author[] authors){
        this.title=title;
        this.stock=stock;
        this.price=price;
        this.authors=authors;
    }

    /// METODOS

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
