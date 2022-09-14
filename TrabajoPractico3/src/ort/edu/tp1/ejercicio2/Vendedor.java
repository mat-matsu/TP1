package ort.edu.tp1.ejercicio2;

import ort.edu.tp1.ejercicio1.SubContratado;

public class Vendedor extends SubContratado {
	private float porcentaje;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje = porcentaje;
	}
	
	@Override
	public String toString() {
		return "Vendedor " + super.getNombre() + " gana: $" + String.format("%.1f", calcularPago());
	}
	
	@Override
	public float calcularPago() {
		return super.calcularPago() * (porcentaje/100 + 1);
	}
}
