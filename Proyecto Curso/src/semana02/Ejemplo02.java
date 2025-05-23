package semana02;

import utilitarios.Utils;

public class Ejemplo02 {
    public static void main(String[] args) {
        Utils.limpiarConsola();
        Utils.establecerColorAzul();
        System.out.println("Ahora es azul");
        Utils.establecerColorAmarillo();
        System.out.println("Ahora es amarillo");
        Utils.reiniciarColores();
        
    }
}