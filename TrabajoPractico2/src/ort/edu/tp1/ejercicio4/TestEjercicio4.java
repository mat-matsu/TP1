package ort.edu.tp1.ejercicio4;

public class TestEjercicio4 {

	public static void main(String[] args) {
		// Creo la vivienda
		Vivienda vivienda1 = new Vivienda("Montañeses", 1234, 4, "C");
		
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
		
		// Muestro la vivienda y su contenido
		System.out.println("Vivienda 1: ");
		vivienda1.mostrarTodo();

	}
	
}
