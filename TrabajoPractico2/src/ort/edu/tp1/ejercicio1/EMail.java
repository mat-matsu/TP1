package ort.edu.tp1.ejercicio1;

public class EMail {
	private String cuenta;
	private String dominio;
	
	public EMail(String email) {
		this.cuenta = email.split("@")[0];
		this.dominio = email.split("@")[1];
	}
	
	public String getValor() {
		return this.cuenta + "@" + this.dominio;
	}
}
