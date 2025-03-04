package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.factory.ModelFactory;
import co.edu.uniquindio.biblioteca.model.Biblioteca;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory= ModelFactory.getInstance();
        miembroConMasPrestamos(modelFactory);

    }
    public static void miembroConMasPrestamos(ModelFactory modelFactory) {
        String resultado= modelFactory.miembroConMasPrestamos();
        System.out.println(resultado);
    }

}