package Ciclos;

import java.util.Arrays;
import java.util.Scanner;

public class CondW2 {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	int contador = 0;
	int[] numero = new int[10];
	
	while(contador < 10) {
		System.out.println("Ingresa numeros positivos o negativos ");
		int numeros = input.nextInt();
		numero[contador] = numeros;
		contador++;
	}
	Arrays.sort(numero);
	 int mayor = numero[numero.length-2];
	 System.out.println("Numeros ordenados de mayor a menor "+ Arrays.toString(numero));
	 System.out.println("Numero mayor es "+ mayor);
	 int menor = numero[0];
	 System.out.println("Numero menor es " + menor);
	}
}
