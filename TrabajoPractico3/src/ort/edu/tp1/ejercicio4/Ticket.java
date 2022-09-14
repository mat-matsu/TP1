package ort.edu.tp1.ejercicio4;

import java.util.ArrayList;

import ort.edu.tp1.ejercicio3.Producto;

public class Ticket implements Imprimible {
	private ArrayList<Producto> articulos;
	private Cliente cliente;
	
	public Ticket(Cliente cliente, ArrayList<Producto> articulos) {
		this.cliente = cliente;
		this.articulos = articulos;
	}
	
	@Override
	public void imprimir() {
		
		if (this.articulos.size() > 0) {
			float total = 0;
			System.out.println("Ticket de venta del cliente: ");
			System.out.println(this.cliente.toString());
			System.out.println("Articulo/s:");
			for(Producto producto : this.articulos) {
				System.out.println(producto.mostrarDetalle());
				total += producto.getPrecio();
			}
			System.out.println("Total: $" + total);
		} else {
			System.out.println("No ha realizado compra alguna.");
		}
	}
	
}
