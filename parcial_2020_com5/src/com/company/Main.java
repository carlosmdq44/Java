package com.company;
import com.company.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Instrumento bateria1 = new bateria("dad",3,4);
        Instrumento bajo1 = new Bajo("adasda",100,"sss");
        Instrumento guitarraAcustica1= new GuitarraAcustica("s",2000,"nogal");
        Instrumento guitarraElectrica  = new GuitarraElectrica("ssss",300,"fofofo");

        ArrayList<Instrumento> listaInstrumento =new ArrayList<Instrumento>();
        listaInstrumento.add(bateria1);
        listaInstrumento.add(bajo1);
        listaInstrumento.add(guitarraAcustica1);
        listaInstrumento.add(guitarraElectrica);

        for(Instrumento inst:listaInstrumento){
            System.out.println(inst.toString());
        }
        ((GuitarraElectrica) guitarraElectrica).sonidoAmplificado();

        for(Instrumento inst:listaInstrumento){
            System.out.println("Elemnto "+inst.getMarca());
            System.out.println("Precio Actual "+inst.getPrecio());
            inst.aumentoPrecio();
            System.out.println("Precio con aumento "+inst.getPrecio());
        }
    }

}
