package ort.edu.tp1.ejercicio3;

import java.util.ArrayList;

import ort.edu.tp1.ejercicio1.Persona;

public class Hito {
	private String fecha;
	private String descripcion;
	private ArrayList<Persona> personasInvolucradas;
	
	public Hito(String fecha, String descripcion) {
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.personasInvolucradas = new ArrayList<>();
	}
	
	public void agregarPersona(Persona persona) {
		this.personasInvolucradas.add(persona);
	}
	
	public void mostrarTodo() {
		System.out.println("Fecha: " + this.fecha);
		System.out.println("Descripcion: " + this.descripcion);
		
		if (this.personasInvolucradas.size() == 0) {
			System.out.println("No posee personas involucradas.");
		} else {
			System.out.println("Involucrados:");
			for (Persona persona : this.personasInvolucradas) {
				persona.mostrarTodoConMascotas();
			}
		}
		
	}
}
