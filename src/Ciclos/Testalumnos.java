package Ciclos;
import java.util.Scanner;

public class Testalumnos {
	
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);	
	Controlalumnos control = new Controlalumnos();
	Alumnos alumn;
	int opc;
	
	do {
		System.out.println("1. Altas Alumno " );
		System.out.println("2. Reporte de excelencia " );
		System.out.println("3. Reporte de menor " );
		System.out.println("4. Reproados " );
		opc = input.nextInt();
		switch(opc) {
		case 1: 
			System.out.println("Dame el nombre");
            String nombre = input.next();
            System.out.println("Dame el apellido");
            String apellido = input.next();
            System.out.println("Introduce el genero de la siguiente manera [M] para mujer o [H] para hombre");
            char genero = input.next().charAt(0);
            System.out.println("Introduce carrera");
            String carrera = input.next();
            System.out.println("Dame el semestre");
            byte semestre = input.nextByte();
            System.out.println("Dame el promedio");
            int promedio = input.nextInt();
            alumn = new Alumnos(nombre, carrera, apellido, genero, semestre, promedio);
            System.out.println(control.Altasalumnos(alumn));
            break;
         case 2:
        	 System.out.println(control.Alumnosexcelencia());
        	 break;
         case 3: 
        	 System.out.println(control.Alumnosregulares());
        	 break;
         case 4: 
        	 System.out.println(control.Alumnosrepaso());
        	 
        	 break;
		}
		
	}while (opc != 5);
	
	}
}
