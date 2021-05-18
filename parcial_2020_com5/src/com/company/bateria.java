package com.company;

public class bateria extends Instrumento{
    private int cantTambores;
    private int cantPlatillos;
    private final int precioTambor=3000;
    private final int precioPlatillo=2000;
    private final double aumento = 15;


    public bateria(String marca, int cantTambores, int cantPlatillos) {


        super(marca);

        if(cantTambores>=3 && cantPlatillos>=1 && cantPlatillos<=5){
            this.cantTambores = cantTambores;
            this.cantPlatillos = cantPlatillos;
            this.setPrecio(calcularPrecio(cantTambores,cantPlatillos));
        }


    }



    private double calcularPrecio(int cantTambores, int cantPlatillos){
        return ((cantTambores*precioTambor) + (cantPlatillos*precioPlatillo));
    }

    public int getCantTambores() {
        return cantTambores;
    }

    public void setCantTambores(int cantTambores) {
        if(cantTambores>=3) {
            this.cantTambores = cantTambores;
        }
    }

    public int getCantPlatillos() {
            return cantPlatillos;
    }

    public void setCantPlatillos(int cantPlatillos) {
        if(cantPlatillos>=1 && cantPlatillos<=5) {
            this.cantPlatillos = cantPlatillos;
        }
    }

    public void aumentoPrecio(){
        this.setPrecio(this.getPrecio()*(1.15));
    }

    @Override
    public String toString() {
        return "bateria{" +
                "cantTambores=" + cantTambores +
                ", cantPlatillos=" + cantPlatillos +
                ", precioTambor=" + precioTambor +
                ", precioPlatillo=" + precioPlatillo +
                '}';
    }
}
