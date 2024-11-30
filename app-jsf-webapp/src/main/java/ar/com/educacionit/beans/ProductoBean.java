package ar.com.educacionit.beans;

import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.ProductoServiceImpl;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class ProductoBean {

	//listado de productos
	private List<ProductoDTO> listado = new ArrayList<>();
	
	//nuestro servicio
	private ProductoService productoService = new ProductoServiceImpl();
	
	@PostConstruct	
	public void loadProductos() {		
		this.listado = this.productoService.findAll();
	}
	
	public List<ProductoDTO> findProductos() {
		return this.productoService.findAll();
	}

	public List<ProductoDTO> getListado() {
		return listado;
	}
	 
}
