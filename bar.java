package tema03;

import java.util.Scanner;


public class bar {
	public static void main (String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);

			int bebida = 0;
			int bocadillo = 0; 
			final double precio1 = 1.25;
			final double precio2 = 2.05;
			
			System.out.println("Cuantas bebidas: ");
			bebida = entradaTeclado.nextInt();
			
			System.out.println("cuantos bocadillos: ");
			bocadillo = entradaTeclado.nextInt();
		
			System.out.println("coste de las bebidas: " + bebida * precio1);
	
			
			System.out.println("coste de las bebidas: " + bocadillo * precio2);
			
		entradaTeclado.close();

	}
}
