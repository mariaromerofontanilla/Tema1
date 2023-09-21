package ejercicio1;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//variables
		int añoAct;
		int añoNac;
		int edad;
		Scanner sc = new Scanner(System.in);
		
		//Mensajes
		System.out.print("Introduzca el año actual: ");
		añoAct = sc.nextInt();
		System.out.print("Introduzca su año de nacimiento: ");
		añoNac = sc.nextInt();
		edad = añoAct - añoNac;
		System.out.println("Su edad es: " + edad);
		
		//Cierre
		sc.close();
		
	}

}
