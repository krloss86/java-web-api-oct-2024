package ar.com.educacionit.websoap;

import ar.com.educacionit.repository.dtos.ProductoDTO;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface ProductoWsSoapService {

	//cada metood aca es un enpoint que vamos a poder consumir 
	@WebMethod
	public ProductoDTO getProdctoById(Long id); /*falta lanzar una exception*/ 
}
