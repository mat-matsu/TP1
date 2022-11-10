package ort.edu.tp1.ejercicio2;

public enum Mes {
	ENE("Enero"), FEB("Febrero"), MAR("Marzo"), ABR("Abril"), MAY("Mayo"), JUN("Junio"),
	JUL("Julio"), AGO("Agosto"), SEP("Septiembre"), OCT("Octubre"), NOV("Noviembre"), DIC("Diciembre");
	
	private String nombre;
	
	Mes(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
