package pla5;

import java.util.ArrayList;

public class Codificador {

	public IProcesar iProcesar;
	
	public ICodificar iCodificar;

	public Codificador(IProcesar iProcesar, ICodificar iCodificar) {
		this.iProcesar = iProcesar;
		this.iCodificar = iCodificar;
	}
	
	public String codificar(String cadena) {
		
		ArrayList<String> array = iProcesar.dividir(cadena);
		
		ArrayList<String> resultado = new ArrayList<String>();
		for (String s : array) {
			resultado.add(iCodificar.codificar(s));
		}
		
		return iProcesar.unir(resultado);

	}
	
	public String decodificar(String cadena) {
		ArrayList<String> array = iProcesar.dividir(cadena);
		
		ArrayList<String> resultado = new ArrayList<String>();
		for (String s : array) {
			resultado.add(iCodificar.decodificar(s));
		}
		
		return iProcesar.unir(resultado);
	}
}
