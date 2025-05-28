package semana02.practicaClase;
import utilitarios.Utils;
public class Practica12 {
        public static void main(String[] args) {
        Utils.limpiarConsola();
        
        //Entradas    
        double montoSalario = Utils.leerDoble("Ingrese el monto del salario por hora");
        double marcaEntrada = Utils.leerDoble("Ingrese la hora de entrada");
        double marcaSalida = Utils.leerDoble("Ingrese la hora de salida");

        //Proceso
        double horasTrabajadas = marcaSalida - marcaEntrada;
        double salario = horasTrabajadas * montoSalario;

        //Salida
        System.out.println("Horas trabajadas corresponden a: " + horasTrabajadas + " horas. Salario correspondiente: " + salario);
    }
}
