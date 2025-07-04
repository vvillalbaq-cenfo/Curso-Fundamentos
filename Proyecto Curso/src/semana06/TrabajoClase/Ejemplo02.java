package semana06.TrabajoClase;

import utilitarios.Utils;

public class Ejemplo02 {
    public static void main(String[] args) {
        // Limpiar la consola
        Utils.limpiarConsola();

        // Declaracion de Variables
        double costoTazas = 0;
        double cantidadTazasPorDia = 0;
        double cantidadDias = 0;
        double gastoTotalMensual = 0;
        double totalHoras = 0;

        // Entrada de Datos
        costoTazas = Utils.leerDoble("Ingrese el costo de cada taza: ");
        cantidadTazasPorDia = Utils.leerDoble("Ingrese la cantidad de tazas que se venden por día: ");
        cantidadDias = Utils.leerDoble("Ingrese la cantidad de días que se trabaja al mes: ");

        // Proceso Gasto mensual
        gastoTotalMensual = costoTazas * cantidadTazasPorDia * cantidadDias;

        // Proceso Total de horas
        totalHoras = cantidadTazasPorDia * 1.5;

        // Salida de Datos
        System.out.println("El joven gastará al mes: " + gastoTotalMensual
                + " y gracias a este consumo es más productivo en una cantidad de horas: " + totalHoras);

    }
}
