package ejercicio1;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Variables
		double teoria;
		double practica;
		double nota;
		Scanner sc = new Scanner(System.in);
		
		//mensajes
		System.out.println("Escriba su nota de teoria: ");
		teoria = sc.nextDouble();
		
		System.out.println("Escriba su nota de practica: ");
		practica = sc.nextDouble();
		
		nota = (teoria + practica) /2;
		System.out.println("Su nota media es: " + nota);
		
		//Cierre
		sc.close();

	}

}
