package com.company.productos;

public class Sillas extends Muebles implements DescuentoEspecial {
    private boolean ruedas;

    public Sillas(int stock, String nombre, Double precio, String paisOrigen, String fecha, boolean ruedas) {
        super(stock, nombre, precio, paisOrigen, fecha);
        this.ruedas = ruedas;
    }

    public boolean isRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Sillas{" +
                "ruedas=" + ruedas +
                '}';
    }

    @Override
    public double precioDescuento(int porcentaje) {
        return (super.getPrecio() - (super.getPrecio() * porcentaje / 100));
    }
}
