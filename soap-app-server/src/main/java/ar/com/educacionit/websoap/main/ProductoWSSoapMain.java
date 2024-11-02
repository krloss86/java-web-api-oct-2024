package ar.com.educacionit.websoap.main;

import ar.com.educacionit.websoap.impl.ProductoeWsSoapServiceImpl;
import jakarta.xml.ws.Endpoint;

public class ProductoWSSoapMain {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8000/", new ProductoeWsSoapServiceImpl());
	}
}
