package semana04.ejercicioClase;

import utilitarios.Utils;

public class Ejercicio01 {
    public static void main(String[] args) {
        Utils.limpiarConsola();
        // Variables
        int diaHoy = 0;
        int mesHoy = 0;
        int annoHoy = 0;
        int diaMannana = 0;
        int mesMannana = 0;
        int annoMannana = 0;
        int ultimoDiaMes = 0;

        // Entradas
        diaHoy = Utils.leerEntero("Ingrese el día de hoy: ");
        mesHoy = Utils.leerEntero("Ingrese el mes de hoy: ");
        annoHoy = Utils.leerEntero("Ingrese el año de hoy: ");

        // Proceso

        // Validacion del mes
        if (mesHoy >= 1 && mesHoy <= 12) {
            if (mesHoy == 1 || mesHoy == 3 || mesHoy == 5 || mesHoy == 7 || mesHoy == 8 || mesHoy == 10 || mesHoy == 12) {
                ultimoDiaMes = 31;
            } else {
                if (mesHoy == 2) {
                    ultimoDiaMes = 28;
                } else {
                    ultimoDiaMes = 30;
                }
            }

        } else {
            // Si el mes no es válido, se muestra un mensaje de error
            System.out.println("El mes ingresado no es válido. Debe estar entre 1 y 12.");
        }

        // Validación del día
        if (diaHoy >= 1 && diaHoy <= ultimoDiaMes) {
            if (diaHoy == ultimoDiaMes) {
                diaMannana = 1;
                if (mesHoy == 12) {
                    mesMannana = 1;
                    annoMannana = annoHoy + 1;
                } else {
                    mesMannana = mesHoy + 1;
                    annoMannana = annoHoy;
                }
            } else {
                diaMannana = diaHoy + 1;
                mesMannana = mesHoy;
                annoMannana = annoHoy;
            }
        } else {
            // Si el día no es válido, se muestra un mensaje de error
            System.out.println("El día ingresado no es válido. Debe estar entre 1 y " + ultimoDiaMes + ".");
        }

        // Salida
        System.out.println("Fecha de mañana: " + diaMannana + "/" + mesMannana + "/" + annoMannana);

    }

}
