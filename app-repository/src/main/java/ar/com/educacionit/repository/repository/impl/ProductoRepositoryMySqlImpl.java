package ar.com.educacionit.repository.repository.impl;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.repository.repository.ProductoRepository;

public class ProductoRepositoryMySqlImpl implements ProductoRepository {

	//implementar todos los metodos de la interface
	
	@Override
	public void save(ProductoDTO entity) {
		// TODO Auto-generated method stub		
	}

	@Override
	public ProductoDTO getById(Long id) {
		//harcode
		String sql = "SELECT * from producto where id="+id;
		System.out.println(sql);
		
		//simulo que obtengo los datos de la db
		Long _id = id;
		String titulo = "producto smuilado desde la db";
		Double precio = 1500.75d;
		
		//instancia mi ProdutoDTO
		return new ProductoDTO(_id, titulo, precio);
	}

	@Override
	public ProductoDTO update(ProductoDTO entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoDTO delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
