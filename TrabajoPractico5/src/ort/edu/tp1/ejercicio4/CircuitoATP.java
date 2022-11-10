package ort.edu.tp1.ejercicio4;

import java.util.ArrayList;

public class CircuitoATP {
	private String[] jugadores;
	private String[] torneos;
	private int[][] resultados;

	public CircuitoATP() {
		this.cargarData();
	}
	public void cargarData() {
		this.jugadores = new String[] {"Pella", "Del Potro", "Schwartzman", "Mayer", "Delbonis"};
		this.torneos = new String[] { "Australia", "USOpen", "RolandGarros", "Wimbledon","Shangai"};
		this.resultados = new int[][] {	{1,3,4,1,3},
										{3,2,3,4,1},
										{2,1,5,5,2},
										{4,5,1,2,5},
										{5,4,2,3,4}};
		
				
	}
	public ArrayList<Jugador> procesarInfo() {
		ArrayList<Jugador> Jugadors = new ArrayList<>();
		//Completar
		for(int i = 0; i < this.jugadores.length; i++) {
			Jugador jugador = new Jugador(this.jugadores[i]);
			for(int j = 0; j < this.torneos.length; j++) {
				jugador.procesarResultado(this.resultados[i][j]);
			}
			Jugadors.add(jugador);
		}
		return Jugadors;
	}
	public String procesarTorneosJugador(String Jugador) {
		String competencias = "";
		//Completar
		int posJugador = this.buscoJugador(Jugador);
		
		if (posJugador > -1) {
			competencias += Jugador + ":";
			for(int i = 0; i < this.torneos.length; i++) {
				competencias += " " + this.torneos[i] + ":" + this.resultados[posJugador][i];
			}
			System.out.println(competencias);
		}
		
		return competencias;
	}
	public String obtenerResultadoJugador(String jugador, String torneo) {
		//Completar
		int posJugador = this.buscoJugador(jugador);
		int posTorneo = this.buscoTorneo(torneo);
		String resultados = "Resultados de ";
		
		if(posJugador > -1 && posTorneo > -1) {
			resultados += this.jugadores[posJugador] + " en ";
			resultados += this.torneos[posTorneo] + ":";
			resultados += this.resultados[posJugador][posTorneo];
		}
		
		return resultados;
	}
	private int buscoJugador(String Jugador) {
		int posJugador = -1;
		//Completar
		for(int i = 0; i < this.jugadores.length; i++) {
			if(this.jugadores[i].equals(Jugador)) {
				posJugador = i;
			}
		}
		return posJugador;
	}
	private int buscoTorneo(String torneo) {
		int posTorneo = -1;
		//Completar
		for(int i = 0; i < this.torneos.length; i++) {
			if(this.torneos[i].equals(torneo)) {
				posTorneo = i;
			}
		}
		return posTorneo;
	}
	public int procesarPeorPosTorneoJugador(String jugador) {
		//Completar
		int peorPos = 0;
		ArrayList<Jugador> jugadors = procesarInfo();
		
		for(Jugador jugadr : jugadors) {
			if(jugadr.getNombre().equals(jugador)) {
				peorPos = jugadr.getPeorResultado();
			}
		}
		
		System.out.println("Peor Resultado de " + jugador + " en el año:" + peorPos);
		
		return peorPos;
	}
}
