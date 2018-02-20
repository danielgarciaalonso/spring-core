package cmc.formacion.springcore.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cmc.formacion.springcore.model.Persona;

@Service
public class PersonaServImpl implements PersonaServicio {
	
	@Autowired
	Persona autowiredByField;
	
	Persona autowiredBySetter;
	
	Persona autowiredByConstructor;

	@Autowired
	public PersonaServImpl(@Qualifier("pedro") Persona autowiredByConstructor) {
		this.autowiredByConstructor = autowiredByConstructor;
	}
	
	public Persona getpersonaAutowiredByConstructor() {
		return this.autowiredByConstructor;
	}

	public Persona getPersonaAutowiredByField() {
		return this.autowiredByField;
	}

	public Persona getPersonaAutowiredBySetter() {
		return this.autowiredBySetter;
	}
	
	@Autowired
	@Qualifier("tercernombre") public void setAutowiredBySetter(Persona autowiredBySetter) {
		this.autowiredBySetter = autowiredBySetter;
	}

}
