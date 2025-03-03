package co.edu.uniquindio.biblioteca.model;

import co.edu.uniquindio.biblioteca.services.IModelFactoryServices;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecario extends Empleado implements IGestionInventario {
    public List<Prestamo> listaPrestamos = new ArrayList<>();

    public Bibliotecario(String nombre,String idEmpleado){
        super(nombre,idEmpleado);

    }
    public void agregarPrestamo(Prestamo miPrestamo){
        listaPrestamos.add(miPrestamo);
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }


    @Override
    public void gestionarItem(Libro libro) {

    }

    @Override
    public void gestionarPrestamos() {

    }
}
