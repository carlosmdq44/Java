package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(1,"carlos","figueroa","123");
        Cliente cliente2 = new Empresa(2,"asda","asd","123","233232","asd");

        ArrayList<Cliente> arregloCliente = new ArrayList<Cliente>();
        arregloCliente.add(cliente);
        arregloCliente.add(cliente2);

        //Polimorfismo
        for (Cliente cli:arregloCliente) {
            System.out.println(cli.devolverDescuento());

        }


        Catalogo catalogo=new Catalogo();
        System.out.println(catalogo.listar());
        catalogo.eliminar("2a2s3d");
        System.out.println(catalogo.listar());
        System.out.println(catalogo.busqueda("4a2s3d"));

    }
}
