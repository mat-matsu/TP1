package ort.edu.tp1.ejercicio4;

import java.util.ArrayList;

import ort.edu.tp1.ejercicio3.Heladera;
import ort.edu.tp1.ejercicio3.Lavarropas;
import ort.edu.tp1.ejercicio3.Licuadora;
import ort.edu.tp1.ejercicio3.Producto;
import ort.edu.tp1.ejercicio3.Televisor;
import ort.edu.tp1.ejercicio3.Venta;

public class TestEjercicio4 {

	public static void main(String[] args) {
		ArrayList<Producto> articulos = new ArrayList<>();
		articulos.add(new Heladera("Whirpool", "H2745", 12345, 220, false, 14999, 250, true));
		articulos.add(new Lavarropas("Drean", "CONCEPT 5.05", 65432, 220, false, 6799, 6, false));
		articulos.add(new Licuadora("Moulinex", "Optimix Plus LM 2701AR", 21258, 220, false, 9099, 550, 2));
		articulos.add(new Televisor("Philips", "49PGFS", 98548, 220, false, 14370, 49, true));
		
		Cliente cliente1 = new Cliente("20-1234578-9", "Perez, Pedro");
		Cliente cliente2 = new Cliente("21-1234578-9", "Rodriguez, Maria");

		Venta venta = new Venta(articulos);
		Ticket ticket1 = new Ticket(cliente1, venta.realizarVenta());
		System.out.println("*****************************************");
		Ticket ticket2 = new Ticket(cliente2, venta.realizarVenta());
		
		System.out.println("*****************************************");
		ticket1.imprimir();
		
		System.out.println("*****************************************");
		ticket2.imprimir();
		
	}

}
