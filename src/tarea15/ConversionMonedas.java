package tarea15;
import java.util.Scanner;

	public class ConversionMonedas {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el monto a convertir: ");
	        double monto = scanner.nextDouble();
	        
	        System.out.println("Seleccione la moneda de origen:");
	        System.out.println("1. Soles");
	        System.out.println("2. Pesos");
	        System.out.println("3. Dólares");
	        System.out.println("4. Quetzales");
	        int opcionOrigen = scanner.nextInt();

	        double montoConvertido = convertirMoneda(monto, opcionOrigen);

	        System.out.println("El monto convertido es: " + montoConvertido);
	        
	    }

	    public static double convertirMoneda(double monto, int opcionOrigen) {
	        double factorConversion = 0.0;

	        switch (opcionOrigen) {
	            case 1: 
	                factorConversion = 1.0;
	                break;
	            case 2: 
	                factorConversion = 0.04; 
	                break;
	            case 3: 
	                factorConversion = 3.4; 
	                break;
	            case 4: 
	                factorConversion = 0.23; 
	                break;
	        }

	        return monto * factorConversion;
	    }
	}
