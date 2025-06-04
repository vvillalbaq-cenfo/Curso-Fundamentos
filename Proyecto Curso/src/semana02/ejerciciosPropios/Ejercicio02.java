package semana02.ejerciciosPropios;

import utilitarios.Utils;

public class Ejercicio02 {
  public static void main(String[] args) {
    Utils.limpiarConsola();
    // Entradas
    Double kilometrajeInicio = 0.0;
    kilometrajeInicio = Utils.leerDoble(("Ingrese el Kilometraje Inicial:"));
    Double kilometrajeFinal = 0.0;
    kilometrajeFinal = Utils.leerDoble(("Ingrese el Kilometraje Final: "));

    // Procesos
    Double totalKilometraje = 0.0;
    totalKilometraje = kilometrajeFinal - kilometrajeInicio;

    // Salidas
    System.out.println("Kilometros Recorridos: " + totalKilometraje + "Km");
    System.out.println("Hecho por Victor Villalba Quintana");
  }
}
