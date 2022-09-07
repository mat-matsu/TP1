package ort.edu.tp1.ejercicio4;

import java.util.ArrayList;

public class Vivienda {

	private Direccion direccion;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	
	public Vivienda(String calle, int altura, int piso, String departamento) {
		this.direccion = new Direccion(calle, altura, piso, departamento);
		this.personas = new ArrayList<>();
		this.muebles = new ArrayList<>();
	}
	
	public ArrayList<Persona> getPersonas() {
		return this.personas;
	}
	
	public ArrayList<Mueble> getMuebles() {
		return this.muebles;
	}
	
	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}
	
	public void agregarMueble(Mueble mueble) {
		this.muebles.add(mueble);
	}
	
	public void vaciarPersonas() {
		while(this.personas.size() > 0) {
			this.personas.remove(0);
		}
	}
	
	public void vaciarMuebles() {
		while(this.muebles.size() > 0) {
			this.muebles.remove(0);
		}
	}
	
	public boolean compararDireccion(int piso, String departamento) {
		return (this.direccion.getPiso() == piso) && (this.direccion.getDepartamento().equals(departamento));
	}
	
	public boolean estaOcupada() {
		return this.personas.size() > 0;
	}
	
	public void mostrarTodo() {
		this.direccion.mostrarTodo();
		
		System.out.println("Personas: ");
		
		for(Persona persona : this.personas) {
			persona.mostrarTodo();
		}
		
		System.out.println("Muebles: ");
		
		for (Mueble mueble : this.muebles) {
			mueble.mostrarTodo();
		}
	}
}
