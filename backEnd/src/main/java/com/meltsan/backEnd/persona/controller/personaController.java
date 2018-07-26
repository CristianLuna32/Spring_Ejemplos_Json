package com.meltsan.backEnd.persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meltsan.backEnd.persona.service.PersonaService;
import com.meltsan.backEnd.vo.PersonaVo;

@RestController
public class personaController {
	
	@Autowired
	private PersonaService personaService;
	
	@RequestMapping("/getPersonas")
	public List<PersonaVo> getPersonas(){
		return personaService.getAll();
	}
}
