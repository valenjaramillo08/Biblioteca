package co.edu.uniquindio.poo;

public class Persona {

    private String nombre;
    private String cedula;
    private String correo;
    private int telefono;

    /**
     * Metodo constructor de la clase Persona 
     * @param nombre
     * @param cedula
     * @param correo
     * @param telefono
     */
    public Persona(String nombre, String cedula, String correo, int telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }

    /**
     * Metodo para obtener el nombre de la persona 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para modificar el nombre 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la edula de la persona 
     * @return
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Metodo para modificar la cedula 
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Metodo para obtener el correo de la persona 
     * @return
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Metodo para modificar el correo
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo para obtener el telefono de la persona 
     * @return
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Metodo para modificar el telefono
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", cedula=" + cedula + ", correo=" + correo + ", telefono=" + telefono
                + "]";
    }

}