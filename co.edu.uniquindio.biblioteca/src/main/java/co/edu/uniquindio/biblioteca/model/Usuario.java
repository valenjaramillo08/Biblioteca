package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    public String nombre;
    public String idUsuario;
    public List<Prestamo> listaPrestamos = new ArrayList<>();

    public Usuario() {}
    public Usuario(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;

    }
    public void agregarPrestamo(Prestamo prestamo) {
        if (!verificarPrestamo(prestamo.getCodigoPrestamo())) {
            listaPrestamos.add(prestamo);
        }
    }

    public boolean verificarPrestamo(String codigoPrestamo) {
        boolean centinela = false;
        for (Prestamo prestamo: listaPrestamos) {
            if (prestamo.getCodigoPrestamo().equals(codigoPrestamo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                ", listaPrestamos=" + listaPrestamos +
                '}';
    }
}
