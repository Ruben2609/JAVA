package ListasArreglo;
import java.util.ArrayList;
import java.util.List;

	
	class Persona {
	    private String nombre;
	    private int edad;

	    public Persona(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }
	}

	public class Ejerciciodia23 {

	    public static void main(String[] args) {
	        List<Persona> personas = new ArrayList<>();
	        personas.add(new Persona("Juan", 25));
	        personas.add(new Persona("María", 35));
	        personas.add(new Persona("Carlos", 40));
	        personas.add(new Persona("Ana", 28));

	        List<Persona> personasMayores = filtrarPersonas(personas, p -> p.getEdad() > 30);
	        for (Persona persona : personasMayores) {
	            System.out.println(persona.getNombre());
	        }
	    }

	    public static List<Persona> filtrarPersonas(List<Persona> lista, Filtro<Persona> filtro) {
	        List<Persona> resultado = new ArrayList<>();
	        for (Persona persona : lista) {
	            if (filtro.cumpleCondicion(persona)) {
	                resultado.add(persona);
	            }
	        }
	        return resultado;
	    }
	}

	interface Filtro<T> {
	    boolean cumpleCondicion(T elemento);
	}

