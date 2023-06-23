package cursoJAVA;

public class Calculadoracompleta {

	float num1;
	float num2;
	
	public Calculadoracompleta(float num1, float num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	public void suma() {
		float result = num1 + num2;
		System.out.println("El resultado de la suma es "+ result);
	}	
	public void resta() {
		float result = num1 - num2;
		System.out.println("El resultado de la resta es "+ result);
	}		
	public void division() {
		float result = num1 / num2;
			System.out.println("El resultado de la division es "+ result);
	}
	public void multiplicacion() {
		float result = num1 * num2;
		System.out.println("El resultado de la multiplicacion es "+ result);
	}		
		
}
