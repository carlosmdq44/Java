package com.company;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VideoStore {

    private List<Cliente> listaClientes;
    private List<Pelicula> listaPeliculas;
    private List<Alquiler> listaAlquileres;

    /** CONSTRUCTORES **/
    public VideoStore() {
    }

    public VideoStore(List<Cliente> listaClientes, List<Pelicula> listaPeliculas, List<Alquiler> listaAlquileres) {
        this.listaClientes = listaClientes;
        this.listaPeliculas = listaPeliculas;
        this.listaAlquileres = listaAlquileres;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(List<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public List<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(List<Alquiler> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }

    @Override
    public String toString() {
        return "VideoStore{" +
                "listaClientes=" + listaClientes +
                ", listaPeliculas=" + listaPeliculas +
                ", listaAlquileres=" + listaAlquileres +
                '}';
    }
}
