package com.meltsan.backEnd.vo;

import java.util.List;

public class PaisVo{
	private String ciudad;
	private List<PersonaVo> persona;
	
	

	public PaisVo(String ciudad, List<PersonaVo> persona) {
		super();
		this.ciudad = ciudad;
		this.persona = persona;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<PersonaVo> getPersona() {
		return persona;
	}

	public void setPersona(List<PersonaVo> persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "PaisVo [ciudad=" + ciudad + ", persona=" + persona + "]";
	}

	
	
}
