package tema03;

import java.util.Scanner;

public class compra {
	public static void main (String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);

		//variables
			double precio = 0.0;
			double IVA = 0.0;
		
		//Preguntamos al cliente 
			System.out.println("Introduce el precio de la compra: ");
				precio= entradaTeclado.nextInt();
				
			System.out.println("Introduce el IVA aplicado: ");
				IVA = entradaTeclado.nextInt();
		
		//Operaciones
				double valorNeto = precio - (precio * IVA);
				double aplicado = precio * IVA;
				
		//resultado en pantalla  
			System.out.println("El valor neto de la compra fue: " + valorNeto);
			
			System.out.println("El IVA aplicado fue " + aplicado);
			
		entradaTeclado.close();
	}
}
