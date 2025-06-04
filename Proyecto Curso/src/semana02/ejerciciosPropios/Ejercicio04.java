package semana02.ejerciciosPropios;

import utilitarios.Utils;

public class Ejercicio04 {
    public static double DIFERENCIA_EDAD = 18;
    public static double ANNO_ACTUAL = 2025;

    public static void main(String[] args) {
        double edadAbuela = 0.0, annoMatrimonio = 0.0, cantidadAnnos = 0.0;
        Utils.limpiarConsola();
        // Entradas
        annoMatrimonio = Utils.leerDoble("Digitar año de Matrimonio: ");
        // Proceso
        cantidadAnnos = ANNO_ACTUAL - annoMatrimonio;
        edadAbuela = cantidadAnnos + DIFERENCIA_EDAD;
        // Output
        System.out.println("La edad de la abuela hoy es: " + edadAbuela);
    }
}
