package ar.com.templateit.ecommerce.assembler;



import ar.com.templateit.cds.web.service.Categoria;
import ar.com.templateit.ecommerce.dto.CategoriaDTO;

public class CategoriaAssembler {
	
	public CategoriaAssembler(){
		
	}
	
	public CategoriaDTO getData(Categoria categoria){
		CategoriaDTO categoriaDTO = new CategoriaDTO();
		
		categoriaDTO.setId(categoria.getId());
		
		if(categoria.getNombre()!=null){
			categoriaDTO.setDescripcion(categoria.getNombre());
		}
		else{
			categoriaDTO.setDescripcion("");
		}
				
		return categoriaDTO;
	}

}
