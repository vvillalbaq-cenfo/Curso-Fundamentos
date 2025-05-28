package semana02.practicaClase;
import utilitarios.Utils;

public class Practica08 {
     public static final double PORCENTAJE_IMPUESTO = 0.30;
    public static final double GANANCIA_VENDEDOR = 0.10;

    public static void main(String[] args) {

        double costoUnitario = Utils.leerDoble("Ingresar precio del vehículo");

        double precioFinalImpuesto = costoUnitario * PORCENTAJE_IMPUESTO;
        double precioFinalVendedor = costoUnitario * GANANCIA_VENDEDOR;
        double precioFinal = costoUnitario + precioFinalImpuesto + precioFinalVendedor;

        // Salida
        System.out.println("Precio final del vehículo: " + precioFinal);
    }
}
