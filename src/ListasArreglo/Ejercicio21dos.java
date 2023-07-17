package ListasArreglo;

import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio21dos {

	
	    public static void main(String[] args) {
	        int[] numeros = new int[5];
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese 5 números enteros:");

	        // Leer los números ingresados por el usuario
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        // Ordenar el array en orden ascendente
	        Arrays.sort(numeros);

	        // Mostrar los números ordenados
	        System.out.println("Números en orden ascendente:");
	        for (int numero : numeros) {
	            System.out.println(numero);
	        }
	    }
	}


