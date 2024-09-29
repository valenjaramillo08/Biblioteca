package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Libro {

    private String codigo, isbn, autor, titulo, editorial;
    private int unidadesDisponibles;
    private LocalDate fechaPublicacion;
    private boolean estado;
    public String getDetalles;

    /**
     * Metodo constructor de la clase Libro
     * @param codigo
     * @param isbn
     * @param autor
     * @param titulo
     * @param editorial
     * @param unidadesDisponibles
     * @param fechaPublicacion
     */
    public Libro(String codigo, String isbn, String autor, String titulo, String editorial, int unidadesDisponibles, LocalDate fechaPublicacion){
        this.codigo=codigo;
        this.isbn=isbn;
        this.autor=autor;
        this.editorial=editorial;
        this.titulo=titulo;
        this.unidadesDisponibles=unidadesDisponibles;
        this.fechaPublicacion=fechaPublicacion;
    }
    

    /**
     * Metodo para obtener el codigo del libro
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Metodo para modificar el codigo
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo para obtener el Isbn del libro 
     * @return
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Metodo para modificar el Isbn
     * @param isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Metodo para obtener el autor del libro
     * @return
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Metodo para modificar el autor
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Metodo para obtener el titulo del libro
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Metodo para modificar el titulo
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo para obtener la editorial del libro
     * @return
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Metodo para modificar la editorial
     * @param editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    // //mirar si en ves de dejarlo como un dato ponerlo como una funcion que nos modifique la cantidad del libro en el inventario tanto al disminuir como aumentar 
    // pero la funcion se pondria en la clase del detalle donde se pone la cantidad del libro a prestar para que redusca la cantidad del inventario
    /**
     * Metodo para obtener las cantidades disponibles del libro
     * @return
     */
    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    /**
     * Metoedod paramodificar las cantidades
     * @param unidadesDisponibles
     */
    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    /**
     * Metodo para obtener la fecha de publicacion del libro 
     * @return
     */
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Metodo para modificar la fecha de publicacion 
     * @param fechaPublicacion
     */
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * Metodo para determinar el estado del libro
     * @return
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Metodo para modificar el estado del libro
     * @param estado
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", editorial="
                + editorial + ", unidadesDisponibles=" + unidadesDisponibles + ", fechaPublicacion=" + fechaPublicacion
                + ", estado=" + estado + "]";
    }

    
    
}