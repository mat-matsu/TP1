package ort.edu.tp1.ejercicio2y3;

import java.util.ArrayList;

public class Carrera {
	private String categoria;
	private ArrayList<Atleta> atletas;
	
	public Carrera(String categoria) {
		setCategoria(categoria);
		this.atletas = new ArrayList<>();
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	private void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void agregarAtleta(Atleta atleta) {
		this.atletas.add(atleta);
	}
	
	public ArrayList<Atleta> obtenerGanadores() {
		ArrayList<Atleta> atletasGanadores = new ArrayList<>();
		atletasGanadores.add(this.atletas.get(0));
		int i = 1;
		
		while(i < this.atletas.size()) {
			
			if (this.atletas.get(i).getTiempo() == atletasGanadores.get(0).getTiempo()) {
				atletasGanadores.add(this.atletas.get(i));
			}
			
			if (this.atletas.get(i).getTiempo() < atletasGanadores.get(0).getTiempo()) {
				atletasGanadores.clear();
				atletasGanadores.add(this.atletas.get(i));
			}
			
			i++;
		}
		
		return atletasGanadores;
	}
	
	public ArrayList<Atleta> obtenerPosiciones() {
		ArrayList<Atleta> atletasPosiciones = new ArrayList<>();
		int i;
		
		for (Atleta atleta : this.atletas) {
			i = 0;
			while(i < atletasPosiciones.size() && atleta.getTiempo() > atletasPosiciones.get(i).getTiempo()) {
				i++;
			}
			atletasPosiciones.add(i, atleta);
			
		}
		
		return atletasPosiciones;
	}
}
