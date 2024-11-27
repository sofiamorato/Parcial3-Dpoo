package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class PLienzo extends JPanel {
	private int tR;
	private int tG;
	private int tB;
	public boolean cuadrado;
	
	
	 public PLienzo() {
	     this.cuadrado = false;
	   }
	
	public boolean isCuadrado() {
		return cuadrado;
	}


	public void setCuadrado(boolean cuadradro) {
		this.cuadrado = cuadradro;
	}
	
	public void setColor(int tR, int tG, int tB) {
	        this.tR = tR;
	        this.tG = tG;
	        this.tB = tB;
	    }


	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(new Color(255, 255, 255));
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		if (isCuadrado() == true) {
			g2d.setColor(new Color(tR, tG, tB));
			g2d.fillRect(100, 100, 300, 300);
		} else if (!cuadrado && (tR != 0 || tG != 0 || tB != 0)){
			g2d.setColor(new Color(tR, tG, tB));
			g2d.fillOval(100, 100, 300, 300);
	}}










	
	

}
