package tema03;

import java.util.Scanner;

public class formatoPersonas {
	public static void main (String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
	
		String nombre = "";
		int altura = 0;
		int edad = 0;
		boolean carne = false;
		String dni = "";
		boolean SI = true;
		
		System.out.println("Dime tu nombre: ");
		nombre = entradaTeclado.nextLine();
		
		System.out.println("Dime tu altura: ");
		altura = entradaTeclado.nextInt();
		
		System.out.println("Dime tu edad: ");
		edad = entradaTeclado.nextInt();
		
		System.out.println("Tiene carnet de conducir (true:SI / false:NO) ");
		carne = entradaTeclado.nextBoolean();
		
		System.out.println("Dime tu letra del DNI: ");
		dni = entradaTeclado.nextLine();
		dni = entradaTeclado.next();
		
		System.out.println("Nombre " + nombre + ", altura " + altura + "cm, " + "edad " + edad + ", carnet " + SI + ", dni: " + dni);
	  
	entradaTeclado.close();
	}
}
