package co.edu.uniquindio.biblioteca.services;

import co.edu.uniquindio.biblioteca.model.Libro;
import co.edu.uniquindio.biblioteca.model.Usuario;

public interface IModelFactoryServices {
   String datosLibro(String codigo);
   String miembroConMasPrestamos();
   String prestamoLibro(String isbn);

}
