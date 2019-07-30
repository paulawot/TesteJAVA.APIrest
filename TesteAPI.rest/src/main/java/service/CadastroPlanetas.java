package service;

import org.springframework.beans.factory.annotation.Autowired;

import datasource.model.Planetas;

import repository.PlanetasRepository;



public class CadastroPlanetas {
	@Autowired
	private PlanetasRepository planetasRepository;
	public void cadastro(Planetas planetas) {
		planetasRepository.saveAndFlush(planetas);
	}

}

