package semana02.ejerciciosPropios;
import utilitarios.Utils;
public class Ejercicio03 {
         public static void main(String[] args) {
      /*
       Encontrar la edad de Ana dentro de diez años, si la edad de Ana es dos veces la edad de
       Elena. El programa recibe como entrada la edad actual de Elena, y debe imprimir la edad
       de Ana dentro de diez años.
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
