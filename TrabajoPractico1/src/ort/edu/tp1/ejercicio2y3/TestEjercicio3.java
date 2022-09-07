package ort.edu.tp1.ejercicio2y3;

import java.util.ArrayList;

public class TestEjercicio3 {

	public static void main(String[] args) {
		// Creo la carrera
		Carrera carrera = new Carrera("100 mts");
		
		// Creo los atletas
		Atleta atleta1 = new Atleta("Jose", 10.5);
		Atleta atleta2 = new Atleta("Pedro", 11.15);
		Atleta atleta3 = new Atleta("Pablo", 9.73);
		Atleta atleta4 = new Atleta("Fulanito", 10.67);
		Atleta atleta5 = new Atleta("Menganito", 9.73);
		Atleta atleta6 = new Atleta("Luis", 10.67);
		
		// Agrego a los atletas
		carrera.agregarAtleta(atleta1);
		carrera.agregarAtleta(atleta2);
		carrera.agregarAtleta(atleta3);
		carrera.agregarAtleta(atleta4);
		carrera.agregarAtleta(atleta5);
		carrera.agregarAtleta(atleta6);
		
		// Obtener lista de atletas ordenados por tiempos de menor a mayor y mostrarlos
		mostrarLista(carrera.obtenerPosiciones());
				
	}
	
	public static void mostrarLista(ArrayList<Atleta> atletas) {
		int i = 0;
		int j = 0;
		double tiempo = atletas.get(0).getTiempo();
		
		System.out.println("POSICIONES:");
		
		while (i < 3 && j < atletas.size()) {
			
			if (tiempo < atletas.get(j).getTiempo()) {
				tiempo = atletas.get(j).getTiempo();
				i++;
				
			}
			if (i < 3) {
				System.out.println(atletas.get(j).toString() + " Posición: " + (i+1) + "º");
			}
			
			j++;
		}
	}
}
