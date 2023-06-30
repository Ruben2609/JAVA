package Ciclos;
import java.util.Scanner;
import java.util.Arrays;

public class CondW {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int[] numero = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Ingresa un numero positivo o negativo ");
			numero[i] = input.nextInt();
		}
		Arrays.sort(numero);
		 int mayor = numero[numero.length-2];
		 System.out.println("Numeros ordenados de mayor a menor "+ Arrays.toString(numero));
		 System.out.println("Numero mayor es "+ mayor);
		 int menor = numero[0];
		 System.out.println("Numero menor es " + menor);
		 
		
		
	}
}
