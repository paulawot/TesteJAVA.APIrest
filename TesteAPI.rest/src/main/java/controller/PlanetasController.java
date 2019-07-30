package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import datasource.model.Planetas;

import repository.PlanetasRepository;


@RestController
@RequestMapping(value = "/api")
public class PlanetasController {
	
	@Autowired
	private PlanetasRepository PlanetasRepository;
	
	@GetMapping(path = "/planetas")
	public List<Planetas> buscarPlanetas(){
		return PlanetasRepository.findAll();
	}
	
	@GetMapping(path = "/planetas/id/{id}")
	public Optional<Planetas> buscarPlanetasporId(@PathVariable (name = "id", required = true)Long id) {
		return PlanetasRepository.findById(id);
	}
	
	@GetMapping(path = "/planetas/nome/{id}")
	public List<Planetas> buscarPlanetasporNome(@PathVariable (name = "nome", required = true)String nome) {
		return PlanetasRepository.findAll();
	}
	
	@PostMapping(path = "planetas/save")
	public void salvarPlanetas(@RequestBody Planetas Planetas){
		PlanetasRepository.save(Planetas);
	}
	
	@PutMapping(path="planetas/put/{id}")
	public Optional<Planetas> update(@PathVariable (name = "id", required = true)Long id, @RequestBody Planetas planetas){
	   return PlanetasRepository.findById(id);
	}
	
	@DeleteMapping(path = "planetas/delete/{id}")
	public void deletePlanetas (@PathVariable(name = "id" , required = true)Long id) {
		PlanetasRepository.deleteById(id);
	}
}
