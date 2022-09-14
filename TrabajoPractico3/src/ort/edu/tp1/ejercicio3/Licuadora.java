package ort.edu.tp1.ejercicio3;

import ort.edu.tp1.ejercicio4.Imprimible;

public class Licuadora extends Producto implements Imprimible {
	private int potencia;
	private int velocidades;
	
	public Licuadora(String marca, String modelo, int numSerie, int voltaje, boolean estado, float precio, int potencia, int velocidades) {
		super(marca, modelo, numSerie, voltaje, estado, precio);
		this.potencia = potencia;
		this.velocidades = velocidades;
	}
	
	@Override
	public String toString() {
		return "Licuadora " + super.toString();
	}
	
	@Override
	public String mostrarDetalle() {
		return toString() + " " + this.potencia + "Watts " + this.velocidades + " velocidades: $" + super.getPrecio();
	}
	
	@Override
	public void imprimir() {
		System.out.println(mostrarDetalle());
	}
}
