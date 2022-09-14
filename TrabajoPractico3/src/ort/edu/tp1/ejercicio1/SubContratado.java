package ort.edu.tp1.ejercicio1;

public class SubContratado extends Empleado {
	private float cantHoras;
	private float precioHora;
	
	public SubContratado() {
		super();
	}
	
	public SubContratado(String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}
	
	@Override
	public String toString() {
		return "SubContratado " + super.getNombre() + " gana: $" + String.format("%.1f", calcularPago());
	}
	
	@Override
	public float calcularPago() {
		return this.cantHoras * this.precioHora;
	}
}
