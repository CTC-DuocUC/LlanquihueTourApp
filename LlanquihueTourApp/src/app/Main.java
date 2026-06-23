package app;

import model.Tour;
import service.TourService;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Se crea el servicio y se cargan los datos desde el archivo.
        TourService servicio = new TourService();
        servicio.cargarDesdeArchivo("resources/tours.txt");

        // Se muestran todos los tours disponibles.
        System.out.println("===== TODOS LOS TOURS =====");
        for (Tour t : servicio.getTours()) {
            System.out.println(t);
        }

        // Se filtran los tours de tipo gastronomico.
        System.out.println();
        System.out.println("===== TOURS GASTRONOMICOS =====");
        ArrayList<Tour> gastronomicos = servicio.filtrarPorTipo("gastronomico");
        for (Tour t : gastronomicos) {
            System.out.println(t);
        }

        // Se filtran los tours con precio menor a $20.000.
        System.out.println();
        System.out.println("===== TOURS MENORES A $20.000 =====");
        ArrayList<Tour> economicos = servicio.filtrarPorPrecio(20000);
        for (Tour t : economicos) {
            System.out.println(t);
        }
    }
}