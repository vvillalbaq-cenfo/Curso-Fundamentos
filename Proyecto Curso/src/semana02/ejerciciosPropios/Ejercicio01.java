package semana02.ejerciciosPropios;
import utilitarios.Utils;
public class Ejercicio01 {
  public static void main(String[] args) {
    /*
       Encontrar la edad de Ana dentro de diez años, si la edad de Ana es dos veces la edad de
       Elena. El programa recibe como entrada la edad actual de Elena, y debe imprimir la edad
       de Ana dentro de diez años.
    */
    Utils.limpiarConsola();
    System.out.println("Ejercicio 03: Encontrar la edad de Ana dentro de diez años");

    String nombreProducto;
    nombreProducto = Utils.leerString(("Ingrese el nombre del producto:"));

    Double precioProducto;
    precioProducto = Utils.leerDoble(("Ingrese el precio del producto: "));

    Double iva = 0.13;
    Double calculoIVA = precioProducto * iva;
    Double precioFinal = precioProducto + calculoIVA;

    System.out.println("Nombre del producto: " + nombreProducto);
    System.out.println("Precio del producto: " + precioProducto);
    System.out.println("Precio final con IVA: " + precioFinal);
    System.out.println("Hecho por Victor Villalba Quintana");
  }
}