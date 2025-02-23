package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Miembro {
    public String nombre;
    public String idMiembro;
    public List<Prestamo> listaPrestamos = new ArrayList<>();

    public Miembro() {}
    public Miembro(String nombre, String idMiembro) {
        this.nombre = nombre;
        this.idMiembro = idMiembro;

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

    public String getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(String idMiembro) {
        this.idMiembro = idMiembro;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }
}
