package ejercicio1;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//variables
		double log;
		double circum;
		double rad;
		Scanner sc = new Scanner(System.in);
		
		//Intrucciones
		System.out.print("Introduce el radio: ");
		rad = sc.nextDouble();
		log = 2 * Math.PI * rad;
		circum = Math.PI * Math.pow(rad, 2);
		System.out.println("La longitud es: " + log + " y la circumferencia es: " + circum);
		
		//Cierre
		sc.close();

	}

}
