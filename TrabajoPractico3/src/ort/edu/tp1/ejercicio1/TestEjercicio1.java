package ort.edu.tp1.ejercicio1;

public class TestEjercicio1 {

	public static void main(String[] args) {
		Asalariado asalariado = new Asalariado("Jose", 30, 10000);
		SubContratado subContratado = new SubContratado("Carlos", 23, 50, 100);
		
		System.out.println(asalariado.toString());
		System.out.println(subContratado.toString());
		

	}

}
