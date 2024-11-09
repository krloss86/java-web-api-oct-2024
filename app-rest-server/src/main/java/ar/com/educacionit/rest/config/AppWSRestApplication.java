package ar.com.educacionit.rest.config;

import org.glassfish.jersey.server.ResourceConfig;

public class AppWSRestApplication extends ResourceConfig{

	public AppWSRestApplication() {
		System.out.println("Se ha creado la configuracion");
	}
}
