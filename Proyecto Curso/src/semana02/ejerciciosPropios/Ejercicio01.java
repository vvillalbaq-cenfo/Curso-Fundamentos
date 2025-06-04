package semana02.ejerciciosPropios;

import utilitarios.Utils;

public class Ejercicio01 {
  public static void main(String[] args) {
    Utils.limpiarConsola();
    // Entradas
    String nombreProducto = Utils.leerString(("Ingrese el nombre del producto:"));

    // Procesos
    Double precioProducto = Utils.leerDoble(("Ingrese el precio del producto: "));
    Double iva = 0.13;
    Double calculoIVA = precioProducto * iva;
    Double precioFinal = precioProducto + calculoIVA;

    // Salidas
    System.out.println("Nombre del producto: " + nombreProducto);
    System.out.println("Precio del producto: " + precioProducto);
    System.out.println("Precio final con IVA: " + precioFinal);
    System.out.println("Hecho por Victor Villalba Quintana");
  }
}