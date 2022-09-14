package ort.edu.tp1.ejercicio3;

import java.util.ArrayList;

public class TestEjercicio3 {

	public static void main(String[] args) {
		ArrayList<Producto> articulos = new ArrayList<>();
		articulos.add(new Heladera("Whirpool", "H2745", 12345, 220, false, 14999, 250, true));
		articulos.add(new Lavarropas("Drean", "CONCEPT 5.05", 65432, 220, false, 6799, 6, false));
		articulos.add(new Licuadora("Moulinex", "Optimix Plus LM 2701AR", 21258, 220, false, 9099, 550, 2));
		articulos.add(new Televisor("Philips", "49PGFS", 98548, 220, false, 14370, 49, true));

		Venta venta = new Venta(articulos);
		venta.realizarVenta();
		
		venta.realizarVenta();
		
		
	}
	
	
	
}
