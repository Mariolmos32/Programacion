package tema03;

import java.util.Scanner;

public class nomina {
	public static void main (String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		double salario = 0;
		int pagas = 0;
		final double IVA = 0.21;
		double salarioNeto = 0.0;
		
		System.out.println("Introduce el sueldo bruto anual: ");
		salario = entradaTeclado.nextInt();

		System.out.println("Introduce el numero de pagas: ");
		pagas = entradaTeclado.nextInt();
		
		System.out.println("el salario bruto anual es: " + salario);
		
		
		salarioNeto = (salario - (salario * IVA));
		
		
		System.out.println("El salario neto anual es: " + salarioNeto);
		
		System.out.printf("El salario bruto mensual es: %.2f" , (salario / pagas) , " en 14 pagas");
		
		System.out.printf(" El salario neto mensual es: %.2f" , (salarioNeto / pagas));
		
		entradaTeclado.close();
	}
	
}
