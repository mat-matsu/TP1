package ort.edu.tp1.ejercicio3;

public abstract class Producto {
	private String marca;
	private String modelo;
	private int numSerie;
	private int voltaje;
	private boolean estado;
	private float precio;
	
	public Producto(String marca, String modelo, int numSerie, int voltaje, boolean estado, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.numSerie = numSerie;
		this.voltaje = voltaje;
		this.estado = estado;
		this.precio = precio;
	}

	public float getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return marca + ", " + modelo;
	}
	
	public abstract String mostrarDetalle();
	
}
