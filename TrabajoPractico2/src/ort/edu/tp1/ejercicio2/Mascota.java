package ort.edu.tp1.ejercicio2;

public class Mascota {
	private String nombre;
	private String animal;
	
	public Mascota(String nombre, String animal) {
		this.nombre = nombre;
		this.animal = animal;
	}
	
	public String getValor() {
		return this.animal + ", " + this.nombre;
	}
}
