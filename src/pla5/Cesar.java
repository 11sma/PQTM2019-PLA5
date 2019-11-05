package pla5;

public class Cesar implements ICodificar {

	int shift = 2;
	
	@Override
	public String codificar(String cadena) {
		  
		String s = "";
	    int len = cadena.length();
	    for(int x = 0; x < len; x++){
	        char c = (char)(cadena.charAt(x) + shift);
	        if (c > 'z')
	            s += (char)(cadena.charAt(x) - (26-shift));
	        else
	            s += (char)(cadena.charAt(x) + shift);
	    }
	    return s;
	}

	@Override
	public String decodificar(String cadena) {
		String s = "";
	    int len = cadena.length();
	    for(int x = 0; x < len; x++){
	        char c = (char)(cadena.charAt(x) - shift);
	        if (c > 'z')
	            s += (char)(cadena.charAt(x) - (26+shift));
	        else
	            s += (char)(cadena.charAt(x) - shift);
	    }
	    return s;
	}


}
