package semana03.ejercicioClase;

import utilitarios.Utils;

public class Ejercicio03 {
    public static void main(String[] args) {
        Utils.limpiarConsola();
        int numero = 0;
        double raiz = 0;

        Utils.limpiarConsola();

        // input
        numero = Utils.leerEntero("Digite el número para extraer la raíz cuadrada: ");

        if (numero > 0) {
            raiz = Math.sqrt(numero);
            System.out.println("La raíz es: " + raiz);
            // redondeo de números
            System.out.println("La raíz es: " + Math.round(raiz));
            System.out.printf("La raíz es: %.2f\n", raiz);
        } else {
            System.out.println("No se puede calcular debido a que es negativo");
        }
    }
}
