package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // creando la biblioteca
    Biblioteca biblioteca= new Biblioteca("El libro", 0);

    
    
    //Creando los libros
    Libro libro1= new Libro("009", "0001", "Gabriel Garcia", "Cien años de soledad", "Hola", 5, LocalDate.of(2024,07,12));
    Libro libro2= new Libro("008", "00002", "Esteban Valencia", "Caperucita se come al lobo", "Mar", 3, LocalDate.of(2000,02,17));
    
    // Creando los bibliotecarios
    Bibliotecario bibliotecario1= new Bibliotecario("Martin", "100092", "martin0@gmail.com", 300012,LocalDate.of(2017, 12, 20));
    Bibliotecario bibliotecario2= new Bibliotecario("Lina", "109292", "linaarl@gmail.com", 3000921, LocalDate.of(2014, 10, 30));

    // Creando a los estudiantes
    Estudiante estudiante1= new Estudiante("Laura", "102293", "lauespe@gmail.com", 3002928, true);
    Estudiante estudiante2= new Estudiante("Valentina", "1092922", "valenjarami@gmailcom", 31828282, false);

    // Creando los prestamos
    Prestamo prestamo1 = new Prestamo("888", LocalDate.of(2024, 9, 25),LocalDate.of(2024, 9, 30) , bibliotecario2, estudiante2);
    Prestamo prestamo2= new Prestamo("777", LocalDate.of(2024,3,15), LocalDate.of(2024, 3, 30), bibliotecario1, estudiante2);
    Prestamo prestamo3= new Prestamo("88088", LocalDate.of(2024, 6,13), LocalDate.of(2024, 6, 20), bibliotecario2, estudiante2);
    // Creando los detalles del prestamo
    DetallePrestamo detallePrestamo1= new DetallePrestamo(3, prestamo1, libro2);
    DetallePrestamo detallePrestamo2= new DetallePrestamo(4, prestamo3, libro2);
    



//agregando bibliotecarios a biblioteca
biblioteca.agregarBibliotecario(bibliotecario1);
biblioteca.agregarBibliotecario(bibliotecario2);

// agregando estudiantes a biblioteca
biblioteca.agregarEstudiante(estudiante1);
biblioteca.agregarEstudiante(estudiante2);

// agregando libros a la biblioteca
biblioteca.agregarLibro(libro1);
biblioteca.agregarLibro(libro2);


//agregando prestamo
biblioteca.agregarPrestamo(prestamo2);
biblioteca.agregarPrestamo(prestamo1);
//agregando prestamo a estudiante


//creando prestamo
prestamo1.agregarPrestamo(detallePrestamo2);
System.out.println(prestamo1);



    }
}
