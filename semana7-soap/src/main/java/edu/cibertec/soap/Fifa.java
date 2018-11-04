package edu.cibertec.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

import edu.cibertec.bean.JugadordDTO;

@SuppressWarnings("restriction")
@WebService
public interface Fifa {
	
	/*Futuros Servicios*/
	
	@WebMethod
	public String bienvenidaPais(String nombrePais);
	
	@WebMethod
	public String obtenerEntrenador(String nombrePais);
	
	@WebMethod
	public JugadordDTO obtenerCapitan(String nombrePais);
	
	@WebMethod
	public String obtenerGrupo(String nombrePais);
	
	@WebMethod
	public List<JugadordDTO> obtenerListaConvocados(String nombrePais);

}
