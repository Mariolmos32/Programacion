package tema04;

import java.util.Scanner;

public class PruebaIfElse {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
	
		//Declaracion de variable
		int a = 0;
		String s;
		
		//Introduce el valor
		System.out.println("Introduce el numero que quiera: ");
		a = in.nextInt();
		
		//Condicional 
		if(a % 2 == 0) {
			s="El numero es par";
		}
		else {
			System.out.println("El numero es impar");
		}
		
		in.close();
	}
}
