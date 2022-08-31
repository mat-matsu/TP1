package ort.edu.tp1.ejercicio2;

import ort.edu.tp1.ejercicio1.NumeroTelefonico;
import ort.edu.tp1.ejercicio1.Persona;
import ort.edu.tp1.ejercicio1.TipoDeLinea;

public class TestEjercicio2 {

	public static void main(String[] args) {
		// Creo a la persona
		Persona persona = new Persona("Lionel","Messi");
		
		// Creo los número telefónicos
		NumeroTelefonico numero = new NumeroTelefonico(549, 114111, 2222, TipoDeLinea.FAX);
		NumeroTelefonico numero2 = new NumeroTelefonico(68, 32444, 5678, TipoDeLinea.CELULAR);
		NumeroTelefonico numero3 = new NumeroTelefonico(54, 4411, 5472, TipoDeLinea.FIJO);
		
		// Agrego los teléfonos a la persona
		persona.agregarNumero(numero);
		persona.agregarNumero(numero2);
		persona.agregarNumero(numero3);
		
		// Agrego los emails
		persona.agregarEmail("lio@messi.com");
		persona.agregarEmail("la@pulga.com");
		persona.agregarEmail("lionel@messias.com");
		
		// Creo a las mascotas
		Mascota mascota1 = new Mascota("Pluto", "Perro");
		Mascota mascota2 = new Mascota("Felix", "Gato");
		Mascota mascota3 = new Mascota("Bugs", "Conejo");
		Mascota mascota4 = new Mascota("Hulk", "Perro");
		
		// Agrego a las mascotas
		persona.agregarMascota(mascota1);
		persona.agregarMascota(mascota2);
		persona.agregarMascota(mascota3);
		persona.agregarMascota(mascota4);
				
		persona.mostrarTodoConMascotas();
		
		// Saco a la mascota Pluto
		persona.sacarMascota(mascota1);
		
		System.out.println("**************************");
		persona.mostrarTodoConMascotas();

	}

}
