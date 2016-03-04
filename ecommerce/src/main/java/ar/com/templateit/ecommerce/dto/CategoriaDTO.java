package ar.com.templateit.ecommerce.dto;

import java.io.Serializable;
import java.util.List;

public class CategoriaDTO implements Serializable{

	private static final long serialVersionUID = 8776976815360574229L;
	private Long id;
	private String descripcion;
		
	public CategoriaDTO(){
		
	}
	
	public CategoriaDTO(Long id,String descripcion){
		this.id = id;
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
