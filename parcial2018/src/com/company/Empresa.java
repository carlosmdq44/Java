package com.company;

public class Empresa extends Cliente{
    private String cuit;
    private String condicionIva;

    public Empresa(int id, String nombre, String apellido, String fechaNacimiento, String cuit, String condicionIva) {
        super(id, nombre, apellido, fechaNacimiento);
        this.cuit = cuit;
        this.condicionIva = condicionIva;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getCondicionIva() {
        return condicionIva;
    }

    public void setCondicionIva(String condicionIva) {
        this.condicionIva = condicionIva;
    }
    @Override
    public double devolverDescuento(){
        return 15;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "cuit='" + cuit + '\'' +
                ", condicionIva='" + condicionIva + '\'' +
                '}';
    }
}
