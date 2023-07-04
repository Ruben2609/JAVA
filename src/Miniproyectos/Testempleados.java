package Miniproyectos;
import java.util.Scanner;
public class Testempleados {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int opt = 0;
		
		Proyectoempleados empleado;
		Controlempleados cntrle = new Controlempleados();		
	do {
		System.out.println("1. Contratar empleado");
		System.out.println("2. Despedir empleado");
		System.out.println("3. Aumentar salario");
		System.out.println("4. Listar empleados");
		System.out.println("5. Salir");
		opt = input.nextInt();
		switch(opt) {
		case 1:
			double aumento = 0;
			System.out.println("Ingresar nombre");
			String nombre = input.next();
			System.out.println("Ingresa la edad");
			int edad = input.nextInt();
			System.out.println("Ingresa el salario mensual");
			double salario = input.nextDouble();
			empleado = new Proyectoempleados (nombre, edad, salario, aumento);
			System.out.println(cntrle.Altas(empleado));
			System.out.println("\n");
			break;
		case 2:
			System.out.println("Ingresar nombre");
			nombre =input.next();
			System.out.println(cntrle.Baja(nombre));
			System.out.println("\n");
			
			break;
		case 3:
				System.out.println("Ingresa el nombre del empleado");
				String nombreBaja = input.next(); 
				System.out.println("Define el porcentaje de aumento");
				double porcentaje = input.nextDouble();
				System.out.println(cntrle.AumSal(porcentaje));
				break;
		case 4:
				System.out.println(cntrle.Reporte());
			break;
		}
	}while (opt != 5);
	}
	
}
