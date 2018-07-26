package com.meltsan.backEnd.persona.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.meltsan.backEnd.vo.PersonaVo;

@Service
public class PersonaServiceImpl implements PersonaService{
	public List<PersonaVo> getAll(){
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
}
