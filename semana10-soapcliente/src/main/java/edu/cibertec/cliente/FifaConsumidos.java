package edu.cibertec.cliente;

import java.net.URL;
//
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import edu.cibertec.soap.Fifa;

public class FifaConsumidos {
	public static void main(String[] args) {
		try {

			URL url = new URL("http://localhost:9999/ws/fifa");
			//targetNamespace="http://soap.cibertec.edu/" name="fifaAPI"
			QName qname = new QName("http://soap.cibertec.edu/", "fifaAPI");
			Service service =   Service.create(url,qname);
			Fifa serviciosFifa = service.getPort(Fifa.class);
			String peru ="PERU";
			System.out.println("--probando servicios--");
			System.out.println("Servicio 1"+serviciosFifa.bienvenidaPais(peru));
			System.out.println("Entrenador Peru"+serviciosFifa.obtenerEntrenador(peru));
			System.out.println("Grupo Peru  mundial 2018: "+serviciosFifa.obtenerGrupo(peru));
			
			
			System.out.println("Nombre capitan: "+serviciosFifa.obtenerCapitan(peru).getNombre());
			System.out.println("Grupo Peru  mundial 2018: "+serviciosFifa.obtenerCapitan(peru).getPosicion());
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}
}
