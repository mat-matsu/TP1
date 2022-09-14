package ort.edu.tp1.ejercicio1;

public abstract class Empleado {
	private String nombre;
	private int edad;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, int edad) {
		setNombre(nombre);
		setEdad(edad);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "[Nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public abstract float calcularPago();
	
}
