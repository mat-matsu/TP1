package ort.edu.tp1.ejercicio1;

public class Anio {
	private static final String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	private static final int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public String getNombreDelMes(int numeroMes) {
		return this.meses[numeroMes - 1];
	}
	
	public int diasTranscurridos(int numeroMes) {
		int transcurrido = 0;
		
		for (int i = 0; i < numeroMes; i++) {
			transcurrido += this.dias[i];
		}
		
		return transcurrido;
	}
	
	
}
