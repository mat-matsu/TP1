package ort.edu.tp1.ejercicio3;

import ort.edu.tp1.ejercicio4.Imprimible;

public class Televisor extends Producto implements Imprimible {
	private int pulgadas;
	private boolean smart;
	
	public Televisor(String marca, String modelo, int numSerie, int voltaje, boolean estado, float precio, int pulgadas, boolean smart) {
		super(marca, modelo, numSerie, voltaje, estado, precio);
		this.pulgadas = pulgadas;
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		return "Televisor " + super.toString();
	}
	
	@Override
	public String mostrarDetalle() {
		return toString() + ((this.smart) ? " smart " : "") + this.pulgadas + " pulgadas: " + super.getPrecio();
	}
	
	@Override
	public void imprimir() {
		System.out.println(mostrarDetalle());
	}
}
