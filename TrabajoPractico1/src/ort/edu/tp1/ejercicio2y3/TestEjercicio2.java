package ort.edu.tp1.ejercicio2y3;

import java.util.ArrayList;

public class TestEjercicio2 {
	
	public static void main(String[] args) {
		// Creo la carrera
		Carrera carrera = new Carrera("100 mts");
		
		// Creo los atletas
		Atleta atleta1 = new Atleta("Jose", 10.5);
		Atleta atleta2 = new Atleta("Pedro", 11.15);
		Atleta atleta3 = new Atleta("Pablo", 9.73);
		Atleta atleta4 = new Atleta("Fulanito", 10.67);
		Atleta atleta5 = new Atleta("Menganito", 9.73);
		
		// Agrego a los atletas
		carrera.agregarAtleta(atleta1);
		carrera.agregarAtleta(atleta2);
		carrera.agregarAtleta(atleta3);
		carrera.agregarAtleta(atleta4);
		carrera.agregarAtleta(atleta5);
		
		// Obtener a los ganadores y mostrarlos
		mostrarLista(carrera.obtenerGanadores());
				
	}
	
	public static void mostrarLista(ArrayList<Atleta> atletas) {
		System.out.println("GANADORES:");
		for(Atleta atleta : atletas) {
			System.out.println(atleta.toString());
		}
	}

}
