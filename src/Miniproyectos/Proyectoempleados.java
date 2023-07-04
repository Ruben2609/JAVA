package Miniproyectos;

public class Proyectoempleados {

	String nombre;
	int edad;
	double salario;
	double aumento;
	
	public Proyectoempleados(String nombre, int edad, double salario, double aumento) { 
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.aumento =aumento;	
	}
	
	public String getnombre(String nombre) {
		return nombre;
	}
	public void setnombre() {
		this.nombre = nombre;
	}
	public int getedad(int edad) {
		return edad;
	}
	public void setedad() {
		this.edad = edad;
	}
	public double getsalario(double salario) {
		return salario;
	}
	public void setsalario() {
		this.salario = salario;
	}
	public  double getaumento(double aumento) {
		return aumento;
	}
	public void setaumento() {
		this.aumento = aumento;
	}
	
	@Override
	public String toString () {
		return "Empleado {"+  "nombre " + nombre  + ", edad " + edad +", salario " + salario + ", aumento " + aumento + '}'+"\n";
	}
	
	
	
}
