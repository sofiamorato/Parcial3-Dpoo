package control;

import logica.Figuras;
import presentacion.PFormulario;

public class Controlador {
	private Figuras figuras;
	private PFormulario pFormulario;
	
	
	public Controlador(PFormulario pFormulario) {
		this.pFormulario = pFormulario;
		this.figuras = new Figuras();
		this.figuras.addObserver(this.pFormulario.getfParcial().getpLienzo());
	}
	
	public void colores(String tR, String tG, String tB) {
		this.figuras.colores(tR,tG, tB);
	}

	

}
