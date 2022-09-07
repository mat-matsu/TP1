package ort.edu.tp1.ejercicio5;

import java.util.ArrayList;

import ort.edu.tp1.ejercicio4.Vivienda;
import ort.edu.tp1.ejercicio4.Persona;
import ort.edu.tp1.ejercicio4.Mueble;

public class Edificio {
	private ArrayList<Vivienda> viviendas;
	
	public Edificio() {
		this.viviendas = new ArrayList<>();
	}
	
	public void agregarVivienda(Vivienda vivienda) {
		this.viviendas.add(vivienda);
	}
	
	public void realizarMudanza(int pisoOrigen, String deptoOrigen, int pisoDestino, String deptoDestino) {
		Vivienda origen = null;
		Vivienda destino = null;

		for(Vivienda vivienda : this.viviendas) {
			if(vivienda.compararDireccion(pisoOrigen, deptoOrigen) && vivienda.estaOcupada()) {
				origen = vivienda;
			}
			if(vivienda.compararDireccion(pisoDestino, deptoDestino) && !vivienda.estaOcupada()) {
				destino = vivienda;
			}
			
		}
		
		if (origen == null) {
			System.out.println("La vivienda de origen no existe o no está ocupada.");
		}
		
		if (destino == null) {
			System.out.println("La vivienda de destino no existe o está ocupada.");
		}
		
		if (origen != null && destino != null) {
			for (Persona persona : origen.getPersonas()) {
				destino.agregarPersona(persona);
			}
			
			for (Mueble mueble : origen.getMuebles()) {
				destino.agregarMueble(mueble);
			}
			
			origen.vaciarPersonas();
			origen.vaciarMuebles();
			
			System.out.println("Se ha realizado la mudanza de vivienda 1 a vivienda 2.");
		}
	}
	
	public void mostrarTodo() {
		int i = 0;
		while (i < this.viviendas.size()) {
			System.out.println("Vivienda " + (i+1) + ":");
			this.viviendas.get(i).mostrarTodo();
			i++;
		}
	}
}
