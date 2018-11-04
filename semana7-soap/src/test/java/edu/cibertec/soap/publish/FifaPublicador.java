package edu.cibertec.soap.publish;

import edu.cibertec.soap.FifaImpl;

import javax.xml.ws.Endpoint;

public class FifaPublicador {
	

	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:9999/ws/fifa", new FifaImpl());
		 
		 
		 
	}

}
