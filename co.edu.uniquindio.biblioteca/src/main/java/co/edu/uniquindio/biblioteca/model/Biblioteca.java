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

    public boolean maximoPrestamoMiembro(Miembro miembro){
        boolean bandera=true;

        for (Miembro miembro1 : listaMiembros){
            if(miembro1.getListaPrestamos().size()>=5){
                bandera=false;
            }
            else{
                bandera=true;
            }
        }
        return bandera;
    }

    public String miembroConMasPrestamos(){
        String nombreComun="";
        int contadorPrincipal=0;

        for (Prestamo prestamo: listaPrestamos) {
            int contador=0;
            String nombreAnalisis = prestamo.getMiembro().getNombre();

            for (Prestamo prestamo2 : listaPrestamos) {
                if(prestamo2.getMiembro().getNombre().equals(nombreAnalisis)){
                    contador ++;
                }

            }
            if(contadorPrincipal < contador){
                nombreComun= nombreAnalisis;
                contadorPrincipal= contador;
            }

        }
        return nombreComun;
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

    public void agregarMiembo(Miembro miembro) {
        if (!verificarMiembro(miembro.getIdMiembro())){
            listaMiembros.add(miembro);
        }
    }

    public boolean verificarMiembro(String idMiembro) {
        boolean centinela = false;
        for (Miembro miembro: listaMiembros) {
            if (miembro.getIdMiembro().equals(idMiembro)) {
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

