package ar.com.educacionit.services;

import java.util.List;

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

	@Override
	public List<ProductoDTO> findAll() {
		return this.repository.findAll();
	}

	@Override
	public ProductoDTO create(ProductoDTO request) {		
		return this.repository.save(request);
	}

	@Override
	public ProductoDTO getByCodigo(String codigo) {
		return this.repository.getByCodigo(codigo);
	}

	@Override
	public void eliminar(Long id) {
		this.repository.delete(id);	
	}

	@Override
	public void actualizar(ProductoDTO productoActualizar) {
		this.repository.update(productoActualizar);		
	}
}
