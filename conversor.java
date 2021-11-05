package tema03;

import java.util.Scanner;

public class conversor {
	public static void main (String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		int euros = 0;
		
		System.out.println("Introduce los euros que quiere cambiar: ");
		euros = entradaTeclado.nextInt();
		
		double dolar = 1.16 * euros;
		double libra = 0.86 * euros;
		double yene = 129.18 * euros;
		
		System.out.println(euros + " euros son " + dolar + " dolares");
		
		System.out.println(euros + " euros son " + libra + " libras");
		
		System.out.println(euros + " euros son " + yene + " yenes");
	
	entradaTeclado.close();
	
	}
}
