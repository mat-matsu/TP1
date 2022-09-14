package ort.edu.tp1.ejercicio1;

public class Asalariado extends Empleado {
	private float sueldo;
	
	public Asalariado() {
		super();
	}
	
	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return "Asalariado " + super.getNombre() + " gana: $" + String.format("%.1f", calcularPago());
	}
	
	@Override
	public float calcularPago() {
		return this.sueldo;
	}
}
