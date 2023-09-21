package ejercicio1;
import java.util.Scanner;

public class Ejercicioespañol1 {

	public static void main(String[] args) {
		//variables
		int edad;
		Scanner sc = new Scanner(System.in);
		
		//Mensajes
		System.out.print("Introduzca su edad: ");
		edad = sc.nextInt();
		edad++;
		
		System.out.println("El próximo año tendrás: " + edad);
		
		//cierre
		sc.close();

	}

}
