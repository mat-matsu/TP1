package ort.edu.tp1.ejercicio3;

import ort.edu.tp1.ejercicio2.Mes;

public class Rubro {
	private static final int TOTAL_MESES = 12;
	private String nombre;
	private double[] gastosPorMes;
	
	public Rubro(String nombre) {
		this.nombre = nombre;
		inicializarGastos();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	private void inicializarGastos() {
		this.gastosPorMes = new double[TOTAL_MESES];
	}
	
	public void agregarGasto(Mes mes, double importe) {
		this.gastosPorMes[Mes.valueOf(mes.toString()).ordinal()] += importe; 
	}
	
	public double getTotalGastos(Mes mes) {
		return this.gastosPorMes[Mes.valueOf(mes.toString()).ordinal()];
	}
	
}
