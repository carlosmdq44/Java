package com.company;
import java.util.UUID;

public class Producto {
    ///Producto(codigo,nombre,marca,precioUnitario,Stock)
    private String codigo;
    private String nombre;
    private String marca;
    private double precioUnitario;
    private int Stock;

    public Producto(String codigo, String nombre, String marca, double precioUnitario, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        Stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", Stock=" + Stock +
                '}';
    }
}
