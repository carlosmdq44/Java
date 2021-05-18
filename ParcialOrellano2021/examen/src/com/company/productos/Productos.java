package com.company.productos;

public abstract class Productos {
    protected int stock;
    protected String nombre;
    protected Double precio;

    public Productos(int stock, String nombre, Double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void actualizarPrecio() {
        if (this instanceof Sillas) {
            System.out.println("Sillas precio actual: " + this.precio);
            this.precio = this.precio * 1.1;
        } else if (this instanceof Escritorios) {
            System.out.println("Escritorios precio actual: " + this.precio);
            this.precio = this.precio * 1.2;
        } else if (this instanceof Notebooks) {
            System.out.println("Notebooks precio actual: " + this.precio);
            this.precio = this.precio * 1.3;
        } else {
            System.out.println("Impresora precio actual: " + this.precio);
            this.precio = this.precio * 1.4;
        }
        System.out.println("Precio actualizado: " + this.precio);
    }

    @Override
    public String toString() {
        return "Productos{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
