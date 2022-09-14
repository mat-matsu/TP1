package ort.edu.tp1.ejercicio3;

import ort.edu.tp1.ejercicio4.Imprimible;

public class Lavarropas extends Producto implements Imprimible {
	private int cargaMaxima;
	private boolean automatico;
	
	public Lavarropas(String marca, String modelo, int numSerie, int voltaje, boolean estado, float precio, int cargaMaxima, boolean automatico) {
		super(marca, modelo, numSerie, voltaje, estado, precio);
		this.cargaMaxima = cargaMaxima;
		this.automatico = automatico;
	}

	@Override
	public String toString() {
		return "Lavarropas " + super.toString();
	}
	
	@Override
	public String mostrarDetalle() {
		return toString() + " carga maxima " + this.cargaMaxima + "kg " + ((this.automatico) ? "automatico" : "semi automatico") + ": $" + super.getPrecio();
	}
	
	@Override
	public void imprimir() {
		System.out.println(mostrarDetalle());
	}
}
