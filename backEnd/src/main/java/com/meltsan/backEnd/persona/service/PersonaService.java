package com.meltsan.backEnd.persona.service;

import java.util.List;

import com.meltsan.backEnd.vo.PersonaVo;
import com.meltsan.backEnd.vo.PaisVo;

public interface PersonaService {
	List<PersonaVo> getAllPersonas();
	List<PaisVo> getPais();
}
