package semana06.TrabajoClase;
import utilitarios.Utils;
public class Ejemplo01 {
    public static void main(String[] args) {
      //Limpiar la consola
        Utils.limpiarConsola();

        //Declaracion de Variables
        double costoTransporte = 0;
        double costoHospedaje = 0;
        double costoEntradaEvento = 0;
        double ahorroSemanal = 0;
        double semanas = 0;

        //Entrada de Datos
        costoTransporte= Utils.leerDoble("Ingrese el costo del transporte: ");
        costoHospedaje= Utils.leerDoble("Ingrese el costo del hospedaje: ");
        costoEntradaEvento= Utils.leerDoble("Ingrese el costo de las entradas al evento:");
        semanas = Utils.leerDoble("Ingrese el numero de semanas faltantes para el viaje: ");

        //Proceso
        ahorroSemanal = (costoTransporte + costoHospedaje + costoEntradaEvento) / semanas;

        //Salida de Datos
        System.out.println("El ahorro semanal presupuestado es: " + ahorroSemanal);

    }
}
