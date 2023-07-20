package cursoJAVA;

public class Matrizejemplo {
	public static void main(String[]args) {
		Object [][] matriz = new Object [3][3];
		
		matriz[0][0]= "Pancho";
	    matriz[0][1]= 30;
	    matriz[0][2]= "Maestro";
	    matriz[1][0]= "Luis";
	    matriz[1][1]= 15;
	    matriz[1][2]= "Estudiante";
	    matriz[2][0]= "Diana";
	    matriz[2][1]= 16;
	    matriz[2][2]= "Estudiante";
	    
	    for(int i = 0; i< matriz.length; i++) {
	    	for(int j = 0; j < matriz[i].length; j++) {
	    		System.out.print(matriz[i][j] + " ");
	    	}
	    	System.out.println();
	    		
	    }
   }
}

