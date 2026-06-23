package model;

/**
 * Representa un tour ofrecido por la agencia Llanquihue Tour.
 * Contiene una referencia a un Operador, aplicando composicion.
 */
public class Tour {

    // Nombre del tour.
    private String nombre;
    // Tipo de tour, por ejemplo: lacustre, gastronomico, cultural.
    private String tipo;
    // Precio del tour en pesos chilenos.
    private double precio;
    // Operador responsable de ejecutar el tour.
    private Operador operador;

    public Tour(String nombre, String tipo, double precio, Operador operador) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.operador = operador;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public Operador getOperador() { return operador; }
    public void setOperador(Operador operador) { this.operador = operador; }

    @Override
    public String toString() {
        return "Tour: " + nombre + " | Tipo: " + tipo + " | Precio: $" + precio + " | Operador: " + operador;
    }
}