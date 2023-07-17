package ListasArreglo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio21 {
	

	    public static void main(String[] args) {
	        ArrayList<String> listaPalabras = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese las palabras (ingrese 'fin' para finalizar): ");

	        // Leer las palabras ingresadas por el usuario
	        String palabra = scanner.nextLine();
	        while (!palabra.equalsIgnoreCase("fin")) {
	            listaPalabras.add(palabra);
	            palabra = scanner.nextLine();
	        }

	        // Eliminar duplicados
	        ArrayList<String> listaSinDuplicados = new ArrayList<>();
	        for (String palabraActual : listaPalabras) {
	            if (!listaSinDuplicados.contains(palabraActual)) {
	                listaSinDuplicados.add(palabraActual);
	            }
	        }

	        // Mostrar la lista sin duplicados
	        System.out.println("Palabras sin duplicados:");
	        for (String palabraUnica : listaSinDuplicados) {
	            System.out.println(palabraUnica);
	        }
	    }
	}


