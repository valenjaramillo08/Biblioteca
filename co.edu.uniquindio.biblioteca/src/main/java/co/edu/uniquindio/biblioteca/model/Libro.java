package co.edu.uniquindio.biblioteca.model;

public class Libro {
    public String autor;
    public String titulo;
    public String isbn;
    public boolean estado;

    public Libro(){}
    public Libro(String autor, String titulo, String isbn, boolean estado) {
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
        this.estado = estado;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
