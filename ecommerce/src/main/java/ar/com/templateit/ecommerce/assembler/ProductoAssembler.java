package ar.com.templateit.ecommerce.assembler;

import ar.com.templateit.cds.web.service.Producto;
import ar.com.templateit.ecommerce.dto.CategoriaDTO;
import ar.com.templateit.ecommerce.dto.ProductoDTO;


public class ProductoAssembler {
	
	public ProductoAssembler(){
		
	}
	
	public ProductoDTO getData(Producto producto,CategoriaDTO categoriaDTO,String pathImage){
		ProductoDTO productoDTO = new ProductoDTO();
		
		productoDTO.setId(producto.getId());
		
		if(producto.getDescripcion()!=null){
			productoDTO.setDescripcion(producto.getDescripcion());
		}
		else{
			productoDTO.setDescripcion("");
		}
		   
		productoDTO.setPrecio(producto.getPrecio());
		productoDTO.setCategoria(categoriaDTO);
		productoDTO.setPathImage(pathImage);
		
		return productoDTO;
	}

}
