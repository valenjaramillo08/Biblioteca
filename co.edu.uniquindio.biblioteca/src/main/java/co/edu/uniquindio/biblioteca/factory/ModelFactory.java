package co.edu.uniquindio.biblioteca.factory;

import co.edu.uniquindio.biblioteca.model.*;
import co.edu.uniquindio.biblioteca.services.IModelFactoryServices;

public class ModelFactory implements IModelFactoryServices {
    private static ModelFactory modelFactory;
    private Biblioteca biblioteca;

    private ModelFactory(){
        inicializarDatos();
    }

    public static ModelFactory getInstance(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatos(){
        biblioteca = new Biblioteca();
        Libro libro1 = new Libro();
        libro1.setTitulo("Lagañas");
        Miembro miembro1 = new Miembro();
        miembro1.setNombre("Laura");
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Juan");
        Bibliotecario bibliotecario1 = new Bibliotecario();
        bibliotecario1.setNombre("Bibliotecario");
        Prestamo prestamo1 = new Prestamo();


    }

}
