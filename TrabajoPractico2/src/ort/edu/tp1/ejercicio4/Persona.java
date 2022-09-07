package ort.edu.tp1.ejercicio4;

import java.util.ArrayList;

import ort.edu.tp1.ejercicio1.EMail;
import ort.edu.tp1.ejercicio1.NumeroTelefonico;
import ort.edu.tp1.ejercicio2.Mascota;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public void mostrarTodo() {
		System.out.println("Nombre: " + this.nombre + " " + this.apellido);
		System.out.println("Edad: " + this.edad);
				
	}
	
}
