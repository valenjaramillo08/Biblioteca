package co.edu.uniquindio.biblioteca.factory;

import co.edu.uniquindio.biblioteca.model.*;
import co.edu.uniquindio.biblioteca.services.IModelFactoryServices;

import java.time.LocalDate;

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
        libro1.setIsbn("123");
        libro1.setAutor("mateo");
        libro1.setEstado(true);

        Libro libro2 = new Libro();
        libro2.setTitulo("100 años");
        libro2.setIsbn("456");
        libro2.setAutor("mateo");
        libro2.setEstado(true);

        Libro libro3 = new Libro();
        libro3.setTitulo("100 comedias");
        libro3.setIsbn("789");
        libro3.setAutor("tina");
        libro3.setEstado(true);

        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Laura");
        usuario1.setIdUsuario("3322");

        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Pancho");
        usuario2.setIdUsuario("3323");

        Usuario usuario3 = new Usuario();
        usuario3.setNombre("Luiz");
        usuario3.setIdUsuario("3324");

        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Juan");
        empleado1.setIdEmpleado("4455");

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Sebastian");
        empleado2.setIdEmpleado("5555");

        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Maria");
        empleado3.setIdEmpleado("5556");

        Bibliotecario bibliotecario1 = new Bibliotecario("Mateo", "1109778");
        Bibliotecario bibliotecario2 = new Bibliotecario("Jhon", "1100000");

        Prestamo prestamo1 = new Prestamo();
        prestamo1.setCodigoPrestamo("123CFG");
        prestamo1.setFechaPrestamo(LocalDate.of(2020, 1, 1));
        prestamo1.setUsuario(usuario1);
        prestamo1.setBibliotecario(bibliotecario1);
        prestamo1.setFechaDevolucion(LocalDate.of(2020, 1, 2));
        prestamo1.setLibro(libro1);


        Prestamo prestamo2 = new Prestamo();
        prestamo2.setCodigoPrestamo("456CFG");
        prestamo2.setFechaPrestamo(LocalDate.of(2020, 1, 1));
        prestamo2.setUsuario(usuario2);
        prestamo2.setLibro(libro2);
        prestamo2.setBibliotecario(bibliotecario2);


        Prestamo prestamo3 = new Prestamo();
        prestamo3.setCodigoPrestamo("789CFG");
        prestamo3.setFechaPrestamo(LocalDate.of(2020, 1, 1));
        prestamo3.setUsuario(usuario3);
        prestamo3.setLibro(libro3);
        prestamo3.setBibliotecario(bibliotecario1);

        Prestamo prestamo4 = new Prestamo();
        prestamo4.setCodigoPrestamo("978CFG");
        prestamo4.setFechaPrestamo(LocalDate.of(2020, 1, 1));
        prestamo4.setUsuario(usuario1);
        prestamo4.setLibro(libro1);
        prestamo4.setBibliotecario(bibliotecario2);


        //usuario1.agregarPrestamo(prestamo4);
        //usuario1.agregarPrestamo(prestamo2);
        //usuario3.agregarPrestamo(prestamo3);

    }




    @Override
    public String miembroConMasPrestamos() {
        return biblioteca.miembroConMasPrestamos();
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
