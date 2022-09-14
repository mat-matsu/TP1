package ort.edu.tp1.ejercicio3;

import ort.edu.tp1.ejercicio4.Imprimible;

public class Heladera extends Producto implements Imprimible {
	private int capacidad;
	private boolean noFrost;
	
	public Heladera(String marca, String modelo, int numSerie, int voltaje, boolean estado, float precio, int capacidad, boolean noFrost) {
		super(marca, modelo, numSerie, voltaje, estado, precio);
		this.capacidad = capacidad;
		this.noFrost = noFrost;
	}

	@Override
	public String toString() {
		return "Heladera " + super.toString();
	}
	
	@Override
	public String mostrarDetalle() {
		return toString() + " capacidad " + this.capacidad + "lts" + ((this.noFrost) ? " no frost" : "") + ": $" + super.getPrecio();
	}
		
	@Override
	public void imprimir() {
		System.out.println(mostrarDetalle());
	}
}
