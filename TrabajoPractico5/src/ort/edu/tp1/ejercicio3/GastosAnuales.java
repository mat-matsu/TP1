package ort.edu.tp1.ejercicio3;

import ort.edu.tp1.ejercicio2.Mes;

public class GastosAnuales {
	private Rubro[] rubros;
	private Mes[] meses = Mes.values();
	
	public GastosAnuales() {
		this.rubros = new Rubro[0];
	}
	
	public void agregarGasto(Mes mes, String nombreRubro, double importe) {
		if (!(importe > 0)) {
			throw new IllegalArgumentException("El importe debe ser mayor a 0");
		}
		
		Rubro rubro = obtenerRubro(nombreRubro);
		rubro.agregarGasto(mes, importe);
		
		System.out.println("Importe agregado correctamente.");
	}
	
	private Rubro obtenerRubro(String nombreRubro) {
		Rubro rubro = buscarRubro(nombreRubro); 
		
		if (rubro == null) {
			rubro = new Rubro(nombreRubro);
			agregarRubro(rubro);
		}
		
		return rubro;
	}
	
	private Rubro buscarRubro(String nombreRubro) {
		Rubro rubroBuscado = null;
		
		for (Rubro rubro : this.rubros) {
			if (rubro != null && rubro.getNombre().equals(nombreRubro)) {
				rubroBuscado = rubro;
			}
		}
		
		return rubroBuscado;
	}
	
	private void agregarRubro(Rubro rubro) {
		int longActual = this.rubros.length;
		Rubro[] newRubros = new Rubro[longActual + 1];
		
		for(int i = 0; i < this.rubros.length; i++) {
			newRubros[i] = this.rubros[i];
		}
		
		newRubros[longActual] = rubro;
		this.rubros = newRubros;
	}
	
	private double[][] consolidadoDeGastos() {
		double[][] consolidado = new double[this.meses.length][this.rubros.length];
		
		for (int i = 0; i < this.meses.length; i++) {
			for (int j = 0; j < this.rubros.length; j++) {
				consolidado[i][j] = this.rubros[j].getTotalGastos(this.meses[i]);
			}
		}
		
		return consolidado;
	}
	
	public double gastoAcumulado(Mes mes) {
		double acumulado = 0;
		double[][] consolidado = consolidadoDeGastos();
		int mesNum = Mes.valueOf(mes.getNombre()).ordinal();
		
		for(int i = 0; i < this.rubros.length; i++) {
			acumulado += consolidado[mesNum][i];
		}
		
		return acumulado;
	}
	
	public double gastoAcumulado(String nombreRubro) {
		double acumulado = 0;
		Rubro rubro = buscarRubro(nombreRubro); 
		if (rubro == null) {
			acumulado = -1;
		} else {
			for (int i = 0; i < this.meses.length; i++) {
				acumulado += rubro.getTotalGastos(this.meses[i]);
			}
		}
				
		return acumulado;
	}
	
	public void informarConsumosPorMes() {
		double[][] consolidado = consolidadoDeGastos();
		
		for(int i = 0; i < this.meses.length; i++) {
			System.out.println("Mes: " + this.meses[i].getNombre());
			for(int j = 0; j < this.rubros.length; j++) {
				System.out.println("Rubro: " + this.rubros[j].getNombre() + " / Importe: " + consolidado[i][j]);
			}
			System.out.println("**************************************");
		}
	}
	
	public void informarPromedioMensualPorRubro() {
		double[][] consolidado = consolidadoDeGastos();
		
		for(int i = 0; i < this.rubros.length; i++) {
			int acumulado = 0;
			System.out.println("Rubro: " + this.rubros[i].getNombre());
			for(int j = 0; j < this.meses.length; j++) {
				acumulado += consolidado[j][i];
			}
			System.out.println("Promedio mensual: " + acumulado/this.meses.length);
			System.out.println("**************************************");
		}
	}
	
	public void informarMesMayorConsumo() {
		double[][] consolidado = consolidadoDeGastos();
		double[][] mayorConsumo = new double[this.meses.length][1];
		
		double mayor = 0;
		
		for(int i = 0; i < this.meses.length; i++) {
			double acumulado = 0;
			for(int j = 0; j < this.rubros.length; j++) {
				acumulado += consolidado[i][j];
			}
			
			if (acumulado > mayor) {
				mayorConsumo = new double[this.meses.length][1];
				mayor = acumulado;
				mayorConsumo[i][0] = acumulado;
			} else if (acumulado == mayor) {
				mayorConsumo[i][0] = acumulado;
			}
		}
		
		System.out.println("Meses con mayor consumo:");
		for(int i = 0; i < mayorConsumo.length; i++) {
			if(mayorConsumo[i][0] > 0) {
				System.out.println(this.meses[i].getNombre() + " $" + mayorConsumo[i][0]);
			}
		}
		System.out.println("**************************************");
	}
}
