package tema04;

import java.util.Scanner;

public class EjercicioBucle {
	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		double num = 0.0;
		
		do{
		
			System.out.println("Dime un número: ");
			num = in.nextDouble();
		
			if (num % 2 == 0){
				System.out.println("Es par");
			} 
			else {
				System.out.println("Es impar");
			}
		
			if (num > 0) {
				System.out.println("Es positivo");
			}
			else {
				System.out.println("Es negativo");
			}
			System.out.println("El cuadrado es: " + (num * num));
		
		}while (num != 0); 
		in.close();
	}
	
}


