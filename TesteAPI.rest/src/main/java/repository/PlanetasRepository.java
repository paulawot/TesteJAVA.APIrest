package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import datasource.model.Planetas;



public interface PlanetasRepository extends JpaRepository<Planetas, Long> {

}
