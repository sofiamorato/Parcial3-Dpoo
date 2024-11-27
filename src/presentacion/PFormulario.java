package presentacion;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PFormulario extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tR;
	private JTextField tG;
	private JTextField tB;
	private JButton bCuadrado;
	private JButton bCirculo;
	private FParcial fParcial;
	private PLienzo pLienzo;

	
	public FParcial getfParcial() {
		return fParcial;
	}

	public PFormulario(FParcial fParcial) {
		this.fParcial = fParcial;
		this.tR = new JTextField();
		this.tG = new JTextField();
		this.tB = new JTextField();
		this.bCuadrado = new JButton("Cuadrado");
		this.bCuadrado.addActionListener(this);
		this.bCirculo = new JButton("Circulo");
		this.bCirculo.addActionListener(this);
		this.setLayout(new GridLayout(4, 2, 10, 10));
		this.add(new JLabel("R"));
		this.add(this.tR);
		this.add(new JLabel("G"));
		this.add(this.tG);
		this.add(new JLabel("B"));
		this.add(this.tB);
		this.add(this.bCuadrado);
		this.add(this.bCirculo);
		
	
	
		
	}
	public JTextField gettR() {
		return tR;
	}

	public void settR(JTextField tR) {
		this.tR = tR;
	}

	public JTextField gettG() {
		return tG;
	}

	public void settG(JTextField tG) {
		this.tG = tG;
	}

	public JTextField gettB() {
		return tB;
	}

	public void settB(JTextField tB) {
		this.tB = tB;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		fParcial.actionPerformed(e);}
			
	

}