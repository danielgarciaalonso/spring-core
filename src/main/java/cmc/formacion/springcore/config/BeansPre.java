package cmc.formacion.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import cmc.formacion.springcore.model.Persona;

@Configuration
@Profile("pre")
public class BeansPre {

	@Bean
	@Primary
	public Persona maria() {
		return new Persona("maria");
	}
	
	@Bean
	public Persona pedro() {
		return new Persona("Pedro");
	}
	
	@Bean(name="tercernombre")
	public Persona julia() {
		return new Persona("Julia");
	}
}
