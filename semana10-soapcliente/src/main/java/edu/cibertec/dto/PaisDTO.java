package edu.cibertec.dto;

import java.io.Serializable;
import java.util.List;

public class PaisDTO implements Serializable{
	
	private String nombre, grupo, capitan;
	private List<JugadorDTO> lstJugador;
	
	public PaisDTO() {
			
	}
		
	public PaisDTO(String nombre, String grupo, String capitan, List<JugadorDTO> lstJugador) {		
		this.nombre = nombre;
		this.grupo = grupo;
		this.capitan = capitan;
		this.lstJugador = lstJugador;
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
	public List<JugadorDTO> getLstJugador() {
		return lstJugador;
	}
	public void setLstJugador(List<JugadorDTO> lstJugador) {
		this.lstJugador = lstJugador;
	}	
	
}
