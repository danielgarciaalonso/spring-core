package cmc.formacion.springcore.servicio;

import cmc.formacion.springcore.model.Persona;

public interface PersonaServicio {

	Persona getpersonaAutowiredByConstructor();
	
	Persona getPersonaAutowiredByField();
	
	Persona getPersonaAutowiredBySetter();
	
}
