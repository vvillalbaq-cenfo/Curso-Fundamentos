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
        System.out.println("Ejercicio 03: Encontrar la edad de Ana dentro de diez años");


        Double edadElena;
        edadElena = Utils.leerDoble(("Ingrese la Edad Actual de Elena:"));
        
        Double edadAna = edadElena * 2;
        Double edadAnaDentroDeDiezAños = edadAna + 10;
        
        System.out.println("La edad actual de Anas es: " + edadAna + " años.");
        System.out.println("La edad de Ana dentro de diez años será: " + edadAnaDentroDeDiezAños + " años.");
        System.out.println("Hecho por Victor Villalba Quintana");
    }
}
