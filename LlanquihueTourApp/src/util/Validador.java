package util;

/**
 * Clase utilitaria con metodos de validacion basica para los datos del sistema.
 */
public class Validador {

    // Verifica que el texto no sea nulo ni este vacio.
    public static boolean textoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    // Verifica que el precio sea un numero mayor a cero.
    public static boolean precioValido(double precio) {
        return precio > 0;
    }

    // Intenta convertir un texto a double y retorna true si es valido.
    public static boolean esNumeroValido(String texto) {
        try {
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
            // Si no se puede convertir, el dato no es valido.
            return false;
        }
    }
}