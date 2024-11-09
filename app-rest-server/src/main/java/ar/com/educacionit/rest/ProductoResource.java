package ar.com.educacionit.rest;

import java.util.List;

import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("producto")
@Singleton
public class ProductoResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() {
		List<String> nombres = List.of("carlos","pepe");
		return Response.ok(nombres).build();//200
	}
}
