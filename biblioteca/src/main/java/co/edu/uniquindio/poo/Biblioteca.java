package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private double totalDineroRecaudo;
    private Collection<Bibliotecario> bibliotecarios;
    private Collection<Prestamo> prestamos;
    private Collection<Libro> libros;
    private Collection<Estudiante> estudiantes;

    /**
     * Metodo constructor de la clase biblioteca 
     * @param nombre
     * @param totalDineroRecaudo
     */
    public Biblioteca(String nombre, double totalDineroRecaudo) {
        this.nombre = nombre;
        this.totalDineroRecaudo = totalDineroRecaudo;
        bibliotecarios = new LinkedList<>();
        prestamos = new LinkedList<>();
        libros = new LinkedList<>();
        estudiantes = new LinkedList<>();
    }
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        if (!verificarBibliotecario(bibliotecario.getCedula())) {
            bibliotecarios.add(bibliotecario);
        }
    }

    /**
     * Metodo para verificar la existencia de un bibliotecario en la biblioteca 
     * @param cedula
     * @return
     */
    public boolean verificarBibliotecario(String cedula) {
        boolean centinela = false;
        for (Bibliotecario bibliotecario: bibliotecarios) {
            if (bibliotecario.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para agregar a un bibliotecario 
     * @param prestamo
     */
    public void agregarPrestamo(Prestamo prestamo) {
        if (!verificarPrestamo(prestamo.getCodigo())) {
            prestamos.add(prestamo);
        }
    }

    /**
     * Metodo para verificar la existencia de un prestamo
     * @param codigo
     * @return
     */
    public boolean verificarPrestamo(String codigo) {
        boolean centinela = false;
        for (Prestamo prestamo: prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                centinela = true;
            }
        }
        return centinela;
    }
    
    /**
     * Metodo para agregar libro a la biblioteca 
     * @param libro
     */
    public void agregarLibro(Libro libro) {
        if (!verificarLibro(libro.getCodigo())) {
            libros.add(libro);
        }
    }

    /**
     * Meetodo para verificar la existencia de un ejemplar de un libro 
     * @param codigo
     * @return
     */
    public boolean verificarLibro(String codigo) {
        boolean centinela = false;
        for (Libro libro: libros) {
            if (libro.getCodigo().equals(codigo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para agregar un estudiante 
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante) {
        if (!verificarEstudiante(estudiante.getCedula())) {
            estudiantes.add(estudiante);
        }
    }

    /**
     * Metodo para verificar la existencia de un estudiante 
     * @param cedula
     * @return
     */
    public boolean verificarEstudiante(String cedula) {
        boolean centinela = false;
        for (Estudiante estudiante: estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    

    /**
     * Metodo para buscar los datos de un libro mediante su codigo unico 
     * @param codigo
     * @return
     */
    public String datosLibro(String codigo){
        String mensaje="";
        for (Libro libro : libros) {
            if(libro.getCodigo().equals(codigo)){
                mensaje= libro.getDetalles();
            }
            else{
                mensaje= "El libro no se encontro.";
            }
        }
        return  mensaje;
    }


































    /**
     * Metodo para obtener el nombre de la biblioteca 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para modificar el nombre de biblioteca
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //mirar si en ves de dejarlo como un dato ponerlo como una funcion de la suma de todos los totales de los prestamos 
    /**
     * Metodo para obtener el total de dinero recudado
     * @return
     */
    public double getTotalDineroRecaudo() {
        return totalDineroRecaudo;
    }

    /**
     * Metodo para modificar el total de dinero recaudado
     * @param totalDineroRecaudo
     */
    public void setTotalDineroRecaudo(double totalDineroRecaudo) {
        this.totalDineroRecaudo = totalDineroRecaudo;
    }

    /**
     * Metodo para obtener la lista de bibliotecarios 
     * @return
     */
    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    /**
     * Metodo para modificar la lista de bibliotecarios
     * @param bibliotecarios
     */
    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    /**
     * Metodo para obtener la lista de prestamos
     * @return
     */
    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * Metodo para modificar la lista de prestamos
     * @param prestamos
     */
    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    /**
     * Metodo para obtener la lista de Libros
     * @return
     */
    public Collection<Libro> getLibros() {
        return libros;
    }

    /**
     * Metodo para modificar la lista de Libros
     * @param libros
     */
    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Metodo para obtener la lista de Estudiantes
     * @return
     */
    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /**
     * Metodo para modificar la lista de Estudiantes
     * @param estudiantes
     */
    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", totalDineroRecaudo=" + totalDineroRecaudo + ", bibliotecarios="
                + bibliotecarios + ", prestamos=" + prestamos + ", libros=" + libros + ", estudiantes=" + estudiantes
                + "]";
    }

}