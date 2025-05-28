package semana02.practicaClase;

import utilitarios.Utils;

public class Practica01 {
    public static double PRECIO_UNITARIO = 10;
    public static double COSTO_UNITARIO = 5.5;

    public static void main(String[] args) {
        Utils.limpiarConsola();

        int cantidadProducto = 0;
        double utilidadUnitaria = 0.0, utilidadTotal = 0.0, utilidadHugo = 0.0, utilidadPaco = 0.0, utilidadLuis = 0.0;

        // inputs
        cantidadProducto = Utils.leerRangosEnteros("Digite la cantidad de limonadas: ", 1, 100);

        // process
        utilidadUnitaria = PRECIO_UNITARIO - COSTO_UNITARIO;
        utilidadTotal = utilidadUnitaria * cantidadProducto;
        utilidadHugo = utilidadTotal * 0.4;
        utilidadLuis = utilidadTotal * 0.3;
        utilidadPaco = utilidadTotal * 0.3;

        // out
        System.out.println("Hugo: " + utilidadHugo);
        System.out.println("Luis: " + utilidadLuis);
        System.out.println("Paco: " + utilidadPaco);
    }
}