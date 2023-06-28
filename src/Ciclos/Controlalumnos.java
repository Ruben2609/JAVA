package Ciclos;
import java.io.Serializable;

public class Controlalumnos implements Serializable {
	
	private Alumnos array[];
		private int contador;
		private int maximo;
		
	public Controlalumnos() {
		contador = 0;
		maximo =15;
		array = new Alumnos[maximo];
	}
	public String Altasalumnos(Alumnos alumn) {
		String cadena = "Se agrego correctamente al alumno";
		
		if (contador < maximo ) {
			array[contador] = alumn; 
			contador++;
			
		}
		else {
			cadena = "El alumno no se agrego";
						
		}
			return cadena;
				
	}
	
	public String Alumnosexcelencia() {
		String cadena = "";
		
		for(int i = 0; i < contador; i++) {
			if (array[i].getpromedio() >= 90) {
				cadena += array[i].toString(); 
			}
				
			}
			return cadena;
	
	}
	public String Alumnosregulares() {
		String cadena = "";
		
		for(int i = 0; i < contador; i++) {
			if (array[i].getpromedio() <= 80) {
				cadena += array[i].toString(); 
			}
				
			}
			return cadena;
	}
	
	public String Alumnosrepaso() {
		String cadena = "";
		
		for(int i = 0; i < contador; i++) {
			if (array[i].getpromedio() < 70) {
				cadena += array[i].toString(); 
			}
				
			}
			return cadena;
	}
}
	
