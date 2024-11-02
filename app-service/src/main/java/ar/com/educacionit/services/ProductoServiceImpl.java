package ar.com.educacionit.services;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.repository.repository.ProductoRepository;
import ar.com.educacionit.repository.repository.impl.ProductoRepositoryMySqlImpl;

public class ProductoServiceImpl implements ProductoService{
	//implemento los metodos de la interface
	//ctrl+space
	
	//atributo de tipo interface: ProductoRepository 
	private ProductoRepository repository;
	
	public ProductoServiceImpl() {
		inyectarClases();
	}
	
	private void inyectarClases() {
		/*if(true) {
			//corto si hay errores
		}*/
		this.repository = new ProductoRepositoryMySqlImpl();		
	}
	
	@Override
	public ProductoDTO getById(Long id) {
		//ahora si, accedo a la base por medio de el repository
		return this.repository.getById(id);
	}
}
