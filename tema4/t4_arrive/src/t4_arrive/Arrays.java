package t4_arrive;

public class Arrays
{
	public static void main(String [] args) {
		
		int [] numeros = new int[10];
		int []numeroDos = {1,2,3,4,5,6,7,8,9,10};
		
		boolean[] aciertos = new boolean[5];
		String[] palabras = new String[3];
		
		double[] decimales = new double[2];
		

		int longitudArray = numeroDos.length;
		//System.out.println(numeroDos[0]);
		
		for(int i = 0; i< numeroDos.length; i++) {
			System.out.println(numeroDos[i]);
		}
	}
}
