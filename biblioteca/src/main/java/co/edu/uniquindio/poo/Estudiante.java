package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Estudiante extends Persona {

    private boolean estado;
    private Collection<Prestamo> prestamos;

    /**
     * Metodo constructor de la clase Estudiante
     * @param nombre
     * @param cedula
     * @param correo
     * @param telefono
     * @param estado
     */
    public Estudiante(String nombre, String cedula, String correo, int telefono, boolean estado) {
        super(nombre, cedula, correo, telefono);
        this.estado = estado;
        prestamos = new LinkedList<>();
    }

    /**
     * Metodo para determinar el estado del estudiante
     * @return
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Metodo para modificar el estado del estudiante
     * @param estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
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
        return "Estudiante [" + super.toString() + "estado=" + estado + ", prestamos=" + prestamos + "]";
    }

}