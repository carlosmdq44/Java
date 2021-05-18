package com.company;
import com.company.*;

import java.util.Arrays;

public class Pedido {
    private Cliente cliente;
    private Producto[] producto;
    private int cantidadKm;
    private final double precioKm=5;

    public Pedido(Cliente cliente, Producto[] producto, int cantidadKm) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidadKm = cantidadKm;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

    public int getCantidadKm() {
        return cantidadKm;
    }

    public void setCantidadKm(int cantidadKm) {
        this.cantidadKm = cantidadKm;
    }

    public double getPrecioKm() {
        return precioKm;
    }

    public double calcularCostoEnvio(){
        return this.precioKm*this.cantidadKm;
    }

    public double calcularCostoTotal(){
        return this.calcularCostoEnvio() + calcularCostoProductos();
    }

    public double calcularCostoProductos(){

        double total = 0;
        for(Producto produc:producto){
            total += produc.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", producto=" + Arrays.toString(producto) +
                ", cantidadKm=" + cantidadKm +
                ", precioKm=" + precioKm +
                '}';
    }
}
