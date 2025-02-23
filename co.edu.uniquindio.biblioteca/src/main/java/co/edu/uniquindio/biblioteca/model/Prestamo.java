package co.edu.uniquindio.biblioteca.model;

import java.time.LocalDate;

public class Prestamo {
    public LocalDate fechaPrestamo;
    public LocalDate fechaDevolucion;
    public Miembro miembro;
    public Libro libro;

    public Prestamo(){}


}
