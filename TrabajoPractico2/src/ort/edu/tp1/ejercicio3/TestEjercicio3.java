package ort.edu.tp1.ejercicio3;

import ort.edu.tp1.ejercicio1.NumeroTelefonico;
import ort.edu.tp1.ejercicio1.Persona;
import ort.edu.tp1.ejercicio1.TipoDeLinea;
import ort.edu.tp1.ejercicio2.Mascota;

public class TestEjercicio3 {

	public static void main(String[] args) {
		// Creo a las personas
		Persona persona = new Persona("Lionel","Messi");
		Persona persona2 = new Persona("Antonella", "Rocuzzo");
		
		// Creo los número telefónicos
		NumeroTelefonico numero = new NumeroTelefonico(549, 114111, 2222, TipoDeLinea.FAX);
		NumeroTelefonico numero2 = new NumeroTelefonico(68, 32444, 5678, TipoDeLinea.CELULAR);
		NumeroTelefonico numero3 = new NumeroTelefonico(54, 4411, 5472, TipoDeLinea.FIJO);
		
		// Agrego los teléfonos a la persona
		persona.agregarNumero(numero);
		persona.agregarNumero(numero2);
		persona2.agregarNumero(numero3);
		
		// Agrego los emails
		persona.agregarEmail("lio@messi.com");
		persona.agregarEmail("la@pulga.com");
		persona.agregarEmail("lionel@messias.com");
		persona2.agregarEmail("anto@rocuzzo.com");
		
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
		persona2.agregarMascota(mascota1);
		persona2.agregarMascota(mascota2);
		persona2.agregarMascota(mascota3);
		persona2.agregarMascota(mascota4);
		
		// Creo hitos
		Hito hito1 = new Hito("20/12/2016", "Casamiento");
		Hito hito2 = new Hito("01/06/2022", "Campeón de la Finalissima");
		
		// Agrego personas a los hitos
		hito1.agregarPersona(persona);
		hito1.agregarPersona(persona2);
		hito2.agregarPersona(persona);
		
		hito1.mostrarTodo();
		System.out.println("**************************");
		hito2.mostrarTodo();

	}

}
