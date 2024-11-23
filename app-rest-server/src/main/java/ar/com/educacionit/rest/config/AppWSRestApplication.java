package ar.com.educacionit.rest.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class AppWSRestApplication extends ResourceConfig{

	public AppWSRestApplication() {
		//TODO- corregir cuando carga da clasNotFounddef
		// register(JacksonFeature.class);
		System.out.println("Se ha creado la configuracion");
	}
}
