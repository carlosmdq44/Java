package com.company.productos;

public class Impresoras extends Informaticos implements DescuentoEspecial {
    private int impresionesXminuto;

    public Impresoras(int stock, String nombre, Double precio, String fabricante, int impresionesXminuto) {
        super(stock, nombre, precio, fabricante);
        this.impresionesXminuto = impresionesXminuto;
    }

    public int getImpresionesXminuto() {
        return impresionesXminuto;
    }

    public void setImpresionesXminuto(int impresionesXminuto) {
        this.impresionesXminuto = impresionesXminuto;
    }

    @Override
    public String toString() {
        return super.toString() + "Impresoras{" +
                "impresionesXminuto=" + impresionesXminuto +
                '}';
    }

    @Override
    public double precioDescuento(int porcentaje) {
        return (super.getPrecio() - (super.getPrecio() * porcentaje / 100));
    }
}
