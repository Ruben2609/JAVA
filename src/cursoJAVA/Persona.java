package cursoJAVA;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void saludar() {
        System.out.println("¡Hola, " + nombre + "! Bienvenido/a.");
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.ingresarDatos();
        System.out.println();
        persona.imprimirDatos();
        persona.saludar();
    }
}

