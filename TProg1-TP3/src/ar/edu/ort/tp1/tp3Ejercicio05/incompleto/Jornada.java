package ar.edu.ort.tp1.tp3Ejercicio05.incompleto;

import java.util.ArrayList;

public class Jornada {
	
	private ArrayList<Partido> partidos;
	private int fecha;//1,2...n

	public Jornada() {
		partidos = new ArrayList<>();
	}
	
	public Jornada(int fecha) {
		partidos = new ArrayList<>();
		this.fecha = fecha;
	}
	
	public void agregarPartido(Partido partido) {
		partidos.add(partido);
	}
	
	public void eliminarPartido(Partido partido) {
		partidos.remove(partido);
	}
	
	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
}