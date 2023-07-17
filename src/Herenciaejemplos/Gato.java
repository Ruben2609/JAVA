package Herenciaejemplos;

public class Gato extends Animal {
	private String raza;
	private double peso;
	private String juguetes;
	
	public Gato(String nombre, String tipo_alimentacion, int edad, String raza, double peso, String juguetes) {
		super(nombre, tipo_alimentacion, edad);
		this.raza = raza;
		this.peso = peso;
		this.juguetes = juguetes;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getJuguetes() {
		return juguetes;
	}

	public void setJuguetes(String juguetes) {
		this.juguetes = juguetes;
	}
	
	public void mostrar() {
		System.out.println(getNombre() + " " + getTipo_alimentacion() + "  " + getEdad() + " " + getRaza() + " " + getPeso() + " " + getJuguetes());
	}
	
}
