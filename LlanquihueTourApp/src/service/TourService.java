package service;

import model.Operador;
import model.Tour;
import util.Validador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase que gestiona la carga de datos y las operaciones sobre los tours.
 */
public class TourService {

    // Lista donde se almacenan todos los tours cargados.
    private ArrayList<Tour> tours;

    public TourService() {
        tours = new ArrayList<>();
    }

    // Lee el archivo .txt y carga los tours en la lista.
    public void cargarDesdeArchivo(String ruta) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            String linea;

            // Se recorre cada linea del archivo.
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(";");

                // Se valida que la linea tenga los 5 campos esperados.
                if (partes.length == 5) {
                    String nombre = partes[0];
                    String tipo = partes[1];
                    String precioTexto = partes[2];
                    String operadorNombre = partes[3];
                    String operadorTelefono = partes[4];

                    // Se valida que los datos sean correctos antes de crear el objeto.
                    if (Validador.textoValido(nombre) && Validador.esNumeroValido(precioTexto)) {
                        double precio = Double.parseDouble(precioTexto);
                        Operador operador = new Operador(operadorNombre, operadorTelefono);
                        tours.add(new Tour(nombre, tipo, precio, operador));
                    }
                }
            }

            lector.close();

        } catch (IOException e) {
            // Si el archivo no se encuentra, se muestra el error.
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Retorna todos los tours cargados.
    public ArrayList<Tour> getTours() {
        return tours;
    }

    // Filtra y retorna los tours que coinciden con el tipo indicado.
    public ArrayList<Tour> filtrarPorTipo(String tipo) {
        ArrayList<Tour> resultado = new ArrayList<>();
        for (Tour t : tours) {
            if (t.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(t);
            }
        }
        return resultado;
    }

    // Filtra y retorna los tours con precio menor al valor indicado.
    public ArrayList<Tour> filtrarPorPrecio(double precioMaximo) {
        ArrayList<Tour> resultado = new ArrayList<>();
        for (Tour t : tours) {
            if (t.getPrecio() < precioMaximo) {
                resultado.add(t);
            }
        }
        return resultado;
    }
}