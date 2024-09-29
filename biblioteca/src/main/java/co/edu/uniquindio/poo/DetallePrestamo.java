package co.edu.uniquindio.poo;

import java.time.temporal.ChronoUnit;

public class DetallePrestamo {
    
    private int cantidad;
    private Prestamo prestamo;
    private Libro libro;
    private double subTotal;

    public DetallePrestamo(int cantidad, Prestamo prestamo, Libro libro){
        this.cantidad=cantidad;
        this.prestamo=prestamo;
        this.libro=libro;
        this.subTotal=calcularSubtotal();
    }

    /**
     * Metodo para hallar el subtotal de cada detalle 
     * @return
     */
    public double calcularSubtotal(){
        
        double subtotal = cantidad*calcularValor();
        return subtotal;
    }

    /**
     * Metodo para hallar el valor total de cada libro prestado 
     * @return
     */
    public double calcularValor (){
        
        double valorDia = 2000;
        long diasPrestamo = ChronoUnit.DAYS.between(prestamo.getFechaPrestamo(), prestamo.getFechaEntrega());
        double valorTotal = valorDia *diasPrestamo;
        return valorTotal;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "DetallePrestamo [cantidad=" + cantidad + ", prestamo=" + prestamo + ", libro=" + libro + ", subTotal="
                + subTotal + "]";
    }
    


    /*public double calcularSubtotal(){
        return cantidad*libro.get
    }*/



    
    
}