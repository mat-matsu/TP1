package ort.edu.tp1.ejercicio2;

import java.util.ArrayList;

public class Carrera {
	private int distancia;
	private ArrayList<Atleta> atletas;
	
	public Carrera(int distancia) {
		setDistancia(distancia);
		this.atletas = new ArrayList<>();
	}
	
	public int getDistancia() {
		return this.distancia;
	}
	
	private void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public int getCantidadAtletas() {
		return this.atletas.size();
	}
	
	public void agregarAtleta(String nombreAtleta, double tiempo) {
		if (this.obtenerPosicionAtleta(nombreAtleta) == -1) {
			this.atletas.add(new Atleta(nombreAtleta, tiempo));
			System.out.println(nombreAtleta + " fue asignada/o a la carrera " + this.distancia);
		}
	}
	
	public int obtenerPosicionAtleta(String nombreAtleta) {
		int i = 0;
		int pos = -1;
		
		while (i < this.atletas.size() && pos == -1) {
			if(this.atletas.get(i).getNombre().equalsIgnoreCase(nombreAtleta)) {
				pos = i;
			}
			i++;
		}
		
		return pos;
	}
	
	public Atleta obtenerIntegrante(int posicion) {
		return this.atletas.get(posicion - 1);
	}
	
	public Atleta buscarIntegrante(String nombreAtleta) {
		int pos = this.obtenerPosicionAtleta(nombreAtleta);
		return (pos > -1 ? this.atletas.get(pos) : null);
	}
	
	public Atleta removerIntegrante(String nombreIntegrante) {
		int pos = this.obtenerPosicionAtleta(nombreIntegrante);
		return (pos > -1 ? this.atletas.remove(pos) : null);
	}
	
	public void mostrarAtletas() {
		System.out.println("Cantidad de integrantes: " + this.getCantidadAtletas());
		
		for (int i = 0; i < this.atletas.size(); i++) {
			System.out.println("Nombre Integrante: " + this.atletas.get(i).getNombre());
			System.out.println("Tiempo Integrante: " + this.atletas.get(i).getTiempo());
		}
		
	}
	
	public void mostrar() {
		System.out.println("Nombre del grupo: " + this.getDistancia());
		this.mostrarAtletas();
	}
	
	public void vaciar() {
		while (this.atletas.size() > 0) {
			this.atletas.remove(0);
		}
	}
}
