package com.meltsan.backEnd.persona.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.meltsan.backEnd.vo.PaisVo;
import com.meltsan.backEnd.vo.PersonaVo;

@Service
public class PersonaServiceImpl implements PersonaService{
	public List<PersonaVo> getAllPersonas(){
		List<PersonaVo> persona= new ArrayList<PersonaVo>();
		persona.add(new PersonaVo("cristian","luna",20));
		persona.add(new PersonaVo("cristian","luna",20));
		persona.add(new PersonaVo("cristian","luna",20));
		persona.add(new PersonaVo("cristian","luna",20));
		persona.add(new PersonaVo("cristian","luna",20));
		persona.add(new PersonaVo("cristian","luna",20));
		persona.add(new PersonaVo("cristian","luna",20));
		return persona;
	}
	
	public List<PaisVo> getPais(){
		List<PaisVo> pais=new ArrayList<PaisVo>();
		pais.add(new PaisVo("Oaxaca",getAllPersonas()));
		pais.add(new PaisVo("Chiapas",getAllPersonas()));
		return pais;
	}
}
