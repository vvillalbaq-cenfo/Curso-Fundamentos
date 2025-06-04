package semana02.ejerciciosPropios;

import utilitarios.Utils;

public class Ejercicio03 {
  public static void main(String[] args) {
    Utils.limpiarConsola();
    // Entradas
    int edadElena = 0;
    edadElena = Utils.leerEntero(("Ingrese la Edad Actual de Elena:"));

    // Procesos
    int edadAna = edadElena * 2;
    int edadAnaDentroDeDiezAños = edadAna + 10;

    // Salidas
    System.out.println("La edad actual de Anas es: " + edadAna + " años.");
    System.out.println("La edad de Ana dentro de diez años será: " + edadAnaDentroDeDiezAños + " años.");
    System.out.println("Hecho por Victor Villalba Quintana");
  }
}
