package pla5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration2 {

	@Bean
	public IProcesar palabras() {
		return new Palabras();
	}
	
	@Bean
	public ICodificar cesar() {
		return new Cesar();
	}

	@Bean
	public Codificador codificador() {
		return new Codificador(palabras(), cesar());
	}
}
