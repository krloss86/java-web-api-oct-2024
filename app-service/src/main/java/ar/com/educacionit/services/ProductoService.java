package ar.com.educacionit.services;
import ar.com.educacionit.repository.dtos.ProductoDTO;

public interface ProductoService {

	public ProductoDTO getById(Long id);
}
