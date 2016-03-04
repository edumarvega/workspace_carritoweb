package ar.com.templateit.ecommerce.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import ar.com.templateit.cds.web.service.UsuarioEcommerce;
import ar.com.templateit.cds.web.service.UsuarioEcommerceService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegistrarseAction extends ActionSupport{

	private static final long serialVersionUID = 2043223864854303676L;
	private UsuarioEcommerce usuarioEcommerce;
	private UsuarioEcommerceService usuarioEcommerceServiceSoap;

	public String loadRegistrarse() {
		
		this.usuarioEcommerce = new UsuarioEcommerce();
		this.usuarioEcommerce.setApellido("");
		this.usuarioEcommerce.setNombres("");
		this.usuarioEcommerce.setEmail("");
		this.usuarioEcommerce.setDni(new Long(0L));
		this.usuarioEcommerce.setUsuario("");
		this.usuarioEcommerce.setPassword("");
		
		return "loadRegistrarse";
	}
	
	public String save() {
		//TODO:guardar el usuario en la session y ver la cockie
		HttpServletResponse response = ServletActionContext.getResponse();
				
		this.usuarioEcommerceServiceSoap.save(this.getUsuarioEcommerce());
		
		Cookie cookie = new Cookie("userecommerce", this.getUsuarioEcommerce().getUsuario());
		cookie.setMaxAge(60*30);
		
		response.addCookie(cookie);
		ActionContext.getContext().getSession().put("userecommerce", this.getUsuarioEcommerce().getUsuario());
		
		
		return "home";
		

	}
	


	public UsuarioEcommerce getUsuarioEcommerce() {
		return usuarioEcommerce;
	}


	public void setUsuarioEcommerce(UsuarioEcommerce usuarioEcommerce) {
		this.usuarioEcommerce = usuarioEcommerce;
	}

	public void setUsuarioEcommerceServiceSoap(
			UsuarioEcommerceService usuarioEcommerceServiceSoap) {
		this.usuarioEcommerceServiceSoap = usuarioEcommerceServiceSoap;
	}

			
	
	
	
}
