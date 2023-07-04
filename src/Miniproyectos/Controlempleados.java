package Miniproyectos;



public class Controlempleados {

	private Proyectoempleados array[];
	private int contador;
	private int maximo;
	
	public Controlempleados() {
		contador = 0;
		maximo = 10;
		array = new Proyectoempleados[maximo];
	}
	
	public String Altas (Proyectoempleados empleados) {
		String cadena = "Se agrego correctamente al empleado";
	     if (contador < maximo){
	        array [contador]= empleados;
	        contador ++;  
	    }
	        else {    
	        }
	     
	     return cadena;
	    }
	public String Baja (String nombre) {
		String cadena = "Empleado no encontrado";
		 for(int i = 0; i < contador; i++) {
			 if (array[i].getnombre(nombre).compareTo(nombre)== 0) {
				 cadena = "El empleado se ha eliminado: " + array[i].toString();
				 array[i]=null;
				 break;
			 }else {
				System.out.println(cadena);
				break;
			 }
		 }
		return cadena;
		 
				
	}
	public String Reporte () {
		  String cadena="";
	        for(int i=0; i<contador;i++){
	            	if (array[i] != null) {
	            	cadena+=array[i].toString();
	            
	          } 	
	          
	        }
	        return cadena;
	        
	}  
	
	public double AumSal (double aumento) {
		double cadena = contador; 
		for (int i = 0; i < contador; i++) {
			
			array[i].getaumento(aumento);
			
		}
		return cadena;	
		
	}
}
