package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.factory.ModelFactory;
import co.edu.uniquindio.biblioteca.model.Biblioteca;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory= ModelFactory.getInstance();
        gestionarItem(modelFactory);
        gestionarPrestamos(modelFactory);
    }
    private static void gestionarItem(ModelFactory modelFactory) {
            String isbn= "0009RD";
            String resultado= modelFactory.gestionarItem(isbn);
            validarResultado(resultado,)
    }
}