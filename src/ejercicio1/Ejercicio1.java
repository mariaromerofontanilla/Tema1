package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Detectación de variable
		int numero;
		Scanner sc = new Scanner (System.in); 
		
		//Intrucciones
		System.out.println("Introduzca un numero: ");
		numero = sc.nextInt();
		
		System.out.println("Su numero es: " + numero);
		
		//Cierre
		sc.close();

	}

}
