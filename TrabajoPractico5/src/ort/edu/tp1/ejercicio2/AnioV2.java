package ort.edu.tp1.ejercicio2;

public class AnioV2 {
	private static final Mes[] meses = Mes.values();
	private static final int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public String getNombreDelMes(int numeroMes) {
		return this.meses[numeroMes - 1].getNombre();
	}
	
	public int diasTranscurridos(int numeroMes) {
		int transcurrido = 0;
		
		for (int i = 0; i < numeroMes; i++) {
			transcurrido += this.dias[i];
		}
		
		System.out.println(Mes.valueOf("ENE").ordinal());
		
		return transcurrido;
	}
}
