package ar.com.educacionit.repository.repository.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.hibernate.HibernateUtils;
import ar.com.educacionit.repository.dtos.ProductoDTO;
import ar.com.educacionit.repository.exceptions.DBConnectionException;
import ar.com.educacionit.repository.repository.ProductoRepository;

public class ProductoRepositoryMySqlImpl implements ProductoRepository {

	//implementar todos los metodos de la interface
	private SessionFactory factory;
	
	public ProductoRepositoryMySqlImpl() {
		this.factory = HibernateUtils.getSessionFactory();//recien aca se crea la conexion(y todo lo necesario) a la base
	}
	
	@Override
	public void save(ProductoDTO entity) {
		// TODO Auto-generated method stub		
	}

	@Override
	public ProductoDTO getById(Long id) {
		//usar hibernate para consultar a la db y que nos retorne un objeto Producto
		Session session = null;
		try {
			session = factory.getCurrentSession();
			session.beginTransaction();
			Producto producto = session.get(Producto.class, id);
			
			return new ProductoDTO(producto.getId(),producto.getTitulo(),producto.getPrecio());
		}catch(HibernateException e) {
			// session.getTransaction().rollback();
			throw new DBConnectionException(e.getMessage(),e.getCause());
		}finally {
			// session.getTransaction().commit();
			session.close();
		}
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
