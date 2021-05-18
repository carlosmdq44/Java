package com.company;

public class ClienteEmpresa extends Cliente {
    private String nombreFantasia;

    public ClienteEmpresa(int id, String direccion, double telefono, String nombreFantasia) {
        super(id, direccion, telefono);
        this.nombreFantasia = nombreFantasia;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    @Override
    public String toString() {
        return "ClienteEmpresa{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", nombreFantasia='" + nombreFantasia + '\'' +
                '}';
    }
}
