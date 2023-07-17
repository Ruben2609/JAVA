package ListasArreglo;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio23dos {

	    public static void main(String[] args) {
	        List<Integer> listaNumeros = new ArrayList<>();
	        listaNumeros.add(5);
	        listaNumeros.add(10);
	        listaNumeros.add(15);
	        listaNumeros.add(20);
	        listaNumeros.add(25);

	        double promedio = calcularPromedio(listaNumeros);

	        System.out.println("El promedio de la lista de números es: " + promedio);
	    }

	    public static double calcularPromedio(List<Integer> lista) {
	        int suma = lista.stream().mapToInt(Integer::intValue).sum();
	        return (double) suma / lista.size();
	    }
	}

