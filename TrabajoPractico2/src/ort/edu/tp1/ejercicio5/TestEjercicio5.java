package ort.edu.tp1.ejercicio5;

import ort.edu.tp1.ejercicio4.Mueble;
import ort.edu.tp1.ejercicio4.Persona;
import ort.edu.tp1.ejercicio4.Vivienda;

public class TestEjercicio5 {

	public static void main(String[] args) {
		// Creo la vivienda
		Vivienda vivienda1 = new Vivienda("Montañeses", 1234, 4, "C");
		Vivienda vivienda2 = new Vivienda("Montañeses", 1234, 2, "B");
		
		// Creo a las personas
		Persona persona1 = new Persona("Arturo", "Roman", 53);
		Persona persona2 = new Persona("Mónica", "Gaztambide", 35);
		
		// Agrego a las personas a la vivienda
		vivienda1.agregarPersona(persona1);
		vivienda1.agregarPersona(persona2);
		
		// Creo los muebles
		Mueble mueble1 = new Mueble("Mesa", "Madera", "Marrón");
		Mueble mueble2 = new Mueble("Mesada", "Marmol", "Rojo");
		Mueble mueble3 = new Mueble("Perchero", "Metal", "Negro");
		Mueble mueble4 = new Mueble("Sillón", "Cuero", "Azul");
		
		// Agrego los muebles
		vivienda1.agregarMueble(mueble1);
		vivienda1.agregarMueble(mueble2);
		vivienda1.agregarMueble(mueble3);
		vivienda1.agregarMueble(mueble4);
		
		// Creo el edificio
		Edificio edificio = new Edificio();
		
		// Agrego las viviendas al edificio
		edificio.agregarVivienda(vivienda1);
		edificio.agregarVivienda(vivienda2);
		
		// Muestro las viviendas existentes en el edificio
		edificio.mostrarTodo();
		
		// Pruebo mudanzas con origen incorrecto
		edificio.realizarMudanza(1, "C", 2, "B");
		
		// Pruebo mudanzas con destino incorrecto
		edificio.realizarMudanza(4, "C", 1, "B");
		
		// Pruebo mudanzas correcta
		edificio.realizarMudanza(4, "C", 2, "B");
		
		// Muestro las viviendas existentes en el edificio
		edificio.mostrarTodo();

	}

}
