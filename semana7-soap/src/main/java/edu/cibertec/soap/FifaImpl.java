package edu.cibertec.soap;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

import edu.cibertec.bean.JugadordDTO;

@SuppressWarnings("restriction")
@WebService(endpointInterface="edu.cibertec.soap.Fifa", serviceName="fifaAPI" )
public class FifaImpl implements Fifa{

	public String bienvenidaPais(String nombrePais) {
		System.out.println("pais: "+nombrePais);
		return "Bienvenido Perú al Mundial Russia 2018!";
	}

	public JugadordDTO obtenerCapitan(String nombrePais) {
		System.out.println("pais: "+nombrePais);
		JugadordDTO obj = new JugadordDTO();
		obj.setNombre("PAOLO GUERRERO");
		obj.setPosicion("DELANTERO");
		
		return obj;
	}

	public String obtenerEntrenador(String nombrePais) {
		System.out.println("pais: "+nombrePais);
		return "RICARDO GARECA";
	}

	public String obtenerGrupo(String nombrePais) {
		System.out.println("pais: "+nombrePais);
		return "GRUPO C";
	}

	public List<JugadordDTO> obtenerListaConvocados(String nombrePais) {
		System.out.println("pais: "+nombrePais);
	List<JugadordDTO> lst = new ArrayList<JugadordDTO>();
	
	JugadordDTO jugador1 = new JugadordDTO("JEFFERSON FARFAN", "DELANTERO");
	JugadordDTO jugador2 = new JugadordDTO("PEDRO GALLESE", "ARQUERO");
	JugadordDTO jugador3= new JugadordDTO("CRISTIAN CUEVA", "MEDIO CAMPISTA");
	
	
	
	lst.add(jugador1);
	lst.add(jugador2);
	lst.add(jugador3);
		
		return lst;
	}

}
