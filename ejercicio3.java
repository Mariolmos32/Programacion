package tema02;

	//import java.time.*;

public class ejercicio3 {
	public static void main  (String args[]) {
		int a = 0, 
			b = 2;
		System.out.println("es " + (a <= 3 && b != 4));
		
		a = 6;
		b = 3;

		System.out.println("es " + (a > 5 && b == Math.sqrt(9)));
		
		int numeroentero = 0;
		double numerocondecimal = 0.0;
		char caracter ='a';
		boolean esVerdad = false;
		
		String miCadena = "esto es un ordenador";
		String otraCadena = "Quant";
		
		miCadena = miCadena + " " + otraCadena;
		
		numeroentero = numeroentero + 10;
		
		numeroentero /= 2;
		numeroentero *= 5;
		numeroentero++;
		numeroentero--;
				
	}
}
