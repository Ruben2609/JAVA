package Ciclos;

public class Arbolito {
	
		public static void main(String[]args) {
			int altura = 6;
			
			for(int i = 0; i < altura; i++) {
				for(int b = 0; b < altura - i -1; b++) {
					System.out.println("");
				}
				for(int a = 0; a < i *2 + 1; a++) {
					System.out.println("*");
				}
				System.out.println();
			}
		
		int tronco = altura /2;
		int anchura = altura /3;
		
		for(int i = 0; i < tronco; i++) {
			for (int b = 0; b <altura - anchura; b++) {
				System.err.println("");
			} 
			for(int a = 0; a < anchura * 2; a++) {
		}	
		
			
			}
		}
	}
