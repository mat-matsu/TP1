package tp1.tp4.tj3;

import java.time.Year;
import java.util.Scanner;

import tp1.tp4.ej2.Persona;

public class Ej3 {
	public static void main(String[] args) {
		int nacimiento = 0, fallecimiento = 0, anioActual = Year.now().getValue();
		final RangoDeEnteros RANGO_ANIO_NACIMIENTO = new RangoDeEnteros(1900, anioActual);
		String nombreCompleto;
		Scanner input = new Scanner(System.in);
		LectorEnteros lector = new LectorEnteros(input);
		Persona persona = null;
		
		// TODO implementar
		LectorEnteros lectorEnteros = new LectorEnteros(input);
		lectorEnteros.pedir("Ingrese un número cualquiera");
		
		
		System.out.println("\n*************************\n");
		
		while (persona == null) {
			// TODO Procesar la carga de la persona.
			
			nombreCompleto = pedirNombre(input);
			try {
				nacimiento = lectorEnteros.pedir("Ingrese una fecha de nacimiento", 1900, anioActual);
			} catch (Exception e) {
				System.out.println("Error. Se produjo un error en la carga: " + e.getMessage());
			}
			RangoDeEnteros rangoFallecimiento = new RangoDeEnteros(nacimiento, anioActual);
			try {
				fallecimiento = lectorEnteros.pedir("Ingrese una fecha de nacimiento", rangoFallecimiento);
			} catch (Exception e) {
				System.out.println("Error. Se produjo un error en la carga: " + e.getMessage());
			}
			
			persona = new Persona(nombreCompleto, nacimiento, fallecimiento);
		}
		
		input.close();
		System.out.println(persona.toString());

		if (persona.vive()) {
			System.out.println("La persona vive");
		} else {
			System.out.println("La persona no vive");
		}
		
		input.close();
	}
	
	private static String pedirNombre(Scanner input) {
		String nombre = null;
		try {
			System.out.print("Ingrese el nombre completo del alumno: ");
			nombre = input.nextLine();
		} catch (Exception e) {
			System.out.println("Error. Se produjo un error en la carga: " + e.getMessage());
		} finally {
			System.out.println("\n*************************\n");
		}
		
		return nombre;
	}
}
