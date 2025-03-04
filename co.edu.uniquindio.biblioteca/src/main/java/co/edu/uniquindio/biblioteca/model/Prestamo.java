package co.edu.uniquindio.biblioteca.model;

import java.time.LocalDate;

public class Prestamo {
    public LocalDate fechaPrestamo;
    public LocalDate fechaDevolucion;
    public Usuario usuario;
    public Libro libro;
    public Bibliotecario bibliotecario;
    public String codigoPrestamo;


    public Prestamo(){}

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion, Usuario usuario, Libro libro, Bibliotecario bibliotecario, String codigoPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.usuario = usuario;
        this.libro = libro;
        this.bibliotecario = bibliotecario;
        this.codigoPrestamo = codigoPrestamo;

    }

    public void agregarLibro(Libro libroPrestamo) {
        if (libroPrestamo.getIsbn() != null) {} {
            libro.setTitulo(libroPrestamo.getTitulo());
            libro.setAutor(libroPrestamo.getAutor());
            libro.setIsbn(libroPrestamo.getIsbn());
            libro.setEstado(false);
        }
    }
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public String getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public void setCodigoPrestamo(String codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }
}
