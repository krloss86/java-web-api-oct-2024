package ar.com.educacionit.repository.dtos;

public class ProductoDTO {

	private Long id;
	private String titulo;
	private String codigo;
	private Double precio;
	
	public ProductoDTO() {
		
	}
	//mutable|inmutable?
	public ProductoDTO(
			Long id,
			String titulo,
			Double precio			
			) {
		
		setId(id);
		this.titulo = titulo;//¿hay control?
		this.precio = precio;
	}
	
	public void setId(Long id) {
		//guards
		if(id == null || id < 0) {
			throw new IllegalArgumentException("Id no puede ser nulo ni < 0");//runtime
		}
		//al final todo ok 
		
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "{id:" + id + ", titulo:" + titulo + ", precio:" + precio + "}";
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	//completar lo que falta
	//alt+shit+s
	
	
}
