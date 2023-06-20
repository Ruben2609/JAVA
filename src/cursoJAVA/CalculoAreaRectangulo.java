package cursoJAVA;

import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double area = calcularAreaRectangulo(base, altura);
        System.out.println("El área del rectángulo es: " + area);

        scanner.close();
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
}