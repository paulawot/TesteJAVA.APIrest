package datasource.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="planetas")
public class Planetas implements Serializable {
	private static final long serialVersionUID = -647572661754758997L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String nome;
	private String clima;
	private String terreno;
	
	@Column(name = "aparicoes_em_filmes")
	private Long aparicoesemfilmes;
	
	
	
	public Planetas() {
	}
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public String getTerreno() {
		return terreno;
	}
	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}
	public Long getAparicoesemfilmes() {
		return aparicoesemfilmes;
	}
	public void setAparicoesemfilmes(Long aparicoesemfilmes) {
		this.aparicoesemfilmes = aparicoesemfilmes;
	}
	

}
