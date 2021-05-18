package com.company;
import com.company.Cliente;
import java.util.Arrays;

public class ClienteParticular extends Cliente{
    private String nombre;

    public ClienteParticular(int id, String direccion, double telefono, String nombre) {
        super(id, direccion, telefono);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ClienteParticular{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

