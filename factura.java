package tema03;

import java.util.Scanner;

public class factura {
	public static void main (String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		int precio = 0;
		final double IVA = 0.21;
		
		System.out.println("Introduce el precio base: ");
		precio = entradaTeclado.nextInt();
		
		System.out.println("Precio base: " + precio);
		
		System.out.println("Con IVA:" + IVA);
		
		System.out.println("importe factura: " + ((precio * IVA) + precio));
		
		entradaTeclado.close();
		
	}
	
}
