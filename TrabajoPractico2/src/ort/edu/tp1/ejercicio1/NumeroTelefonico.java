package ort.edu.tp1.ejercicio1;

public class NumeroTelefonico {
	private int caracteristica;
	private int numeroDeAbonado;
	private int codigoDePais;
	private TipoDeLinea tipoDeLinea;
	
	public NumeroTelefonico(int codigoDePais, int caracteristica, int numeroDeAbonado, TipoDeLinea tipoDeLinea) {
		this.caracteristica = caracteristica;
		this.numeroDeAbonado = numeroDeAbonado;
		this.codigoDePais = codigoDePais;
		this.tipoDeLinea = tipoDeLinea;
	}
	
	public TipoDeLinea getTipoDeLinea() {
		return tipoDeLinea;
	}

	public String getValor() {
		return "(+" + this.codigoDePais + ") " + this.caracteristica + "-" + this.numeroDeAbonado ;
	}
	
}
