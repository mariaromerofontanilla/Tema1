package ejercicio1;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Variables
		double num1;
		double num2;
		double suma;
		double resta;
		double multi;
		double div;
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		System.out.println("Introduzca un numero: ");
		num1 = sc.nextDouble();
		
		System.out.println("Introduzca otro numero: ");
		num2 = sc.nextDouble();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multi = num1 * num2;
		div = num1 / num2;
		
		System.out.println("La suma de los dos numeros es: " + suma);
		System.out.println("La resta de los dos numeros es: " + resta);
		System.out.println("La multiplicación de los dos numeros es: " + multi);
		

	}

}
