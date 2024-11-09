package ar.com.educacionit.websoap.main;

import ar.com.educacionit.websoap.impl.ProductoeWsSoapServiceImpl;
import jakarta.xml.ws.Endpoint;

public class ProductoWSSoapMain {

	public static void main(String[] args) {
		System.out.println("Publicando Servicio Web de producto...");

		Endpoint.publish("http://localhost:8000/", new ProductoeWsSoapServiceImpl());
		
		System.out.println("Servicio Web de producto iniciado en http://localhost:8000/");
		
		System.out.println("La direccion del wsdl es: http://localhost:8000/?wsdl");
	}
}
