package ort.edu.tp1.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Venta {
	public static final Scanner input = new Scanner(System.in);
	
	private ArrayList<Producto> articulos;
	
	public Venta(ArrayList<Producto> articulos) {
		this.articulos = articulos;
	}
	
	
	public void mostrarProductos() {
		for(int i = 0; i < this.articulos.size(); i++) {
			System.out.println((i+1) + ") " + this.articulos.get(i).toString());
		}
	}
	
	private void mostrarDetalle(Producto producto) {
		System.out.println(producto.mostrarDetalle());
	}
	
	private ArrayList<Producto> seleccionArticulos() {
		int opcion = 0;
		Producto seleccion = null;
		ArrayList<Producto> articulosSeleccionados = new ArrayList<>();
		
		do {
			String confirma = "NO";
			
			mostrarProductos();
			System.out.println("Seleccione el producto a sumar al carrito o indique 0 para terminar: ");
			opcion = Integer.parseInt(input.nextLine());
			if (opcion != 0 && opcion <= this.articulos.size()) {
				seleccion = this.articulos.get(opcion - 1);
				do {
					mostrarDetalle(seleccion);
					System.out.println("¿Confirma la seleccion del producto? (SI/NO): ");
					confirma = input.nextLine();
				} while (!confirma.equalsIgnoreCase("SI") && !confirma.equalsIgnoreCase("NO"));
			}
			
			if (confirma.equalsIgnoreCase("SI")) {
				articulosSeleccionados.add(seleccion);
			}
			
		} while (opcion != 0);
		
		return articulosSeleccionados;
	}
	
	public ArrayList<Producto> realizarVenta() {
		ArrayList<Producto> seleccionProductos = seleccionArticulos();
		
		if (seleccionProductos.size() > 0) {
			float total = 0;
			System.out.println("Ticket de venta");
			System.out.println("Articulo/s:");
			for(Producto producto : seleccionProductos) {
				System.out.println(producto.mostrarDetalle());
				total += producto.getPrecio();
			}
			System.out.println("Total: $" + total);
		} else {
			System.out.println("No se ha realizado compra alguna.");
		}
		
		return seleccionProductos;
	}
}
