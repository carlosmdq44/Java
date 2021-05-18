package com.company;
import com.company.*;
import com.sun.security.ntlm.Client;

import java.awt.*;
import java.util.Scanner;

public class Main {

   static Cliente[] clientes;

   static Producto[] productos;

    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);
        int cantidadClientes;
        ClienteParticular[] cliente = new ClienteParticular[cantidadClientes];

        for(int i=0;i<cliente.length;i++){
            System.out.println("Ingrese nombre: ");
            String nombre = sc.next();

            System.out.println("Ingrese direccion: ");
            String direccion = sc.next();

            System.out.println("Ingrese Telefono");
            int telefono = sc.nextInt();

            ClienteParticular c = new ClienteParticular(nombre,direccion,telefono);
            cliente[i] = c;
        */
 //Pedido armarPedido = new Pedido()
        Cliente c1 = new ClienteParticular(1,"Rivadavia",493213,"Carlos");
        Cliente c2 = new ClienteParticular(2,"bELGRANO",493213,"Josefina");
        Cliente c3 = new ClienteParticular(3,"Colon",493213,"Juan");
        Cliente c4 = new ClienteEmpresa(4,"san martin",2932932,"mtm");
        Cliente c5 = new ClienteEmpresa(5,"Luro",2932932,"pepe");
        Cliente c6 = new ClienteEmpresa(6,"9 de julio",2932932,"zxe");

        clientes = new Cliente[]{c1, c2, c3, c4, c5, c6}; //este arreglo solo es visible para el metodo main

        Producto p1 = new Producto(2,"gaseosa",2000); //p1 objeto
        Producto p2 = new Producto(7,"galletitas",90);
        Producto p3 = new Producto(9,"caramelos",3600);
        Producto p4 = new Producto(1,"alfajor",100);
        Producto p5 = new Producto(13,"cerveza",50);

        productos = new Producto[]{p1, p2, p3, p4, p5};

        double[] promedio = new double[5];

        Cliente[] client = new Cliente[5]; //c1.id=1,c3,c3,c3,c2
        //arreglo simpleint[] idcliente = new int[5]
        //el cliente con id = 1, en cuantos pedidos esta?
        int[] idcliente = new int[5];


        for(int i=0;i<5;i++){
        System.out.println("Ingrese id del cliente");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        Cliente buscarCliente= devolverCLiente(id);

        client[i]=buscarCliente; /// guardamos los clientes

        System.out.println("Ingrese cantidad productos");
        int cantProducto=sc.nextInt();
        Producto[] productosCliente=new Producto[cantProducto];

        for (int j=0; j<cantProducto;j++){

            System.out.println("Ingrese el nombre del producto");
            String productoPedido=sc.next();
            Producto buscarProducto = devolverProducto(productoPedido);
            if (buscarProducto != null){
                productosCliente[j] = buscarProducto;
            }

        }

        System.out.println("Ingrese cantidad KM");
        int cantKm=sc.nextInt();

        Pedido pedido1 = new Pedido(buscarCliente,productosCliente,cantKm);
        System.out.println("Costo total: "+pedido1.calcularCostoTotal());
        promedio[i]= pedido1.calcularCostoTotal();
        System.out.println("Desea confirmar SI/NO ");
        String  confirmacion = sc.next();
        if(confirmacion.equals("SI")){
            System.out.println("Se confirma pedido");

            for (Producto producto:pedido1.getProducto()) {

                if (producto.existeStock()){

                    producto.descontarStock();
                }
            }

        }else{
            System.out.println("Pedido Rechazado");
        }
        }

        double total=0;

        for(int k=0;k<promedio.length;k++){
            total+= promedio[k];
        }
        double prom = total/5;

        System.out.println("El promedio total es: "+prom);
        //System.out.println( buscarCliente.toString());

        for(int i=0;i<5;i++){
            int sum = 0;
           for(int k=0; k<5;k++){

               if(client[k].getId()==(i+1)){
                   sum++;
               }

           }
            idcliente[i]=sum;

        }

        int max=0;
        int posicion=0;
        //[1,1,3,0,0]
        for(int l =0; l<idcliente.length; l++){
            if(idcliente[l]>max){
                max=idcliente[l];
                posicion=l+1;

            }

        }

        for (Cliente _cli:clientes) {
            if(_cli.getId()==posicion){
                System.out.println("El cliente con mas pedidos es: " +_cli.toString());
                break;
            }
        }




    } //Si hay un metodo estatico en una clase, todos los metodos staticos


    public static Cliente devolverCLiente(int id){

        //REgla basica... Si tenemos un arreglo, un arreglo es un contenedor de objetes

        for (Cliente cli :clientes  ) {

            if(cli.id == id){
                return cli;
            }
        }

        return null;
    }

    public static Producto devolverProducto(String nombre){
        for(Producto pro:productos){
            if(pro.getNombre().equals(nombre)){
                return pro;
            }

        }
        return null;
    }

}
