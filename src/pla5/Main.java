package pla5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("pla5")
public class Main {

	public static void main(String[] args) {
		
		String mensaje = "Hola! Que tal!";
		
		AnnotationConfigApplicationContext context1 = 
				new AnnotationConfigApplicationContext(Configuration1.class);
		
		Codificador codificador1 = context1.getBean("codificador", Codificador.class);
		
		System.out.println(codificador1.codificar(mensaje));
		System.out.println(codificador1.decodificar(codificador1.codificar(mensaje)));
		
		context1.close();
		
		
		AnnotationConfigApplicationContext context2 = 
				new AnnotationConfigApplicationContext(Configuration2.class);
		
		Codificador codificador2 = context2.getBean("codificador", Codificador.class);
		
		System.out.println(codificador2.codificar(mensaje));
		System.out.println(codificador2.decodificar(codificador2.codificar(mensaje)));
		
		context2.close();

	}

}
