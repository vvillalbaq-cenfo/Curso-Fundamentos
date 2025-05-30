package semana03.ejercicosPropuestos;
import utilitarios.Utils;
public class Ejercicio03 {
    public static void main(String[] args) {
        // Limpiar la consola
        Utils.limpiarConsola();

        // Declaración de variables
        double notaEstudiante = 0;

        // Entrada de datos
        notaEstudiante = Utils.leerDoble("Ingrese la nota del estudiante: ");

        // Proceso y Salida
        if (notaEstudiante >=70) {
            System.out.println("El estudiante ha aprobado el curso.");
        } else {
            System.out.println( "El estudiante ha reprobado el curso.");
        }
    }
}
