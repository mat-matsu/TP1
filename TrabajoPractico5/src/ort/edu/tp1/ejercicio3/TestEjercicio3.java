package ort.edu.tp1.ejercicio3;

import ort.edu.tp1.ejercicio2.Mes;

public class TestEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GastosAnuales gastosAnuales = new GastosAnuales();
		Mes[] meses = Mes.values();
		
		gastosAnuales.agregarGasto(meses[0], "Rubro 1", 100);
		gastosAnuales.agregarGasto(meses[0], "Rubro 2", 100);
		gastosAnuales.agregarGasto(meses[1], "Rubro 1", 100);
		gastosAnuales.agregarGasto(meses[2], "Rubro 2", 100);
		gastosAnuales.agregarGasto(meses[3], "Rubro 3", 100);
		gastosAnuales.agregarGasto(meses[3], "Rubro 1", 100);
		gastosAnuales.agregarGasto(meses[4], "Rubro 4", 100);
		gastosAnuales.agregarGasto(meses[5], "Rubro 5", 100);
		gastosAnuales.agregarGasto(meses[6], "Rubro 2", 100);
		gastosAnuales.agregarGasto(meses[6], "Rubro 3", 100);
		gastosAnuales.agregarGasto(meses[7], "Rubro 1", 100);
		gastosAnuales.agregarGasto(meses[7], "Rubro 5", 100);
		gastosAnuales.agregarGasto(meses[8], "Rubro 4", 100);
		gastosAnuales.agregarGasto(meses[9], "Rubro 1", 100);
		gastosAnuales.agregarGasto(meses[11], "Rubro 1", 100);
		gastosAnuales.agregarGasto(meses[11], "Rubro 3", 100);
		
		gastosAnuales.informarConsumosPorMes();
		
		gastosAnuales.informarMesMayorConsumo();
		
		gastosAnuales.informarPromedioMensualPorRubro();
	}

}
