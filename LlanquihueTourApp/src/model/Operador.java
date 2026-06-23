package model;

/**
 * Representa al operador responsable de un tour en Llanquihue Tour.
 */
public class Operador {

    // Nombre del operador turistico.
    private String nombre;
    // Telefono de contacto del operador.
    private String telefono;

    public Operador(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    @Override
    public String toString() {
        return nombre + " (" + telefono + ")";
    }
}