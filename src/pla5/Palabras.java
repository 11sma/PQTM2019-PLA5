package pla5;

import java.util.ArrayList;
import java.util.Arrays;

public class Palabras implements IProcesar {

	@Override
	public ArrayList<String> dividir(String cadena) {
		ArrayList<String> array = new ArrayList<String>(Arrays.asList(cadena.split(" ")));
		ArrayList<String> resultado = new ArrayList<String>();
		for (String s : array) {
			resultado.add(s.replace("\\s+", ""));
		}
		return resultado;
	}

	@Override
	public String unir(ArrayList<String> cadenas) {
		String resultado = "";
		for (String c: cadenas) {
			resultado = resultado + c + " ";
		}
		return resultado.substring(0, resultado.length());
	}

}
