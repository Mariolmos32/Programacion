package tema04;

import java.util.Scanner;

public class EstructuraControl {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		
		int numero = 0;
		int sumatorio =0;
		int rep = 0;
		double media = 0.0;
		int numMax = -99999;
		int numMin = 99999;
		
		System.out.println("introduzca el numero de valores que quiere introducir");
		rep = in.nextInt();
		
		for(int i = 0; i < rep; i++) {
			System.out.println("introduzca el numero");
			numero = in.nextInt();
			sumatorio = sumatorio + numero;
		if(numero < numMin) {
			numMin = numero;
		}
		else if(numero > numMax) {
			numMax = numero;
		}
		}
		
		
		
		System.out.println("La suma total es: " + sumatorio);
		media = sumatorio / rep;
		System.out.println("La media es: " + media);
		System.out.println("El numero minimo es " + numMin);
		System.out.println("El numero maximo es " + numMax);
		in.close();
	}
}
