package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Prestamo {

    private String codigo;
    private LocalDate fechaPrestamo, fechaEntrega;
    private double total;
    private Bibliotecario bibliotecario;
    private Estudiante estudiante;
    private Collection<DetallePrestamo> detallePrestamos;
    private Collection<Libro> libros;

    /**
     * Metodo constructor de la clase Prestamo
     * @param codigo
     * @param fechaPrestamo
     * @param fechaEntrega
     * @param bibliotecario
     * @param estudiante
     */
    public Prestamo(String codigo, LocalDate fechaPrestamo, LocalDate fechaEntrega, Bibliotecario bibliotecario,
            Estudiante estudiante) {
        this.codigo = codigo; //nuevoCodigo();
        this.fechaEntrega = fechaEntrega;
        this.fechaPrestamo = fechaPrestamo;
        this.bibliotecario=bibliotecario;
        this.estudiante=estudiante;
        detallePrestamos = new LinkedList<>();
        libros = new LinkedList<>();
        this.total = calcularTotal();
    }

    public void agregarPrestamo(DetallePrestamo detallePrestamo) {

        if(modificarCantidad(detallePrestamo.getLibro(), detallePrestamo.getCantidad())){
            detallePrestamos.add(detallePrestamo);
        }
        else{
            System.out.println("No se pudo agregar el libro");
        }
            
    }
    /**
     * Meetodo para verificar la existencia de ejemplares disponibles para prestar de un libro
     * @param codigo
     * @return
     */
    public boolean verificarEstadoLibro(String codigo) {
        boolean centinela = false;
        for (Libro libro: libros) {
            if (libro.getCodigo().equals(codigo)){
                if (libro.getUnidadesDisponibles() > 0) {
                    centinela = true;
                }
            }
        }
        return centinela;
    }

/**
* Metodo para disminuir las cantidades disponibles del libro
* @param cantidad
*/
public boolean modificarCantidad(Libro libro, int cantidad){
    boolean bandera = false;
    if(verificarEstadoLibro(libro.getCodigo())){
        if (libro.getUnidadesDisponibles()> cantidad){

            libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() - cantidad);
            bandera = true;
        }

        else if(libro.getUnidadesDisponibles() == cantidad){
            libro.setEstado(false);
            libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() - cantidad);
            bandera = true;
        }

        else{
            System.out.println("Las unidades disponibles no son suficientes para realizar el prestamo");
        }
    }
    else{
        System.out.println("El estado del libro actualmente esta en -no disponible-");
    }
    return bandera;
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
     * @return centinela
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
     * Metodo para que el codigo del prestamo vaya aumentando en orden 
     * numerico para que se evite el error de repetir codigos
     */

    /*public int nuevoCodigo(){
        int cont = 0;
        if(cont >= 0){
            cont ++;
        }
        return cont;
    }*/
    
    /**
     * Metodo para calcular el total del prestamo realizado
     * @return
     */
    public double calcularTotal() {
        double total = 0;
        for (DetallePrestamo detallePrestamo : detallePrestamos) {
            total += detallePrestamo.getSubTotal();
        }
        return total;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    public void setDetallePrestamos(Collection<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    public Collection<Libro> getLibros() {
        return libros;
    }


    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }
    

    @Override
    public String toString() {
        return "Prestamo [codigo=" + codigo + ", fechaPrestamo=" + fechaPrestamo + ", fechaEntrega=" + fechaEntrega
                + ", total=" + total + ", bibliotecario=" + bibliotecario + ", estudiante=" + estudiante
                + ", detallePrestamos=" + detallePrestamos + "]";
    }

}