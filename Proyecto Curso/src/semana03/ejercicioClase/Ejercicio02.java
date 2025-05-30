package semana03.ejercicioClase;

import utilitarios.Utils;

public class Ejercicio02 {
    public static void main(String[] args) {
        Utils.limpiarConsola();
        int numero = 0;
        // input
        numero = Utils.leerEntero("Digite el número a evaluar: ");
        // process con output
        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}
