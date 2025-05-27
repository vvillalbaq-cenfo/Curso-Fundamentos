package semana02;

import utilitarios.Utils;

public class Ejemplo03 {
public static void main(String[] args) {
Utils.limpiarConsola();

double diametro, radio, area;

diametro = Utils.leerDoble("Porfavor digte el diametro: ");
radio = diametro /2;
area = radio * radio * 3.141516;

System.out.println("Area: " + area);  
System.out.println("Hecho por Victor Villalba Quintana");  
}
}