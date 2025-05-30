package semana03.ejercicioClase;
import utilitarios.Utils;
public class Ejercicio01 {
    public static void main(String[] args) {
        utilitarios.Utils.limpiarConsola();

        // Variables
        int numero = 0;

        // Entrada
         numero = Utils.leerEntero("Digite el numero: ");

        // Proceso
        if (numero <0) {
            numero = numero *-1;
        }

        // Salida
        System.out.println("El valor absoluto es: " + numero);

    }

}
