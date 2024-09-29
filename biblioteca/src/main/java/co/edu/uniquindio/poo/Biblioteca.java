package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collection;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private double totalDineroRecaudo;
    private Collection<Bibliotecario> bibliotecarios;
    private Collection<Prestamo> prestamos;
    private Collection<Libro> libros;
    private Collection<Estudiante> estudiantes;

    /**
     * Metodo constructor de la clase biblioteca
     * @param nombre
     * @param totalDineroRecaudo
     */
    public Biblioteca(String nombre, double totalDineroRecaudo) {
        this.nombre = nombre;
        this.totalDineroRecaudo = totalDineroRecaudo;
        bibliotecarios = new LinkedList<>();
        prestamos = new LinkedList<>();
        libros = new LinkedList<>();
        estudiantes = new LinkedList<>();
    }
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        if (!verificarBibliotecario(bibliotecario.getCedula())) {
            bibliotecarios.add(bibliotecario);
        }
    }


    public double calcularPorcentajeBibliotecario(Bibliotecario bibliotecario){
        LocalDate hoy = LocalDate.now();
        Period antiguedad = Period.between(bibliotecario.getFechaIngreso(), hoy);
        int aniosAntiguedad = antiguedad.getYears();
        double porcentajeAnios= (0.02*aniosAntiguedad);
        return porcentajeAnios;

    }
    public double salarioBibliotecarios(){
        double salarioTotal=0.0;

        for (Bibliotecario bibliotecario : bibliotecarios) {
            for (Prestamo prestamo : prestamos) {
                if(prestamo.getBibliotecario().getCedula().equals(bibliotecario.getCedula())){
                    salarioTotal+= prestamo.getTotal() * (0.2 + calcularPorcentajeBibliotecario(bibliotecario));
                }

            }
        }
        return salarioTotal;
    }



    /**
     * Metodo para verificar la existencia de un bibliotecario en la biblioteca
     * @param cedula
     * @return centinela
     */
    public boolean verificarBibliotecario(String cedula) {
        boolean centinela = false;
        for (Bibliotecario bibliotecario: bibliotecarios) {
            if (bibliotecario.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para agregar un prestamo
     * @param prestamo
     */
    public void agregarPrestamo(Prestamo prestamo) {
        if (!verificarPrestamo(prestamo.getCodigo())) {
            prestamos.add(prestamo);
        }
    }

    /**
     * Metodo para verificar la existencia de un prestamo
     * @param codigo
     * @return centinela
     */
    public boolean verificarPrestamo(String codigo) {
        boolean centinela = false;
        for (Prestamo prestamo: prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para agregar libro a la biblioteca
     * @param libro
     */
    public void agregarLibro(Libro libro) {
        if (!verificarLibro(libro.getCodigo())) {
            libros.add(libro);
        }
    }

    /**
     * Meetodo para verificar la existencia de un ejemplar de un libro
     * @param codigo
     * @return centinela
     */
    public boolean verificarLibro(String codigo) {
        boolean centinela = false;
        for (Libro libro: libros) {
            if (libro.getCodigo().equals(codigo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para agregar un estudiante
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante) {
        if (!verificarEstudiante(estudiante.getCedula())) {
            estudiantes.add(estudiante);
        }
    }

    /**
     * Metodo para verificar la existencia de un estudiante
     * @param cedula
     * @return centinela
     */
    public boolean verificarEstudiante(String cedula) {
        boolean centinela = false;
        for (Estudiante estudiante: estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo para agregarle un prestamo a un estudiante
     * @param codigo
     * @return
     */

    /**
     * Metodo para buscar los datos de un libro mediante su codigo unico
     * @param codigo
     * @return mensaje
     */
    public String datosLibro(String codigo){
        String mensaje="";
        for (Libro libro : libros) {
            if(libro.getCodigo().equals(codigo)){
                mensaje= libro.toString();
            }
            else{
                mensaje= "El libro no se encontro.";
            }
        }
        return  mensaje;
    }

    /**
     * Metodo que muestra el estudiante con mas prestamos
     * @return
     */
    public String estudianteConMasPrestamos(){
        String nombreComun="";
        int contadorPrincipal=0;

        for (Prestamo prestamo: prestamos) {
            int contador=0;
            String nombreAnalisis = prestamo.getEstudiante().getNombre();

            for (Prestamo prestamo2 : prestamos) {
                if(prestamo2.getEstudiante().getNombre().equals(nombreAnalisis)){
                    contador ++;
                }

            }
            if(contadorPrincipal < contador){
                nombreComun= nombreAnalisis;
                contadorPrincipal= contador;
            }

        }
        return nombreComun;
    }
    /**
     * Metodo para contar los prestamos actuales en la Biblioteca
     * @return cont
     */
    public int cantidadPrestamos(){
        int cont = 0;
        for (Prestamo prestamo: prestamos) {
                cont++;
        }
        return cont;
    }

        /**
     * Metodo que nos muestra los detalles de un prestamo
     * @return
     */
     public String datosPrestamo(String codigo){
        String mensaje="";
        for (Prestamo prestamo: prestamos) {
            if(prestamo.getCodigo().equals(codigo)){
                mensaje= prestamo.toString();
            }
            else{
                mensaje= "El prestamo no se encontro.";
            }
        }
        return  mensaje;
    }

    public void reemplazarLibro(String codigo, Libro libroNuevo){

        for (Libro libro : libros) {
            if(codigo.equals(libro.getCodigo())){
                libro.setAutor(libroNuevo.getAutor());
                libro.setEditorial(libroNuevo.getEditorial());
                libro.setEstado(libroNuevo.isEstado());
                libro.setFechaPublicacion(libroNuevo.getFechaPublicacion());
                libro.setIsbn(libroNuevo.getIsbn());
                libro.setTitulo(libroNuevo.getTitulo());
                libro.setUnidadesDisponibles(libroNuevo.getUnidadesDisponibles());
            }
            else{
                System.out.println("El libro no fue encontrado para modificarlo");
            }
        }
    }


     /**
     * Metodo para mostrar el total monetario del prestamo y regresar la cantidad de libros al inventario
     * @param codigo
     * @param nombreLibro
     */
    public void devolucionPrestamo(String codigo,int cantidad,  Libro libro){
        for (Prestamo prestamo : prestamos) {

            if(prestamo.getCodigo().equals(codigo)){
                System.out.println("el vlaor del prestamos es: " + prestamo.getTotal());

                for (DetallePrestamo detallePrestamo : prestamo.getDetallePrestamos()){
                    if(detallePrestamo.getLibro().getCodigo().equals(libro.getCodigo())){
                      libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() + cantidad);
                    }
                }
            }
        }
    }
    /**
     * Metodo para contar los prestamos de cada bibliotecario
     * @param cedula
     * @return
     */
    public int prestamosBibliotecario(String cedula){
        int contador=0;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getBibliotecario().getCedula().equals(cedula)) {
                contador++;
                }
        }
        return contador;
    }

    /**
     * Metodo que muestra el total de dinero recaudado por la empresa
     * @return
     */
    public double dineroRecaudado(){
        double total=0.0;
        for (Prestamo prestamo : prestamos) {
            total+=prestamo.getTotal();

        }
        return total;
    }
    * Metodo para hallar la cantidad de prestamos que ha tenido cada libro
    * @param titulo
    * @return
    */
   public int cantidadPrestamos(Libro libro){
       int cont = 0;
       for (Prestamo prestamo : prestamos) {
           for (DetallePrestamo detallePrestamo : prestamo.getDetallePrestamos()) {
               if(detallePrestamo.getLibro().getCodigo().equals(libro.getCodigo())){

                   cont++;

               }
           }
       }
       return cont;
   }
   /**
   * Meetodo para verificar la existencia de ejemplares disponibles para prestar de un libro
   * @param codigo
   * @return
   */
  public boolean verificarEstadoLibro(String codigo) {
      boolean centinela = false;
      for (Libro libro : libros) {
          if (libro.getCodigo().equals(codigo)){

              if (libro.getUnidadesDisponibles() > 0) {
              centinela = true;
              }
          }
      }
      return centinela;
  }

  /**
   * Metodo para disminuir las cantidades disponibles del libro
   * @param cantidad
   */
  public void modificarCantidad(Libro libro, int cantidad){
      if(verificarEstadoLibro(libro.getCodigo())){
          if (libro.getUnidadesDisponibles()> cantidad){

              libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() - cantidad);
          }

          else if(libro.getUnidadesDisponibles() == cantidad){
              libro.setEstado(false);
              libro.setUnidadesDisponibles(libro.getUnidadesDisponibles() - cantidad);
          }

          else{
              System.out.println("Las unidades disponibles no son suficientes para realizar el prestamo");
          }


      }
      else{
          System.out.println("El estado del libro actualmente esta en -no disponible-");
      }
  }































    /**
     * Metodo para obtener el nombre de la biblioteca
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para modificar el nombre de biblioteca
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //mirar si en ves de dejarlo como un dato ponerlo como una funcion de la suma de todos los totales de los prestamos
    /**
     * Metodo para obtener el total de dinero recudado
     * @return
     */
    public double getTotalDineroRecaudo() {
        return totalDineroRecaudo;
    }

    /**
     * Metodo para modificar el total de dinero recaudado
     * @param totalDineroRecaudo
     */
    public void setTotalDineroRecaudo(double totalDineroRecaudo) {
        this.totalDineroRecaudo = totalDineroRecaudo;
    }

    /**
     * Metodo para obtener la lista de bibliotecarios
     * @return
     */
    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    /**
     * Metodo para modificar la lista de bibliotecarios
     * @param bibliotecarios
     */
    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    /**
     * Metodo para obtener la lista de prestamos
     * @return
     */
    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * Metodo para modificar la lista de prestamos
     * @param prestamos
     */
    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    /**
     * Metodo para obtener la lista de Libros
     * @return
     */
    public Collection<Libro> getLibros() {
        return libros;
    }

    /**
     * Metodo para modificar la lista de Libros
     * @param libros
     */
    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Metodo para obtener la lista de Estudiantes
     * @return
     */
    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /**
     * Metodo para modificar la lista de Estudiantes
     * @param estudiantes
     */
    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", totalDineroRecaudo=" + totalDineroRecaudo + ", bibliotecarios="
                + bibliotecarios + ", prestamos=" + prestamos + ", libros=" + libros + ", estudiantes=" + estudiantes
                + "]";
    }

}
