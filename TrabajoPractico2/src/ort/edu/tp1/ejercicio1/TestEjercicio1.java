package ort.edu.tp1.ejercicio1;

public class TestEjercicio1 {

	public static void main(String[] args) {
		// Creo a la persona
		Persona persona = new Persona("Lionel","Messi");
		
		// Creo los número telefónicos
		NumeroTelefonico numero = new NumeroTelefonico(549, 114111, 2222, TipoDeLinea.FAX);
		NumeroTelefonico numero2 = new NumeroTelefonico(68, 32444, 5678, TipoDeLinea.CELULAR);
		NumeroTelefonico numero3 = new NumeroTelefonico(54, 4411, 5472, TipoDeLinea.FIJO);
		
		// Agrego los teléfonos a la persona
		persona.agregarNumero(numero);
		persona.agregarNumero(numero2);
		persona.agregarNumero(numero3);
		
		// Agrego los emails
		persona.agregarEmail("lio@messi.com");
		persona.agregarEmail("la@pulga.com");
		persona.agregarEmail("lionel@messias.com");
		
		persona.mostrarTodo();
	}

}
