package tp1.tp4.ej2;

import java.util.Scanner;

import tp1.tp4.tj3.LectorEnteros;
import tp1.tp4.tj3.RangoDeEnteros;

public class Ej2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LectorEnteros lector = new LectorEnteros(input);
		final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
		final RangoDeEnteros RANGO_ANIO_NACIMIENTO = new RangoDeEnteros(1900, 2019);
		Alumno alu = null;
		int dni = 0, anioNacimiento = 0;
		String nombreCompleto;

		while (alu == null) {
			// TODO Procesar la carga de la persona.
			dni = pedirDni(input);
			nombreCompleto = pedirNombre(input);
			anioNacimiento = pedirAnioNacimiento(input);
			
			alu = new Alumno(dni, nombreCompleto, anioNacimiento);
		}
		input.close();
		System.out.println(alu.toString());

		if (alu.vive()) {
			System.out.println("La persona vive");
		} else {
			System.out.println("La persona no vive");
		}

	}
	
	private static int pedirDni(Scanner input) {
		int dni = 0;
		while(dni == 0) {
			try {
				System.out.print("Ingrese el legajo del alumno: ");
				dni = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error. Se produjo un error en la carga: " + e.getMessage());
			} finally {
				System.out.println("\n*************************\n");
			}
		}
		
		return dni;
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
	
	private static int pedirAnioNacimiento(Scanner input) {
		int anioNacimiento = 0;
		while(anioNacimiento == 0) {
			try {
				System.out.print("Ingrese el año de nacimiento del alumno: ");
				anioNacimiento = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error. Se produjo un error en la carga: " + e.getMessage());
			} finally {
				System.out.println("\n*************************\n");
			}
		}
		
		return anioNacimiento;
	}
}