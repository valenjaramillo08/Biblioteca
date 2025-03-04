package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.factory.ModelFactory;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        datosLibro(modelFactory);
        miembroConMasPrestamos(modelFactory);
        prestamoLibro(modelFactory);
    }

    private static void datosLibro(ModelFactory modelFactory) {
    String isbn="123";
    String resultado= modelFactory.datosLibro(isbn);
    }

    private static void miembroConMasPrestamos(ModelFactory modelFactory) {
        String resultado= modelFactory.miembroConMasPrestamos();
        System.out.println(modelFactory.miembroConMasPrestamos());
    }

    private static void prestamoLibro(ModelFactory modelFactory) {
        String isbn="978";
        String resultado= modelFactory.prestamoLibro(isbn);
        System.out.println(modelFactory.prestamoLibro(isbn));
    }
}