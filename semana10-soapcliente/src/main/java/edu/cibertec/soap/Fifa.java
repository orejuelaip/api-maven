package edu.cibertec.soap;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;

import edu.cibertec.dto.JugadorDTO;

@SuppressWarnings("restriction")
@WebService
public interface Fifa {
	
	//DECLARAMOS TODOS LOS SERVICIOS SOAP
	@WebMethod
	public String bienvenidaPais(String nombrePais);
	
	@WebMethod
	public String obtenerEntrenador(String nombrePais);
	
	@WebMethod
	public JugadorDTO obtenerCapitan(String nombrePais);
	
	@WebMethod
	public String obtenerGrupo(String nombrePais);
	
	@WebMethod
	public List<JugadorDTO> obtenerConvocados(String nombrePais);
}
