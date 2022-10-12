package tp1.tp4.tj3;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		int nacimiento = 0;
		int fallecimiento = 0;
		Scanner input = new Scanner(System.in);
		// TODO implementar
		LectorEnteros lectorEnteros = new LectorEnteros(input);
		lectorEnteros.pedir("Ingrese edad");
		
		System.out.println("\n*************************\n");
		
		try {
			lectorEnteros.pedir("Ingrese la nota del alumno", 0, 10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n*************************\n");
		
		try {
			RangoDeEnteros rangoValido = new RangoDeEnteros(0, 10);
			lectorEnteros.pedir("Ingrese la nota del alumno", rangoValido);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		input.close();
	}
}
