package ar.com.educacionit.websoap.impl;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.services.ProductoService;
import ar.com.educacionit.services.ProductoServiceImpl;
import ar.com.educacionit.websoap.ProductoWsSoapService;
import jakarta.jws.WebService;

@WebService(endpointInterface = "ar.com.educacionit.websoap.ProductoWsSoapService")
public class ProductoeWsSoapServiceImpl implements ProductoWsSoapService{

	@Override
	public ProductoDTO getProdctoById(Long id) {		
		ProductoService service = new ProductoServiceImpl();
		return service.getById(id);
	}
}
