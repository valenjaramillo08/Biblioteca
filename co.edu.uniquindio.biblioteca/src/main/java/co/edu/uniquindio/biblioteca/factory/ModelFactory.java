package co.edu.uniquindio.biblioteca.factory;

import co.edu.uniquindio.biblioteca.model.*;
import co.edu.uniquindio.biblioteca.services.IModelFactoryServices;

public class ModelFactory implements IModelFactoryServices {
    private static ModelFactory modelFactory;
    private Biblioteca biblioteca;

    public ModelFactory(){

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
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Laura");
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Juan");
        Bibliotecario bibliotecario1 = new Bibliotecario("Mateo", "1109778");
        bibliotecario1.setNombre("Bibliotecario");
        Prestamo prestamo1 = new Prestamo();
        prestamo1.setCodigoPrestamo("123CFG");


    }


    @Override
    public void gestionarItem() {

    }

    @Override
    public void gestionarPrestamos() {

    }


    @Override
    public String miembroConMasPrestamos() {
        return "";
    }

    @Override
    public String maximoPrestamoMiembro() {
        return "";
    }

    @Override
    public int cantidadPrestamos() {
        return 0;
    }
}
