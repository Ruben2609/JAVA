package cursoJAVA;

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.print("Ingrese el tercer valor: ");
        int valor3 = scanner.nextInt();

        int mayor = obtenerMayor(valor1, valor2, valor3);
        int menor = obtenerMenor(valor1, valor2, valor3);

        System.out.println("El mayor valor es: " + mayor);
        System.out.println("El menor valor es: " + menor);

        scanner.close();
    }

    public static int obtenerMayor(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int obtenerMenor(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}