package tema03;

import java.util.Scanner;

public class conversorTiempo {
	public static void main (String args[]) {
		Scanner entradaTeclado = new Scanner(System.in);
		
		double segundos = 0;
		
		
		System.out.println("Introduce el numero de segundos: ");
		segundos = entradaTeclado.nextInt();
		
		double hora = segundos / 3600;
		segundos = segundos % 3600;
		double minuto = segundos / 60;
		segundos = segundos % 60;
		
		
		System.out.printf("Hora: %.2f" , hora);
		
		System.out.printf(" Minutos: %.2f"  , minuto);
		
		System.out.println(" Segundo: "  + segundos);

		
		entradaTeclado.close();

		}
}
