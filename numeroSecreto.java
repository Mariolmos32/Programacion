package tema04;

import java.util.Scanner;

public class numeroSecreto {

	public static void main(String[] args) {
		
		   Scanner in = new Scanner(System.in);

    //Variables
		   
		   int num = 0;
		   int numSecreto = 0;
		   numSecreto = (int) Math.floor(Math.random()*100+1);
    //Codigo
		   
	while(num != numSecreto) {
		System.out.println("Introduzca un numero: ");
		numSecreto = in.nextInt();
    if(num>numSecreto) {
    	System.out.println("El numero es menor ");
    }
    	else if (num<numSecreto) {
    		System.out.println("El numero es mayor ");
    	}
		System.out.println("Vuelva a intentarlo");
	} if (num==numSecreto)
		System.out.println("Has acertado");
		   
	
	in.close();
 }
}