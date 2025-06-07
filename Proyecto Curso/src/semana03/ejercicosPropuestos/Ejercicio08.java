package semana03.ejercicosPropuestos;

import utilitarios.Utils;

public class Ejercicio08 {
    public static void main(String[] args) {
        // Limpiar la consola
        Utils.limpiarConsola();

        // Declaración de variables
        double notaPrimerExamen = 0;
        double notaSegundoExamen = 0;
        double notaTercerExamen = 0;     
        double promedioExamenes = 0;   

        // Entradas
        notaPrimerExamen = Utils.leerDoble("Ingrese la nota del primer examen: ");
        notaSegundoExamen = Utils.leerDoble("Ingrese la nota del segundo examen: ");
        notaTercerExamen = Utils.leerDoble("Ingrese la nota del tercer examen: ");

        // Proceso
        promedioExamenes = (notaPrimerExamen + notaSegundoExamen + notaTercerExamen) / 3.0;

        // Salida
        if (promedioExamenes >= 70 ) {
            System.out.println("El estudiante ha aprobado el curso con un promedio de: " + promedioExamenes);
        } else {
            System.out.println("El estudiante ha reprobado el curso con un promedio de: " + promedioExamenes);
        } 
    }

}
