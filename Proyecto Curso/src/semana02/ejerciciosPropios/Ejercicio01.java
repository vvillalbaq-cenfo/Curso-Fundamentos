package semana02.ejerciciosPropios;
import utilitarios.Utils;
public class Ejercicio01 {
  public static void main(String[] args) {
    /*
       Calcular el precio final de cualquier producto, si se sabe que la tasa de impuesto al valor
       agregado es de un 13 %. El algoritmo debe recibir el nombre del producto y el precio, y
       debe imprimir el nombre del producto y el precio final. Para los efectos del ejercicio,
       TODOS los productos pagan impuesto.
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