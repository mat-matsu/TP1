package tp1.tp4.ej2;

public class Alumno extends Persona {
	public static final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
	private int numeroLegajo;
	
	public Alumno(int numeroLegajo, String nombreCompleto, int anioNacimiento) {
		super(nombreCompleto, anioNacimiento);
		setNumeroLegajo(numeroLegajo);
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAlumno [numeroLegajo=" + numeroLegajo + "]";
	}
	
}
