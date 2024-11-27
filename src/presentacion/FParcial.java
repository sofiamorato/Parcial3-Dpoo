package presentacion;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class FParcial extends JFrame{
	private PFormulario pFormulario;
	private PLienzo pLienzo;
	
	
	
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

	
	
	public static void main(String[] args) {
		new FParcial();
	}
	
	

}
