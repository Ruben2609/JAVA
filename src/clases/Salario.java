package clases;

public class Salario {
	double horasT;
	double horasE;
	double pagoH = 72.87;
	double pagoE = 25.96;
	double impuesto = 0.16;
	double impuestoM = 0.18;
	
	public Salario(double horasT, double horasE, double pagoH, double pagoE, double impuesto, double impuestoM) {
		this.horasT = horasT;
		this.horasE = horasE;
		this.pagoH = pagoH;
		this.pagoE = pagoE;
		this.impuesto = impuesto;
		this.impuestoM = impuestoM;
	}
	public double datosExtra(double horasE, double pagoE) {
		double sExtras = horasE * pagoE;
		return sExtras;
	}
	
	public double datosBruto(double horasT, double pagoH, double horasE, double pagoE) { 
		double sExtras1 = datosExtra(horasE, pagoE);
		double sBruto = (horasT * pagoH);
		return sBruto + sExtras1;
		
	}
	
	public double impuestos() {
		double Bruto = datosBruto(horasT, pagoH, horasE, pagoE);
	
		if (Bruto<2000) {
			
			return (Bruto * impuesto)+Bruto;
			
		}
		else 
		{
			return(Bruto * impuestoM)+Bruto;
			
		}
		
	}
	
}
