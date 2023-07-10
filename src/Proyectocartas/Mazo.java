 package Proyectocartas;

import java.util.ArrayList;

public class Mazo {
	
	ArrayList<Carta> mazo;

	public Mazo() {
		mazo = new ArrayList<>();
	}

	public ArrayList<Carta> getMazo() {
		return mazo;
	}

	public void setMazo(ArrayList<Carta> mazo) {
		this.mazo = mazo;
	}
	
	public void generarCartas() {
		int contador = 0;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 14; j++) {
				mazo.add(new Carta(contador++, j, i)); 
			}
		}
   	}
	public void Barajar () {
		Carta carta = null;
		for (int i =0; i < mazo.size(); i++ ) {
			int revolver = (int) (Math.random()*mazo.size());
			carta = mazo.get(i);
			mazo.set(i, mazo.get(revolver));
			mazo.set(revolver, carta);
			
		}
	}
	
	public static void main(String[]args) {
		Mazo b = new Mazo();
		b.generarCartas();
		b.Barajar();
		System.out.println(b.getMazo().toString());
	}
}
