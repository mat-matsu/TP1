package ort.edu.tp1.ejercicio1;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private ArrayList <String> integrantes;

	public Grupo(String nombre) {
		setNombre(nombre);
		this.integrantes = new ArrayList<>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		if (this.obtenerPosicionIntegrante(nombreIntegrante) == -1) {
			this.integrantes.add(nombreIntegrante);
			
			System.out.println(nombreIntegrante + " fue asignada/o al grupo " + this.nombre);
		}
	}
	
	public int obtenerPosicionIntegrante(String nombreIntegrante) {
		int i = 0;
		int pos = -1;
		
		while (i < this.integrantes.size() && pos == -1) {
			if(this.integrantes.get(i).equalsIgnoreCase(nombreIntegrante)) {
				pos = i;
			}
			i++;
		}
		
		return pos;
	}
	
	public String obtenerIntegrante(int posicion) {
		return this.integrantes.get(posicion - 1);
	}
	
	public String buscarIntegrante(String nombre) {
		return (this.obtenerPosicionIntegrante(nombre) > -1 ? nombre : null);
	}
	
	public String removerIntegrante(String nombreIntegrante) {
		int pos = this.obtenerPosicionIntegrante(nombreIntegrante); 
		return (pos > -1 ? this.integrantes.remove(pos) : null);
	}
	
	public void mostrarIntegrantes() {
		System.out.println("Cantidad de integrantes: " + this.getCantidadIntegrantes());
		
		for (int i = 0; i < this.integrantes.size(); i++) {
			System.out.println("Nombre Integrante: " + this.integrantes.get(i));
		}
		
	}
	
	public void mostrar() {
		System.out.println("Nombre del grupo: " + this.getNombre());
		mostrarIntegrantes();
	}
	
	public void vaciar() {
		while (this.integrantes.size() > 0) {
			this.integrantes.remove(0);
		}
	}
	
}
