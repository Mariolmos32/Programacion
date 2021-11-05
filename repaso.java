package tema04;

public class repaso {

	// variables de clase
		static String nombre = "Mario";
		static int edad = 19;
		static boolean carnet;
	
	public static void main(String args[]) {
		//System.out.println(nombre)
		//saludar("Mario");
		//saludar("Borja");
		//saludar(nombre);
		
		//llamar al metodo desde una public static
		     saludar(nombre);
	}
	

	//metodo
	public static void saludar(String nombreParam) {
		System.out.println("Bienvenido al programa de repaso " + nombreParam);
		System.out.println(edad);
		System.out.println(carnet);
		
	}
}
