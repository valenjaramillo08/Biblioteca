package co.edu.uniquindio.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public String nombre;
    public List<Empleado> listaEmpleados = new ArrayList<>();
    public List<Miembro> listaMiembros = new ArrayList<>();
    public List<Bibliotecario> listaBibliotecarios = new ArrayList<>();
    public List<Libro> listaLibros = new ArrayList<>();
    public List<Prestamo> listaPrestamos = new ArrayList<>();


    public String datosLibro (String codigo){
        for (Libro libro: listaLibros){
    
            if (libro.getIsbn().equals(codigo)){
                return libro.toString(); 
            }
        }
        return "El préstamo no se encontro";
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        if (!verificarBibliotecario(bibliotecario.getIdEmpleado())) {
            listaBibliotecarios.add(bibliotecario);
        }
    }

    public boolean verificarBibliotecario(String cedula) {
        boolean centinela = false;
        for (Bibliotecario bibliotecario : listaBibliotecarios) {
            if (bibliotecario.getIdEmpleado().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarLibro(Libro libro) {
        if (!verificarLibro(libro.getIsbn())) {
            listaLibros.add(libro);
        }
    }

    public boolean verificarLibro(String codigo) {
        boolean centinela = false;
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(codigo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public int cantidadPrestamo (String nombre){
        int contador = 0;

    for (Prestamo prestamo : listaPrestamos) {
        if (prestamo.getBibliotecario().toString().equals(nombre)) {
            contador++;
        }
    }
    System.out.println("Los préstamos realizados por el bibliotecario" +nombre+ "son:" + contador);

    return contador; 

}


    public Biblioteca(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Miembro> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(List<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public List<Bibliotecario> getListaBibliotecarios() {
        return listaBibliotecarios;
    }

    public void setListaBibliotecarios(List<Bibliotecario> listaBibliotecarios) {
        this.listaBibliotecarios = listaBibliotecarios;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }
}

