package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
    
    
    // creando la biblioteca
    Biblioteca biblioteca= new Biblioteca("El libro", 5000000);
    //Creando los libros
    Libro libro1= new Libro("009", "0001", "Gabriel Garcia", "Cien años de soledad", "Hola", 5, LocalDate.of(2024,07,12));
    Libro libro2= new Libro("008", "00002", "Esteban Valencia", "Caperucita se come al lobo", "Mar", 4, LocalDate.of(2000,02,17));
    // Creando los bibliotecarios
    Bibliotecario bibliotecario1= new Bibliotecario("Martin", "100092", "martin0@gmail.com", 300012,LocalDate.of(2017, 12, 20));
    Bibliotecario bibliotecario2= new Bibliotecario("Lina", "109292", "linaarl@gmail.com", 3000921, LocalDate.of(2014, 10, 30));
    // Creando a los estudiantes
    Estudiante estudiante1= new Estudiante("Laura", "102293", "lauespe@gmail.com", 3002928, true);
    Estudiante estudiante2= new Estudiante("Valentina", "1092922", "valenjarami@gmailcom", 31828282, false);
    // Creando los prestamos
    Prestamo prestamo1 = new Prestamo("888", LocalDate.of(2024, 9, 25),LocalDate.of(2024, 10, 30) , bibliotecario2, estudiante2);
    bibliotecario2.agregarPrestamo(prestamo1);
    estudiante2.agregarPrestamo(prestamo1);
    Prestamo prestamo2= new Prestamo("777", LocalDate.of(2024,3,15), LocalDate.of(2024, 3, 30), bibliotecario1, estudiante2);
    bibliotecario1.agregarPrestamo(prestamo2);
    estudiante2.agregarPrestamo(prestamo2);
    Prestamo prestamo3= new Prestamo("88088", LocalDate.of(2024, 6,13), LocalDate.of(2024, 6, 20), bibliotecario2, estudiante1);
    bibliotecario2.agregarPrestamo(prestamo3);
    estudiante1.agregarPrestamo(prestamo3);

    // Creando los detalles del prestamo
    DetallePrestamo detallePrestamo1= new DetallePrestamo(1, prestamo1, libro1);
    DetallePrestamo detallePrestamo2= new DetallePrestamo(4, prestamo1, libro2);
    DetallePrestamo detallePrestamo3= new DetallePrestamo(1, prestamo2, libro1);
    DetallePrestamo detallePrestamo4= new DetallePrestamo(1, prestamo2, libro2);
    DetallePrestamo detallePrestamo5= new DetallePrestamo(3, prestamo3, libro1);
    



//agregando bibliotecarios a biblioteca
biblioteca.agregarBibliotecario(bibliotecario1);
biblioteca.agregarBibliotecario(bibliotecario2);

// agregando estudiantes a biblioteca
biblioteca.agregarEstudiante(estudiante1);
biblioteca.agregarEstudiante(estudiante2);

// agregando libros a la biblioteca
biblioteca.agregarLibro(libro1);
biblioteca.agregarLibro(libro2);


//Gestionar el prestamo 1
prestamo1.agregarLibro(libro1);
prestamo1.agregarLibro(libro2);
//creando prestamo
prestamo1.agregarPrestamo(detallePrestamo2);
prestamo1.agregarPrestamo(detallePrestamo1);
prestamo1.calcularTotal();
//agregando prestamo
biblioteca.agregarPrestamo(prestamo1);


//Gestionar el prestamo 2
prestamo2.agregarLibro(libro2);
prestamo2.agregarLibro(libro1);
//creando prestamo
prestamo2.agregarPrestamo(detallePrestamo3);
prestamo2.agregarPrestamo(detallePrestamo4);
//agregando prestamo
biblioteca.agregarPrestamo(prestamo2);

//Gestionar el prestamo 3
prestamo3.agregarLibro(libro2);
prestamo3.agregarLibro(libro1);
//creando prestamo
prestamo3.agregarPrestamo(detallePrestamo5);
//agregando prestamo
biblioteca.agregarPrestamo(prestamo3);

// Consultar los datos de un Libro dado su código
System.out.println(biblioteca.datosLibro("008")+"\n");
// Consultar dado el nombre del Libro la cantidad de préstamos en el cual está incluido, es decir si un Libro está incluido en dos préstamos la respuesta sería 2).
System.out.println("La cantidad de prestamos del libro1 es: "+biblioteca.cantidadPrestamos(libro1)+"\n");
// Reemplazar un libro por otro, es decir, sobrescribir el libro por uno nuevo.
Libro libro3 = new Libro("008", "00004", "Esteban gomez", "Caperucita roja", "Abr", 2, LocalDate.of(2000,02,17));
biblioteca.reemplazarLibro("008", libro3);
System.out.println("Los nuevos datos del libro 008 son: "+biblioteca.datosLibro("008")+"\n");

// Consultar datos de un préstamo dado su código.
System.out.println(biblioteca.datosPrestamo("888")+"\n");

// Mostrar la cantidad de préstamos realizados por cada empleado
System.out.println("la cantidad de prestamos del bibliotecario2 son: "+biblioteca.prestamosBibliotecario("109292")+"\n");

// Mostrar datos del estudiante con más préstamos (sin importar de qué libro)
System.out.println("el estudiante con mas prestamos es: "+biblioteca.estudianteConMasPrestamos()+"\n");

// Total de dinero recaudado por la empresa.
System.out.println("el total de dinero recaudado es: "+biblioteca.dineroRecaudado()+"\n");

// Total de dinero a pagar a los bibliotecarios, un empleado gana el 20% del valor de cada préstamo que realice, más una bonificación de un 2% de este total por cada año de antigüedad que tenga.
System.out.println("El salario de los bibliotecarios es: "+biblioteca.salarioBibliotecarios());



//System.out.println(prestamo1);
//System.out.println(libro2);



    }
}
