package ort.edu.tp1.ejercicio1;

public class Test {

	public static void main(String[] args) {
		// Creo el grupo
		Grupo grupo = new Grupo("YA-TP1-12A-GRP04");
		
		// Agrego integrantes
		grupo.agregarIntegrante("Muriel Bianchi");
		grupo.agregarIntegrante("Daniela Bani");
		grupo.agregarIntegrante("Andre Chaumet");
		grupo.agregarIntegrante("Matias Matsumoto");
		grupo.agregarIntegrante("Fulanito");
		
		// Verifica existencia del integrante
		existeIntegrante(grupo, "Fulanito");
		existeIntegrante(grupo, "Menganito");
		
		// Mostrar todos los datos del grupo
		grupo.mostrar();
		
		// Remuevo integrante ficticio y muestro los datos
		System.out.println("Integrante eliminado: " + grupo.removerIntegrante("Fulanito") + " del grupo " + grupo.getNombre());
		
		// Remuevo de nuevo el integrante ficticio
		grupo.removerIntegrante("Fulanito");

		// Mostrar de nuevo todos los datos del grupo
		grupo.mostrar();
		
		// Vacio la lista y vuelvo a mostrar la lista
		grupo.vaciar();
		grupo.mostrar();
		
	}
	
	public static void existeIntegrante(Grupo grupo, String nombre) {
		if(grupo.buscarIntegrante(nombre) == null) {
			System.out.println(nombre + " no existe el integrante en el grupo " + grupo.getNombre());
		} else {
			System.out.println(nombre + " existe el integrante en el grupo " + grupo.getNombre());
		}
		
	}

}
