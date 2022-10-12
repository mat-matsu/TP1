package tp1.tp4.tj3;

import java.util.Scanner;

public class LectorEnteros {
	private static final String MENSAJE_ERROR_SCANNER_NULL = "Debe recibirse un Scanner.";
	private static final String MENSAJE_CARGA_ENTERO = "Ingrese un numero entero cualquiera";
	private static final String MENSAJE_FUERA_DE_RANGO = "El valor ingresado esta fuera del rango aceptable";

	private Scanner scanner;

	private int cargar(String mensaje) {
		System.out.println(mensaje);
		return Integer.parseInt(scanner.nextLine());
	}
	public LectorEnteros(Scanner scanner) {
		// TODO implementar
		this.setScanner(scanner);
	}
	
	public void setScanner(Scanner scanner) {
		if(scanner == null) {
			throw new IllegalArgumentException(MENSAJE_ERROR_SCANNER_NULL);
		}
		this.scanner = scanner;
	}

	public int pedir(String mensaje) {
		// TODO implementar
		int valor = 0;
		try {
			valor = this.cargar(mensaje);
		} catch (NumberFormatException e) {
			System.out.println("Error. Se produjo un error en la carga: " + e.getMessage());
		}
		
		return valor;
	}

	public int pedir(String mensaje, int limiteA, int limiteB) throws Exception {
		// TODO implementar
		int valor = 0;
		RangoDeEnteros rangoDeEnteros = new RangoDeEnteros(limiteA, limiteB);
		try {
			valor = this.cargar(mensaje + rangoDeEnteros.toString());
		} catch (NumberFormatException e) {
			System.out.println("Error. Se produjo un error en la carga: " + e.getMessage());
		}
		
		if(!rangoDeEnteros.incluye(valor)) {
			throw new Exception(MENSAJE_FUERA_DE_RANGO);
		}
		
		return valor;
	}

	public int pedir(String mensaje, RangoDeEnteros rangoValido) throws Exception {
		// TODO implementar
		int valor = 0;
		
		if(mensaje == null) {
			throw new Exception("El mensaje no puede estar vacío ni ser null.");
		}
		
		if (mensaje.isEmpty()) {
			mensaje = MENSAJE_CARGA_ENTERO;
		}
		
		if(rangoValido == null) {
			throw new Exception("El rango no puede ser null.");
		}
		
		try {
			valor = this.cargar(mensaje + rangoValido.toString());
		} catch (NumberFormatException e) {
			System.out.println("Error. Se produjo un error en la carga: " + e.getMessage());
		}
		
		if(!rangoValido.incluye(valor)) {
			throw new Exception(MENSAJE_FUERA_DE_RANGO);
		}
		
		return valor;
	}
}
