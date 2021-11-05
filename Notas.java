package tema04;

import java.util.Scanner;

public class Notas {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		Double a = 0.0;
		
		System.out.println("Califica nuestro trabajo: ");
		a = in.nextDouble();
		
		if(a<5) {
			System.out.println("Insuficiente");
		}
		else if (a>5 && a<7) {
			System.out.println("Bien");
		}
		else if (a>7 && a<9) {
			System.out.println("Notable");
		}
		else {
			System.out.println("Sobresaliente");
		}
		in.close();
	}
}
