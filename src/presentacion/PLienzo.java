package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class PLienzo extends JPanel implements Observer{
	private ArrayList<Integer> colores;
	public boolean cuadrado;
	
	
	
	public boolean isCuadrado() {
		return cuadrado;
	}


	public void setCuadradro(boolean cuadradro) {
		this.cuadrado = cuadradro;
	}


	public void paint(Graphics g) {
		if (isCuadrado() == true) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(new Color(255, 255, 255));
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		g2d.setColor(new Color(colores.get(0), colores.get(1), colores.get(2)));
		g2d.fillRect(100, 100, 300, 300);
	} else {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(new Color(255, 255, 255));
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		g2d.setColor(new Color(colores.get(0), colores.get(1), colores.get(2)));
		g2d.fillOval(100, 100, 300, 300);
	}}


	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.colores = (ArrayList<Integer>)arg;
		this.repaint();
		
		
	}
	
	

}
