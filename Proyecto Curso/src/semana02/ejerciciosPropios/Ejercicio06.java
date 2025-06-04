package semana02.ejerciciosPropios;
import utilitarios.Utils;
public class Ejercicio06 {

    public static void main(String[] args) {
        Utils.limpiarConsola();

        // Entradas
        double salrioBruto = 0.0;
        double impuestoSalrio = 0.0;
        double salarioNeto = 0.0;
        double salarioColaborador = 0.0;

        salrioBruto = Utils.leerDoble("Ingrese el salario bruto del empleado: ");
        impuestoSalrio = Utils.leerDoble("Ingrese el porcentaje de impuesto sobre el salario: ");
        // Proceso

        salarioNeto = salrioBruto *  impuestoSalrio;
        salarioColaborador =  ( salarioNeto - impuestoSalrio);


        // Salidas
        System.out.println("El salario del colaborador es: " + salarioColaborador); 
    }

}
