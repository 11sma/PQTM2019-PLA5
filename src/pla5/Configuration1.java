package pla5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration1 {
	
	@Bean
	public IProcesar palabras() {
		return new Palabras();
	}
	
	@Bean
	public ICodificar invertir() {
		return new Invertir();
	}
	
	@Bean
	public Codificador codificador() {
		return new Codificador(palabras(), invertir());
	}
}
