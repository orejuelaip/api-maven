package edu.cibertec.dto;

public class JugadorDTO {
	private String nombre, posicion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}	
	
	public JugadorDTO() {
		
	}

	public JugadorDTO(String nombre, String posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
	}	
}
