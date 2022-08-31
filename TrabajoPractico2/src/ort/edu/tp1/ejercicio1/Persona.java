package ort.edu.tp1.ejercicio1;

import java.util.ArrayList;

import ort.edu.tp1.ejercicio2.Mascota;

public class Persona {
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> numerosTelefonicos;
	private ArrayList<EMail> emails;
	private ArrayList<Mascota> mascotas;
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numerosTelefonicos = new ArrayList<>();
		this.emails = new ArrayList<>();
		this.mascotas = new ArrayList<>();
	}
	
	public void agregarEmail(String email) {
		this.emails.add(new EMail(email));
	}
	
	public void agregarNumero(NumeroTelefonico numeroTelefonico) {
		this.numerosTelefonicos.add(numeroTelefonico);
	}
	
	public void agregarMascota(Mascota mascota) {
		this.mascotas.add(mascota);
	}
	
	public void sacarMascota(Mascota mascota) {
		this.mascotas.remove(mascota);
	}
	
	public void mostrarTodo() {
		System.out.println(this.apellido + ", " + this.nombre);
		
		if (this.numerosTelefonicos.size() == 0) {
			System.out.println("No posee números telefónicos.");
		} else {
			System.out.println("Telefonos:");
			for (NumeroTelefonico numeroTelefonico : this.numerosTelefonicos) {
				System.out.println(numeroTelefonico.getTipoDeLinea() + ": " + numeroTelefonico.getValor());
			}
		}
		
		if (this.emails.size() == 0) {
			System.out.println("No posee Emails.");
		} else {
			for (EMail email : this.emails) {
				System.out.println("Email: " + email.getValor());
			}
		}
		
	}
	
	public void mostrarTodoConMascotas() {
		this.mostrarTodo();
		
		if (this.mascotas.size() == 0) {
			System.out.println("No posee mascotas.");
		} else {
			System.out.println("Mascotas:");
			for (Mascota mascota : this.mascotas) {
				System.out.println(mascota.getValor());
			}
		}
	}
}
