package logica;

import java.util.ArrayList;
import java.util.Observable;

public class Figuras extends Observable{
	
	public void coloresCuadrado(String tr, String tg, String tb) {
		Integer tR = Integer.parseInt(tr);
		Integer tG = Integer.parseInt(tg);
		Integer tB = Integer.parseInt(tb);
		
		notificar(tR, tG, tB);
	}
	
	public void coloresCirculo(String tr, String tg, String tb) {
		Integer tR = Integer.parseInt(tr);
		Integer tG = Integer.parseInt(tg);
		Integer tB = Integer.parseInt(tb);
		
		notificar(tR, tG, tB);
	}
	
	
	private void notificar(int tR, int tG, int tB) {
		ArrayList<Integer> colores = new ArrayList<Integer>();
		this.setChanged();
		this.notifyObservers(colores);
	}

}
