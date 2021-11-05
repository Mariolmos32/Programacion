package tema04;

import java.util.Scanner;

public class centroEducativo {

 public static void main(String[] args) {
		
	   Scanner in = new Scanner(System.in);
		
		//Variables
		
		int edad = 0;
		int totalEdad = 0;
		int totalAlumnos = 0;
		double totalMedia = 0;
		int mayores = 0;
		
		
		
		//Codigo
	
		do{
			
			System.out.println("Introduzca una edad: ");
			edad = in.nextInt();
			
			totalEdad += edad;
			totalAlumnos = totalAlumnos +1;
			totalMedia = totalEdad/totalAlumnos;
			
			
			
			
	
      }while (edad != 0);
		
	 if (edad != 0);
	   
	   System.out.println("El total de edad es: " +totalEdad);
	   System.out.println("El total de alumnos es: "+totalAlumnos);
	   System.out.println("El media es: "+totalMedia);
	   System.out.println("El total alumnos +18 son: " +mayores);
    
     if (edad < 18);
        mayores = mayores+1;

        in.close();
 }
}

