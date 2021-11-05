package tema03;

public class EjercicioMetodo {

		public static void main (String ars[]) {
			int edad = 32; 
			int VarMetodo = 0;
			
			System.out.println("Tengo " + edad + " anios");
			//Llamamos a los metodos 
			VarMetodo = cumpleAnios(edad);
			
			System.out.println("El metodo devuelve " + VarMetodo);
			soyViejo();
			//Incrementamos el valor de las variables edad
			edad++;
			System.out.println("y ahora tengo " + edad + " anios");
		}
		public static int cumpleAnios (int miEdad) {
			miEdad++;
			return(miEdad);
		}
		public static void soyViejo () {
			int edad = 99;
			System.out.println("y ahora tengo " + edad + " anios");
		}
}
