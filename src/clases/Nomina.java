package clases;
import java.util.Scanner;

public class Nomina {
	
		@SuppressWarnings("null")
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			String nombre;
			String puesto;
			double horasT = 0;
			double horasE = 0;
			double pagoH = 72.87;
			double pagoE = 25.96;
			double impuesto = .16;
			double impuestoM = .18;
		
			System.out.println("Ingresa nombre del empleado ");
			nombre = input.nextLine();
			System.out.println("Ingresa el puesto del empleado ");
			puesto = input.nextLine();
			
			Salario finalSal = new Salario(horasT, horasE, pagoH, pagoE, impuesto, impuestoM);
			finalSal.datosExtra(horasE, pagoE);
			
			System.out.println("Ingresa las horas trabajadas ");
			horasT = input.nextDouble();
			System.out.println("Ingresa las horas extras trabajadas ");
			horasE = input.nextDouble();
			
			System.out.println("El salario bruto del empleado es " );
			System.out.println(finalSal.datosBruto(horasT, pagoH, horasE, pagoE));
			finalSal = new Salario(horasT, horasE, pagoH, pagoE, impuesto, impuestoM);
			finalSal.datosBruto(horasT, pagoH, horasE, pagoE);
			System.out.println("El salario neto del empleado es ");
			System.out.println(finalSal.impuestos());
			finalSal = new Salario(horasT, horasE, pagoH, pagoE, impuesto, impuestoM);
			finalSal.datosBruto(horasT, pagoH, horasE, pagoE);
			
			
	}
}