package co.edu.uniquindio.poo;

public class DetallePrestamo {

    private int cantidad;
    private Prestamo prestamo;
    private Libro libro;
    private double subTotal;

    public DetallePrestamo(int cantidad, Prestamo prestamo, Libro libro){
        this.cantidad=cantidad;
        this.prestamo=prestamo;
        this.libro=libro;
        //this.subTotal=calcularSubtotal();
    }

    /*public double calcularSubtotal(){
        return cantidad*libro.get
    }*/

    /**
     * Metodo para obtener la cantidad 
     * @return
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Metodo para modificar la cantidad
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo para obtener el prestamo correspondiente al detalle
     * @return
     */
    public Prestamo getPrestamo() {
        return prestamo;
    }

    /**
     * Metodo para modificar el prestamo correspondiente al detalle
     * @param prestamo
     */
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    /**
     * Metodo para obtener el libro 
     * @return
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Metodo para modificar el libro 
     * @param libro
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * Metodo para obtener el sub total
     * @return
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * Metodo para modificar el sub total
     * @param subTotal
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "DetallePrestamo [cantidad=" + cantidad + ", prestamo=" + prestamo + ", libro=" + libro + ", subTotal="
                + subTotal + "]";
    }

    
    
}