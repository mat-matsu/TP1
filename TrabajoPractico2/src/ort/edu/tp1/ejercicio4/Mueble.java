package ort.edu.tp1.ejercicio4;

public class Mueble {
	private String nombre;
	private String material;
	private String color;
	
	public Mueble(String nombre, String material, String color) {
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}
	
	public void mostrarTodo() {
		System.out.println(this.nombre + " de " + this.material + " color " + this.color);
	}
}
