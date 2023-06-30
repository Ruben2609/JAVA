package Ciclos;
import java.util.Scanner;

public class Claseswitch {

	public void Altaalumnos() {
		
	}
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		int opt = 0;
		int promedio = 0;
		String alumno;
		
		System.out.println("Ingresa el nombre del alumno");
		alumno = input.next();
		System.out.println("Ingresa la calificacion del 1-10");
		promedio = input.nextInt();
		
		if (promedio >= 9){
			 
				
		} else if (promedio <=8) {	
		
			opt = input.nextInt();
		} else{
			
			opt = input.nextInt();
		}
		 
		
		switch(opt) {
			case 1:
				System.out.println("1. Alumnos de excelencia");
				break;
			case 2:
				System.out.println("2. Alumnos regulares");
				break;
			case 3:
				System.out.println("3. Alumnos de reprobados");
				break;
		}	
	
		
	}
}