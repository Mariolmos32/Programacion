package tema03;

import java.util.Scanner;

public class practicaMetodos {
	private static Scanner entradaTeclado;

	public static void main (String args[]) {
		entradaTeclado = new Scanner(System.in);
				String nombre = "";
				
		saludar();
		
		System.out.println("Introduzca su nombre ");
		nombre = entradaTeclado.nextLine();
		saludarPersona(nombre);
	}
	
	public static void saludar() {
		System.out.println("Bienvenidos a programacion ");
		
	}
	
	public static void saludarPersona (String nomb) {
		System.out.println("Hola " + nomb);
		
		entradaTeclado.close();
	}
	
}
