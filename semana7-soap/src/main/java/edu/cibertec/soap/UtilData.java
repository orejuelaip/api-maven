package edu.cibertec.soap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.cibertec.bean.JugadordDTO;
import edu.cibertec.bean.PaisDTO;

public class UtilData {
	
	Map<String, PaisDTO> data_pais;
	
	public UtilData() {
		data_pais = new HashMap<String, PaisDTO>();
	}
	
	void cargarData(){

		
		JugadordDTO jugadorPeru1 = new JugadordDTO("Paolo Guerrero", "Delantero");
		JugadordDTO jugadorPeru2 = new JugadordDTO("Pedro Gallese", "Arquero");
		JugadordDTO jugadorPeru3 = new JugadordDTO("Cuevita", "Medio Campista");
		
		List<JugadordDTO> lstPeru = new ArrayList<JugadordDTO>();
		lstPeru.add(jugadorPeru1);
		lstPeru.add(jugadorPeru2);
		lstPeru.add(jugadorPeru3);
		
		PaisDTO peru = new PaisDTO("PERÚ","GRUPO C", "Ricardo Gereca",lstPeru);
		
		JugadordDTO jugadorArgentina1 = new JugadordDTO("Lionel Messi", "Delantero");
		JugadordDTO jugadorArgentina2 = new JugadordDTO("Sergio Romero", "Arquero");
		JugadordDTO jugadorArgentina3 = new JugadordDTO("Javier Mascherano", "Medio Campista");
		
		List<JugadordDTO> lstArgentina= new ArrayList<JugadordDTO>();
		lstArgentina.add(jugadorArgentina1);
		lstArgentina.add(jugadorArgentina2);
		lstArgentina.add(jugadorArgentina3);
		
		PaisDTO argentina = new PaisDTO("ARGENTINA","GRUPO D", "JORGE SAMPAOLI",lstArgentina);

		JugadordDTO jugadorColombia1 = new JugadordDTO("Radamel Falcao", "Delantero");
		JugadordDTO jugadorColombia2 = new JugadordDTO("David Ospina", "Arquero");
		JugadordDTO jugadorColombia3 = new JugadordDTO("James Rodriguez", "Medio Campista");
		
		List<JugadordDTO> lstColombia= new ArrayList<JugadordDTO>();
		lstColombia.add(jugadorColombia1);
		lstColombia.add(jugadorColombia2);
		lstColombia.add(jugadorColombia3);
		
		PaisDTO colombia = new PaisDTO("COLOMBIA","GRUPO H", "NESTOR PEKERMAN",lstColombia);
		
		JugadordDTO jugadorBrasil1 = new JugadordDTO("Neymar JR", "Delantero");
		JugadordDTO jugadorBrasil2 = new JugadordDTO("Alisson", "Arquero");
		JugadordDTO jugadorBrasil3 = new JugadordDTO("Casemiro", "Medio Campista");
		
		List<JugadordDTO> lstBrasil= new ArrayList<JugadordDTO>();
		lstBrasil.add(jugadorBrasil1);
		lstBrasil.add(jugadorBrasil2);
		lstBrasil.add(jugadorBrasil3);
		
		PaisDTO brasil = new PaisDTO("BRASIL","GRUPO E", "TITE",lstBrasil);

		
		
		
		data_pais.put("PERU", peru);
		data_pais.put("ARGENTINA", argentina);
		data_pais.put("COLOMBIA", colombia);
		data_pais.put("BRASIL", brasil);
	}
	
	PaisDTO getPais(String nombrePais) {
		PaisDTO pais = data_pais.get(nombrePais);
		return pais;
	}
	

}
