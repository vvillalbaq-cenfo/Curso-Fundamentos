package semana02.ejerciciosPropios;
import utilitarios.Utils;
public class Ejercicio03 {
         public static void main(String[] args) {
      /*
    Calcular la cantidad de kilómetros de un viaje realizado en carro. El algoritmo debe recibir
    el kilometraje del vehículo antes de iniciar el viaje, y el kilometraje del vehículo al terminar
    el viaje. Se debe imprimir el total de kilómetros del viaje.
      */ 
        Utils.limpiarConsola();
        System.out.println("Ejercicio 02: Calcular la cantidad de kilómetros de un viaje realizado en carro");
        

        Double kilometrajeInicio;
        kilometrajeInicio = Utils.leerDoble(("Ingrese el Kilometraje Inicial:"));
        
        Double kilometrajeFinal;
        kilometrajeFinal = Utils.leerDoble(("Ingrese el Kilometraje Final: "));

        Double totalKilometraje = kilometrajeFinal - kilometrajeInicio;
        
        System.out.println("Kilometros Recorridos: " + totalKilometraje + "Km");
        System.out.println("Hecho por Victor Villalba Quintana");
    }
}
