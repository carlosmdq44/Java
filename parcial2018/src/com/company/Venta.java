package com.company;

import java.util.ArrayList;

public class Venta {
    private Cliente cliente;
    private ArrayList<Producto> listaProducto;
    private String medioPago;


    public Venta(Cliente cliente, ArrayList<Producto> listaProducto, String medioPago) {
        this.cliente = cliente;
        this.listaProducto = listaProducto;
        this.medioPago = medioPago;
      ;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }



    public double costoTotal(){
        double descuento = cliente.devolverDescuento();
        double suma =0;
        for(Producto pro:listaProducto){
            suma+= pro.getPrecioUnitario();
        }
        double total = suma - (suma * descuento/100);
        return total;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "cliente=" + cliente +
                ", listaProducto=" + listaProducto +
                ", medioPago='" + medioPago + '\''  +
                '}';
    }
}
