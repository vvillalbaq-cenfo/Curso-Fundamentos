package semana02;

import utilitarios.Utils;

public class Ejemplo01 {
    public static void main(String[] args) {
        Utils.limpiarConsola();
        // Este es un comentario
        System.out.println("Mi primer código en Java");
        Utils.establecerColorRojo();
        System.out.println("y en color rojo");
        Utils.establecerColorAzul();
        System.out.println("también azulado");
        Utils.reiniciarColores();
    }

}