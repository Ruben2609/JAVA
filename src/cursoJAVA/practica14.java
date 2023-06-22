package cursoJAVA;

public class practica14 {
	public byte dividendo;
	public byte divisor;
	
  public practica14(byte dividendo, byte divisor) {
	  this.dividendo = dividendo;
	  this.divisor = divisor;
	  		  
  }
  	 
  public void datos(){
	  int division = dividendo / divisor;
	  int cociente = dividendo * divisor;
	  int modulo = dividendo % divisor;
	  
	  System.out.println("El resultado de division es "+ division);
	  System.out.println("El resultado de cociente es "+ cociente);
	  System.out.println("el resultado de modulo es "+ modulo);
	  
  }

}
