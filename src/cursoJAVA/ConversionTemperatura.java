package cursoJAVA;

import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);

        double kelvin = celsiusToKelvin(celsius);
        System.out.println("La temperatura en Kelvin es: " + kelvin);

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}

