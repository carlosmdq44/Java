package com.company;

import java.util.ArrayList;

public class Catalogo {
       private ArrayList<Producto> listaProductos;


    public void cargarCatalago(){

        //viene de una db
        Producto p1 = new Producto("1a2s3d","Coca Cola","asd",12,10);
        Producto p2 = new Producto("2a2s3d","Coca Cola","gdf",4,4);
        Producto p3 = new Producto("3a2s3d","Coca Cola","acxzc",2,20);
        Producto p4 = new Producto("4a2s3d","Coca Cola","wedxs",15,12);
        Producto p5 = new Producto("5a2s3d","Coca Cola","cxvc",20,1);
        ArrayList<Producto> productos = new ArrayList<Producto>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        this.listaProductos=productos;
    }

    public Catalogo() {
       cargarCatalago();
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String listar() {
        /// con listar devuelve siempre string

        String listado="";

        for (Producto prod:listaProductos){
         listado += prod.toString() + "\n";
    }
        return listado;
    }

    public boolean eliminar(String codigoAlfanumerico){
        for(Producto prod:listaProductos){
            if(prod.getCodigo().equals(codigoAlfanumerico)){
                listaProductos.remove(prod);
                return true;
            }
        }
        return false;

    }

    public String busqueda(String codigoAlfanumerico){

        for(Producto prod:listaProductos){
            if(prod.getCodigo().equals(codigoAlfanumerico)){

               return prod.toString();
            }
        }
        return "";
    }

        @Override
    public String toString() {
        return "Catalogo{" +
                "listaProductos=" + listaProductos +
                '}';
    }
}
