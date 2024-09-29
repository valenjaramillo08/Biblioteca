package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Prestamo {

    private int codigo;
    private LocalDate fechaPrestamo, fechaEntrega;
    private double total;
    private Bibliotecario bibliotecario;
    private Estudiante estudiante;
    private Collection<DetallePrestamo> detallePrestamos;

    /**
     * Metodo constructor de la clase Prestamo
     * @param codigo
     * @param fechaPrestamo
     * @param fechaEntrega
     * @param bibliotecario
     * @param estudiante
     */
    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaEntrega, Bibliotecario bibliotecario,
            Estudiante estudiante) {
        this.codigo = nuevoCodigo();
        this.fechaEntrega = fechaEntrega;
        this.fechaPrestamo = fechaPrestamo;
        detallePrestamos = new LinkedList<>();
        this.total = calcularTotal();
    }

    public void agregarPrestamo(DetallePrestamo detallePrestamo) {
            detallePrestamos.add(detallePrestamo);
    }

    /**
     * Metodo para que el codigo del prestamo vaya aumentando en orden 
     * numerico para que se evite el error de repetir codigos
     */

     public int nuevoCodigo(){
        int cont = 0;
        if(cont >= 0){
            cont ++;
        }
        return cont;
    }
    
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

    /**
     * Metodo para obtener el codigo del prestamo 
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Metodo para modificar el codigo
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo para obtener la fecha del prestamo 
     * @return
     */
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Metodo para modificar la fecha del prestamo 
     * @param fechaPrestamo
     */
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * Metodo para obtener la fecha de entrega 
     * @return
     */
    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Metodo para modificar la fecha de entrega 
     * @param fechaEntrega
     */
    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Metodo para obtener el total del prestamo 
     * @return
     */
    public double getTotal() {
        return total;
    }

    /**
     * Metodo para modificar el total
     * @param total
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Metodo para obtener al bibliotecario encargado del prestamo
     * @return
     */
    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    /**
     * Metodo para modificar al bibliotecario encargado del prestamo 
     * @param bibliotecario
     */
    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    /**
     * Metodo para obtener el estudiante al que se le realiza el prestamo 
     * @return
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * Metodo para modificar al estudiante que se le realizo el prestamo 
     * @param estudiante
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * Metodo para obtener la lista de detalles del prestamo 
     * @return
     */
    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    /**
     * Metodo para modificar la lista de detalles 
     * @param detallePrestamos
     */
    public void setDetallePrestamos(Collection<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    @Override
    public String toString() {
        return "Prestamo [codigo=" + codigo + ", fechaPrestamo=" + fechaPrestamo + ", fechaEntrega=" + fechaEntrega
                + ", total=" + total + ", bibliotecario=" + bibliotecario + ", estudiante=" + estudiante
                + ", detallePrestamos=" + detallePrestamos + "]";
    }

}