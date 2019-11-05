package pla5;

public class Invertir implements ICodificar {

	@Override
	public String codificar(String cadena) {
		  
        StringBuilder input1 = new StringBuilder(); 
        input1.append(cadena); 
        input1 = input1.reverse(); 
  
		return input1.toString();
	}

	@Override
	public String decodificar(String cadena) {
		return codificar(cadena);
	}


}
