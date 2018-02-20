package cmc.formacion.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import cmc.formacion.springcore.model.Persona;
import cmc.formacion.springcore.servicio.PersonaServicio;

@ComponentScan
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		Persona maria = context.getBean(Persona.class);
		Persona pedro = (Persona) context.getBean("pedro");
		Persona julia = (Persona) context.getBean("tercernombre");
		System.out.println(maria.getNombre()+"\n"+pedro.getNombre()+"\n"+julia.getNombre());

		PersonaServicio personaServicio = context.getBean(PersonaServicio.class);
		
		System.out.println(personaServicio.getpersonaAutowiredByConstructor().getNombre());
		System.out.println(personaServicio.getPersonaAutowiredByField().getNombre());
		System.out.println(personaServicio.getPersonaAutowiredBySetter().getNombre());
	}
}
