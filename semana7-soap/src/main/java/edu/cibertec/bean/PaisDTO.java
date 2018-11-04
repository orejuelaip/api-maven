package edu.cibertec.bean;

import java.io.Serializable;
import java.util.List;

public class PaisDTO implements Serializable{
	
	private String nombre;
	private String grupo;
	private String capitan;
	private List<JugadordDTO> lstJugadores;
	
	
	public PaisDTO(String nombre, String grupo, String capitan, List<JugadordDTO> lstJugadores) {
		super();
		this.nombre = nombre;
		this.grupo = grupo;
		this.capitan = capitan;
		this.lstJugadores = lstJugadores;
	}
	
	public PaisDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getCapitan() {
		return capitan;
	}

	public void setCapitan(String capitan) {
		this.capitan = capitan;
	}

	public List<JugadordDTO> getLstJugadores() {
		return lstJugadores;
	}

	public void setLstJugadores(List<JugadordDTO> lstJugadores) {
		this.lstJugadores = lstJugadores;
	}
	
	
	
	
	

}
