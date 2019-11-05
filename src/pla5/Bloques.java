package pla5;

import java.util.ArrayList;

public class Bloques implements IProcesar {

	@Override
	public ArrayList<String> dividir(String cadena) {
		ArrayList<String> lista = new ArrayList<String>();
		
		while (cadena.length() > 4) {
			lista.add(cadena.substring(0,4));
			cadena = cadena.substring(4, cadena.length());
		}
		lista.add(cadena);
		
		return lista;
	}

	@Override
	public String unir(ArrayList<String> cadenas) {
		String resultado = "";
		for (String c: cadenas) {
			resultado = resultado + c;
		}
		return resultado.substring(0, resultado.length());
	}

}
