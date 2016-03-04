package ar.com.templateit.ecommerce.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import ar.com.templateit.cds.web.service.UsuarioEcommerce;
import ar.com.templateit.cds.web.service.UsuarioEcommerceService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private static final long serialVersionUID = 2043223864854303676L;
	
	public static final String MENSAJE_ERROR = "Usuario o password incorrecto!!";
	private String usuario;
	private String password;
	private String error;
	private UsuarioEcommerceService usuarioEcommerceServiceSoap;

	public String loadLogin() {
		
		return "loadLogin";
	}
	
	public String validar(){
		
		HttpServletResponse response = ServletActionContext.getResponse();
				
		UsuarioEcommerce usuario = this.usuarioEcommerceServiceSoap.loadUsuarioEcommerce(this.usuario.trim(), this.password.trim());
		
		if(usuario!=null){
			Cookie cookie = new Cookie("userecommerce", usuario.getUsuario());
			cookie.setMaxAge(60*30);
			
			response.addCookie(cookie);
			ActionContext.getContext().getSession().put("userecommerce", usuario.getUsuario());
			
			return "home";
		}
		else{
			addActionError(MENSAJE_ERROR);
			this.setError(MENSAJE_ERROR);
			return "loadLogin";
		}
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsuarioEcommerceServiceSoap(
			UsuarioEcommerceService usuarioEcommerceServiceSoap) {
		this.usuarioEcommerceServiceSoap = usuarioEcommerceServiceSoap;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	
		
	
}
