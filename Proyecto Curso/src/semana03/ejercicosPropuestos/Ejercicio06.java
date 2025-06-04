package semana03.ejercicosPropuestos;

import utilitarios.Utils;

public class Ejercicio06 {
    public static double PORCENTAJE_IMPUESTO = 0.10;

    public static void main(String[] args) {
        double salarioBruto = 0, salarioNeto = 0, excedente = 0, montoImpuesto = 0;

        // inputs
        salarioBruto = Utils.leerDoble("Digite su salario bruto: ");

        // process
        if (salarioBruto >= 1000000) {
            excedente = salarioBruto - 1000000;
            montoImpuesto = excedente * PORCENTAJE_IMPUESTO;
        } else {
            montoImpuesto = 0;
        }
        salarioNeto = salarioBruto - montoImpuesto;
        System.out.println(salarioNeto);
    }
}
