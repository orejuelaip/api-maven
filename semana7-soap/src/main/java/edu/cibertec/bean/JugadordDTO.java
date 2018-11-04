package edu.cibertec.bean;

import java.io.Serializable;

public class JugadordDTO implements Serializable {
	
	private String nombre;
	private String posicion;
	
	
	public JugadordDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public JugadordDTO(String nombre, String posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
	}

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
	
}
