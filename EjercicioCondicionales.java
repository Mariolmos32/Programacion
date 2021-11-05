package tema04;

import java.util.Scanner;

public class EjercicioCondicionales {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
			
			int a = 0;
			int b = 0;
		
			System.out.println("Introduce el numero que quiera: ");
			a = in.nextInt();
			
			System.out.println("Introduce el numero que quiera: ");
			b = in.nextInt();
			
			if(a < b) {
				System.out.println("El valor a es menor que el valor b");
			}
			else if(a > b) {
				System.out.println("El valor b es menor que el valor a");
			}
			else {
				System.out.println("Tienen el mismo valor");
			}
			
			in.close();
		}
		
}
