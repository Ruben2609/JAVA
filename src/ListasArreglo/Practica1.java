package ListasArreglo;

import java.util.ArrayList;
import java.util.List;

public class Practica1 {

		public static void main (String[]args) {
			List<String> nombreAlumnos = new ArrayList <>();
			
			nombreAlumnos.add("1. Jose");
			nombreAlumnos.add("2. Pepe");
			nombreAlumnos.add("3. Maria");
			nombreAlumnos.add("4. Pancho");
			nombreAlumnos.add("5. Sofia");
			nombreAlumnos.add("6. Karla");
			
			List<Integer> edad = new ArrayList<>();
			
			edad.add(18);
			edad.add(21);
			edad.add(20);
			edad.add(17);
			edad.add(22);
			edad.add(19);
			
			List<Integer> calificaciones = new ArrayList<>();
			
			calificaciones.add(100);
			calificaciones.add(95);
			calificaciones.add(80);
			calificaciones.add(70);
			calificaciones.add(85);
			calificaciones.add(60);
			
			

			List<String> grupo = new ArrayList<>();
			
			for(int calificacion: calificaciones) {
				if (calificacion >= 95) {
					grupo.add("A");
				}else if (calificacion < 95 && calificacion >= 80) {
					grupo.add("B");
				}else {
					grupo.add("C");
				}
			}
		
			for(String alumno: nombreAlumnos) {
				int indice = nombreAlumnos.indexOf(alumno);	
				System.out.println(alumno + " Promedio " + calificaciones.get(indice) +  " Grupo " + grupo.get(indice) + " Edad  " + edad.get(indice));
			}
			
			
			
			
	}
}
