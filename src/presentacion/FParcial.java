package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FParcial extends JFrame implements ActionListener{
	private PFormulario pFormulario;
	private PLienzo pLienzo;
	private JPanel blanco;
	
	
	
	public PLienzo getpLienzo() {
		return pLienzo;
	}

	public void setpLienzo(PLienzo pLienzo) {
		this.pLienzo = pLienzo;
	}

	public FParcial() {
		this.setTitle("Parcial de Sofia Morato");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLayout(new BorderLayout());
		this.pLienzo = new PLienzo();
		this.pFormulario = new PFormulario(this);
		this.add(this.pFormulario, BorderLayout.WEST);
		this.add(this.pLienzo, BorderLayout.CENTER);
		
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton botonOprimido = (JButton)e.getSource();
		if(botonOprimido.getText().equals("Cuadrado")) {
			
			int tR = Integer.parseInt(this.pFormulario.gettR().getText());
			int tG =Integer.parseInt(this.pFormulario.gettG().getText());
			int tB =Integer.parseInt(this.pFormulario.gettB().getText());
			this.pLienzo.setColor(tR, tG, tB);
			this.pLienzo.setCuadrado(true);
		}
		else {
			
			int tR = Integer.parseInt(this.pFormulario.gettR().getText());
			int tG =Integer.parseInt(this.pFormulario.gettG().getText());
			int tB =Integer.parseInt(this.pFormulario.gettB().getText());
			this.pLienzo.setColor(tR, tG, tB);
			this.pLienzo.setCuadrado(false);
		}
		this.pLienzo.repaint();}
			
	public static void main(String[] args) {
		new FParcial();
	}
	
	

}
