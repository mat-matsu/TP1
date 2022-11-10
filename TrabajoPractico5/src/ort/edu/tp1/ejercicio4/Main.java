package ort.edu.tp1.ejercicio4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircuitoATP circuitoATP = new CircuitoATP();
		
		ArrayList<Jugador> jugadores = circuitoATP.procesarInfo();
		System.out.println("Resultado final campeonato: ");
		for(Jugador jugador : jugadores) {
			System.out.println(jugador.toString());
		}
		
		circuitoATP.procesarTorneosJugador("Delbonis");
		
		System.out.println(circuitoATP.obtenerResultadoJugador("Schwartzman", "RolandGarros"));
		
		circuitoATP.procesarPeorPosTorneoJugador("Pella");
	}

}
