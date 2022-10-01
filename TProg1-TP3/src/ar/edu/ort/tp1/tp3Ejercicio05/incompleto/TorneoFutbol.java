package ar.edu.ort.tp1.tp3Ejercicio05.incompleto;

import java.util.ArrayList;

public abstract class TorneoFutbol {

	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;

	public TorneoFutbol() {
		equipos = new ArrayList<Equipo>();
		jornadas = new ArrayList<Jornada>();
	}

	public void agregarJornada(Jornada jornada) {
		if (jornada != null) {
			jornadas.add(jornada);
		}
	}

	public void eliminarJornada(Jornada jornada) {
		if (jornada != null) {
			jornadas.remove(jornada);
		}
	}

	public void agregarEquipo(Equipo equipo) {
		if (equipo != null) {
			equipos.add(equipo);
		}
	}

	public void eliminarEquipo(Equipo equipo) {
		if (equipo != null) {
			equipos.remove(equipo);
		}
	}

	public void finalizarJornada(Jornada jornada) {
		if (jornadas.contains(jornada)) {
			ArrayList<Partido> partidos = new ArrayList<>();
			
			for (int i = 0; i < jornadas.size(); i++) {
				partidos = jornadas.get(i).getPartidos();
				
				for (int j = 0; j < partidos.size(); j++) {
					calcularPuntos(partidos.get(j));
				}
				partidos.clear();
			}
		}
	}

	public void mostrarTabla() {
		System.out.println(getTipo());
		System.out.println("Tabla de posiciones al cabo de " + String.valueOf(jornadas.size()) + " fechas:");
		for (Equipo equipo : equipos) {
			System.out.println(equipo.toString());
		}
	}

	public abstract String getTipo();

	public void calcularPuntos(Partido partido) {
		int puntosLocal = 0;
		int puntosVisitante = 0;

		int golesEquipoLocal = partido.getGolesEquipoLocal();
		int golesEquipoVisitante = partido.getGolesEquipoVisitante();

		if (golesEquipoLocal > golesEquipoVisitante) {
			partido.getEquipoLocal().setPuntos(puntajePartidoGanado());
			partido.getEquipoVisitante().setPuntos(puntajePartidoPerdido());
			if(golesEquipoVisitante < 1) {
				partido.getEquipoLocal().setPuntos(puntajeVallaInvicta());
			}
		} else if (golesEquipoLocal < golesEquipoVisitante) {
			partido.getEquipoVisitante().setPuntos(puntajePartidoGanado());
			partido.getEquipoLocal().setPuntos(puntajePartidoPerdido());
			if(golesEquipoLocal < 1) {
				partido.getEquipoVisitante().setPuntos(puntajeVallaInvicta());
			}
		} else {
			partido.getEquipoVisitante().setPuntos(puntajePartidoEmpatado());
			partido.getEquipoLocal().setPuntos(puntajePartidoEmpatado());
			if(golesEquipoLocal > 3 && golesEquipoVisitante > 3) {
				partido.getEquipoLocal().setPuntos(puntajeEmpateMas3Goles());
				partido.getEquipoVisitante().setPuntos(puntajeEmpateMas3Goles());
			}

		}
	}

	public int puntajePartidoEmpatado() {
		return 1;
	}

	public abstract int puntajePartidoGanado();

	public abstract int puntajePartidoPerdido();

	public abstract int puntajeVallaInvicta();

	public abstract int puntajeGanador4Goles();

	public abstract int puntajeEmpateMas3Goles();

}