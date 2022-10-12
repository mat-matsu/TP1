package tp1.tp4.ej2;

import java.time.Year;

public class Persona {
	private static final int VALOR_AUN_VIVE = -9999;
	private String nombreCompleto;
	private int anioNacimiento;
	private int anioFallecimiento;
	private int anioActual;
	
	public Persona(String nombreCompleto, int anioNacimiento) {
		this(nombreCompleto, anioNacimiento, VALOR_AUN_VIVE);
	}
	
	public Persona(String nombreCompleto, int anioNacimiento, int anioFallecimiento) {
		this.setAnioActual();
		this.setNombreCompleto(nombreCompleto);
		this.setAnioNacimiento(anioNacimiento);
		this.setAnioFallecimiento(anioFallecimiento);
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	private void setNombreCompleto(String nombreCompleto) {
		if (nombreCompleto == null || nombreCompleto.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacio ni ser null");
		}
		
		this.nombreCompleto = nombreCompleto;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	private void setAnioNacimiento(int anioNacimiento) {
		if (anioNacimiento > this.anioActual) {
			throw new IllegalArgumentException("El año de nacimiento no puede estar en el futuro");
		}
		
		this.anioNacimiento = anioNacimiento;
	}

	public int getAnioFallecimiento() {
		return anioFallecimiento;
	}

	public void setAnioFallecimiento(int anioFallecimiento) {
		if (anioFallecimiento != VALOR_AUN_VIVE) {
			if (anioFallecimiento > this.anioActual) {
				throw new IllegalArgumentException("El año de fallecimiento no puede estar en el futuro");
			} else if (anioFallecimiento < this.anioNacimiento) {
				throw new IllegalArgumentException("No puede fallecer antes de nacer.");
			}
		}
		
		this.anioFallecimiento = anioFallecimiento;
	}

	private void setAnioActual() {
		this.anioActual = Year.now().getValue();
	}
	
	public boolean vive() {
		boolean vive = true;
		if (this.getAnioFallecimiento() != VALOR_AUN_VIVE) {
			vive = false;
		}
		
		return vive;
	}

	@Override
	public String toString() {
		return "Persona [nombreCompleto=" + nombreCompleto + ", anioNacimiento=" + anioNacimiento
				+ ", anioFallecimiento=" + anioFallecimiento + "]";
	}
	
	
}
