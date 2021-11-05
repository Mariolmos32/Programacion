package tema03;

import java.util.Scanner;

public class EjercicioParametro {
	
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		String nombre="";
		
		
		System.out.println("Dime tu nombre: ");
		nombre = in.nextLine();
		in.close();
		
		saludarPersona (nombre);
		
	}
	public static void saludarPersona (String name1) {
		System.out.println("Hola " + name1);
		

		
	}
}
