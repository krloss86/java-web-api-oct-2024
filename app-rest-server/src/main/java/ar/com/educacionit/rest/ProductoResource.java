package ar.com.educacionit.rest;

import java.util.List;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.ProductoServiceImpl;
import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("producto")
@Singleton
public class ProductoResource {

	//localhost:8080/app-rest-server/api/producto/1
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() {
		
		Long id = 1l;//obtener desde parametros//f6 linea por linea
		
		//1- service
		ProductoService productoService = new ProductoServiceImpl();//f5 entro al contructor // ServiceLocator.getService(PepeService.class);//??tph: crear una clase que creer una instancia 
		
		//find/get: find select * / select * where id=1
		ProductoDTO dto =  productoService.getById(id);
				
		return Response.ok(dto).build();//200
	}
}
