package pla5;

import org.junit.jupiter.api.Test;

class TestClases {

	@Test
	void test() {
		String mensaje = "Hola! que tal?";
		
		Palabras palabras = new Palabras();
		System.out.println(palabras.dividir(mensaje));
		System.out.println(palabras.unir(palabras.dividir(mensaje)));
		
		Bloques bloques = new Bloques();
		System.out.println(bloques.dividir(mensaje));
		System.out.println(bloques.unir(bloques.dividir(mensaje)));
		
		
		Invertir invertir = new Invertir();
		System.out.println(invertir.codificar(mensaje));
		System.out.println(invertir.decodificar(invertir.codificar(mensaje)));
		
		Cesar cesar = new Cesar();
		System.out.println(cesar.codificar(mensaje));
		System.out.println(cesar.decodificar(cesar.codificar(mensaje)));
	}

}
