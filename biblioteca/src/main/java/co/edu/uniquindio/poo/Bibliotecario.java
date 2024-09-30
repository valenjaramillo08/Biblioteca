package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Bibliotecario extends Persona {

    private LocalDate fechaIngreso;
    private Collection<Prestamo> prestamos;

    /**
     * Metodo constructor de la clase bibliotecario
     * @param nombre
     * @param cedula
     * @param correo
     * @param telefono
     * @param fechaIngreso
     */
    public Bibliotecario(String nombre, String cedula, String correo, int telefono,  LocalDate fechaIngreso){
        super(nombre, cedula, correo, telefono);
        this.fechaIngreso=fechaIngreso;
        prestamos = new LinkedList<>();
    }

    public void agregarPrestamo(Prestamo miPrestamo){
        prestamos.add(miPrestamo);
    }
    /**
     * Metodo para obtener la fecha de ingreso del bibliotecario 
     * @return
     */
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Metodo para modificar la fecha de ingreso
     * @param fechaIngreso
     */
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
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


    @Override
    public String toString() {
        return "Bibliotecario [fechaIngreso=" + fechaIngreso  + "]";
    }

}