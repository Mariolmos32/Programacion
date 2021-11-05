package tema04;

import java.util.Scanner;

public class Numerodecimales {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		double a = 0.0;
		
		System.out.println("Introdce un numero con decimales: ");
		a = in.nextDouble();
		
		if(a == 0) {
			System.out.printf("El numero es 0");
		}
		else if (a>-1&&a<1) {
			System.out.printf("El numero es casi cero");
		}
		else {
			System.out.printf("El numero no se acerca al cero");
		}
		
		in.close();
	}
}
