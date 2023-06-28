package Ciclos;
import java.io.Serializable;

public class Alumnos implements Serializable {
	private String nombre, carrera, apellido;
	private char genero;
	private byte semestre;
	private int promedio;
	
	public Alumnos (String nombre, String carrera, String apellido, char genero, byte semestre, int promedio) {
		this.nombre = nombre;
		this.carrera = carrera;
		this.apellido = apellido;
		this.genero = genero;
		this.semestre = semestre;
		this.promedio = promedio;
		
	}
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public String getcarrera() {
		return carrera;
	}
	public void setcarrera(String carrera) {
		this.nombre = carrera;
	}
	public String getapellido() {
		return apellido;
	}
	public void setapellido(String apellido) {
		this.apellido = apellido;
	}
	public char getgenero() {
		return genero;
	}
	public void setgenero(char genero) {
		this.genero = genero;
	}
	public byte getsemestre() {
		return semestre;
	}
	public void setsemestre(byte semestre) {
		this.semestre = semestre;
	}
	public int getpromedio() {
		return promedio;
	}
	public void setpromedio(int promedio) {
		this.promedio = promedio;
	}
	@Override
	  public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", carrera=" + carrera + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
	
}
