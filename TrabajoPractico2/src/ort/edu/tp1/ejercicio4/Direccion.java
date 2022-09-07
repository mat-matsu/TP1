package ort.edu.tp1.ejercicio4;

public class Direccion {
	private String calle;
	private int altura;
	private int piso;
	private String departamento;
	
	public Direccion(String calle, int altura, int piso, String departamento) {
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
	}
	
	public int getPiso() {
		return this.piso;
	}
	
	public String getDepartamento() {
		return this.departamento;
	}
	
	public void mostrarTodo() {
		System.out.println("Direccion: " + this.calle + " " + this.altura + " " + this.piso + "º \"" + this.departamento + "\"");
	}
}
