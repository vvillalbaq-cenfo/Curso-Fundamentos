package semana04.ejerciciosPropios;
import utilitarios.Utils;
public class Ejercicio01 {
    public static void main(String[] args) {
        //Variables
        double montoFinal = 0, cantidadCompras = 0, montoCompras = 0;

        // Limpiar la consola
        Utils.limpiarConsola();

        // Entrada de datos
        cantidadCompras = Utils.leerDoble("Digite la cantidad de compras: ");
        montoCompras = Utils.leerDoble("Digite el monto de las compras: ");

        // Proceso 
        if (cantidadCompras >= 6 && montoCompras >= 10000) {
            Utils.establecerColorVerde();
            montoFinal = montoCompras - montoCompras * 0.35;
        } else {
            Utils.establecerColorRojo();
            montoFinal = montoCompras;
        }

        // Salida
        System.out.println("Monto final: " + montoFinal);

        // Reiniciar colores
        Utils.reiniciarColores();
    }

}
