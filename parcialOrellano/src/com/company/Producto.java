package com.company;

public class Producto {
    private int Stock; //2
    private String nombre; //gaseosa
    private double precio; //2000

   // Producto p1 = new Producto(2,"gaseosa",2000);
    public Producto(){
}

    public Producto(int stock, String nombre, double precio) {
        Stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getStock() { //retorna el valor del atributo stock
        return Stock;
    }

    public void setStock(int stock) { //modifica el valor de la variable
        Stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() { //traer el valor de la variable
        return precio;
    }

    public void setPrecio(double precio) { //actualiza o pone el valor de la variable
        this.precio = precio;
    }

    public boolean existeStock(){
       if(this.getStock()>0){
           return true;
       }
       return false;
    }

    //quiero un metodo que me descuente en 1, la variable stock que tengo. 5 4
    public void descontarStock(){

        //int miStock= this.getStock();//2
        //miStock= miStock -1;
        //setStock(miStock);
        this.setStock(this.getStock()-1);
    }

    @Override
    public String toString() {
        return "producto{" +
                "Stock=" + Stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
