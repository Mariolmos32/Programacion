
public class EjercicioAmstrong {

	public static void main(String[] args) {
		int numero = 157;
		
		int centenas=0, decenas=0, unidades=0;
		
		if(numero>=100 && numero<=999) {
		
		            
		//centenas
			centenas = numero/100;
			System.out.println(centenas);
			//System.out.println(centenas%100);//resto operacion
			//los elevo a 3
			int centenasCubo = (int) Math.pow(centenas, 3);
			System.out.println(centenasCubo);
		
		
		//decenas
		decenas = (numero%100)/10;
		//los elevo a 3
		int decenasCubo = (int) Math.pow(decenas, 3);
		System.out.println(decenas);
		
		//unidades
			unidades = (int)numero%10;
		//elevo a 3
			int unidadesCubo = (int) Math.pow(unidades, 3);
			
			if(unidadesCubo + decenasCubo + centenasCubo == numero) {
				System.out.println("El numero es amstrong");
			} else {
				System.out.println("El numero no es amstrong");
			}
		} else {
			System.out.println("El numero no tiene tres digitos");
		}
	}
}
