package ort.edu.tp1.ejercicio4;

public class Cliente {
	private String cuil;
	private String apenom;
	
	public Cliente(String cuil, String apenom) {
		this.cuil = cuil;
		this.apenom = apenom;
	}
	
	@Override
	public String toString() {
		return "Apellido, nombre: " + this.apenom + " cuil: " + this.cuil;
	}
}
