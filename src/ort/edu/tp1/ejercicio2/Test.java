package ort.edu.tp1.ejercicio2;

import ort.edu.tp1.ejercicio1.carrera100;

public class Test {

	public static void main(String[] args) {
		// Creo la carrera
		Carrera carrera100 = new Carrera(100);
		Carrera carrera400 = new Carrera(400);
		
		
		// Agrego atletas
		carrera100.agregarAtleta("Jose", 10.5);
		carrera100.agregarAtleta("Pedro", 11.15);
		carrera100.agregarAtleta("Pablo", 9.73);
		carrera100.agregarAtleta("Fulanito", 10.67);
		
		// Mostrar todos los datos del carrera100
		carrera100.mostrar();
		
		// Remuevo integrante ficticio y muestro los datos
		System.out.println("Integrante eliminado: " + carrera100.removerIntegrante("Fulanito") + " del carrera100 " + carrera100.getNombre());
		
		// Remuevo de nuevo el integrante ficticio
		carrera100.removerIntegrante("Fulanito");

		// Mostrar de nuevo todos los datos del carrera100
		carrera100.mostrar();
		
		// Vacio la lista y vuelvo a mostrar la lista
		carrera100.vaciar();
		carrera100.mostrar();
	}

}
