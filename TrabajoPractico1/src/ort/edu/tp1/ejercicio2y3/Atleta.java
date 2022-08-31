package ort.edu.tp1.ejercicio2y3;

public class Atleta {
	private String nombre;
	private double tiempo;
	
	public Atleta(String nombre, double tiempo) {
		setNombre(nombre);
		setTiempo(tiempo);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getTiempo() {
		return this.tiempo;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	
	public String toString() {
		return this.getNombre() + " obtuvo un tiempo de " + this.getTiempo() + " segundos.";
	}
}
