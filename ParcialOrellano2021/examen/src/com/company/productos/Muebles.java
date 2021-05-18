package com.company.productos;

public abstract class Muebles extends Productos {

    protected String paisOrigen;
    protected String fecha;

    public Muebles(int stock, String nombre, Double precio, String paisOrigen, String fecha) {
        super(stock, nombre, precio);
        this.paisOrigen = paisOrigen;
        this.fecha = fecha;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Muebles{" +
                "paisOrigen='" + paisOrigen + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
