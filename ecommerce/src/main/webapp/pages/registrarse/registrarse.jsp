<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/pages/template/taglibs.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Registrarse-E-commerce</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <%@ include file="/pages/template/common-header.jsp" %>
	<style type="text/css">
		header{
    		background-color: #5bc0de;
		}
		
		.texto-titulo{
			color:#2aabd2; 
			font-size: 17px; 
			font-weight:bold;
		}

		
		
	</style>
	<script type="text/javascript">
  		$(document).ready(function(){
  			
  		});
  	</script>
</head>

<body>
	
	<header>
		<img src="img/logomym.png" alt="logo" class="img-responsive">
        
    </header>

         <section>
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-lg-12">
                        <h3><strong>Registrarse - Mis datos</strong></h3>
                    </div>
                </div>
                <br>
                <div class="row">
                    <s:form action="registrarse_save.do" theme="simple"  cssClass="form-horizontal" role="form">
                    	<s:hidden id="idUsuario" name="usuarioEcommerce.id" value=""/>
                        <div class="form-group">
                            <label for="apellido" class="col-md-4 col-lg-4 control-label">Apellido:</label>
                            <div class="col-md-3 col-lg-3">
                                <input type="text" class="form-control" id="apellido" name="usuarioEcommerce.apellido"  value="" autofocus required>
                            </div>
                        </div>
            
                        <div class="form-group">
                            <label for="nombres" class="col-md-4 col-lg-4 control-label">Nombres:</label>
                            <div class="col-md-4 col-lg-4">
                                <input type="text" class="form-control" id="nombres" name="usuarioEcommerce.nombres" value="" required>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="dni" class="col-md-4 col-lg-4 control-label">Dni:</label>
                            <div class="col-md-2 col-lg-2">
                                <input type="text" class="form-control" id="dni" name="usuarioEcommerce.dni" value="" required>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="direccion" class="col-md-4 col-lg-4 control-label">Dirección:</label>
                            <div class="col-md-3 col-lg-3">
                                <input type="text" class="form-control" id="direccion"  name="usuarioEcommerce.direccion" value="" required>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="telefono" class="col-md-4 col-lg-4 control-label">Télefono:</label>
                            <div class="col-md-3 col-lg-3">
                                <input type="text" class="form-control" id="telefono"  name="usuarioEcommerce.telefono" value="" required>
                            </div>
                        </div>
                        
                       
                        <div class="form-group">
                            <label for="email" class="col-md-4 col-lg-4 control-label">Email:</label>
                            <div class="col-md-3 col-lg-3">
                                <input type="email" class="form-control" id="email"  name="usuarioEcommerce.email" value="" required>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="usuario" class="col-md-4 col-lg-4 control-label">Usuario:</label>
                            <div class="col-md-3 col-lg-3">
                                <input type="text" class="form-control" id="usuario"  name="usuarioEcommerce.usuario" value="" required>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="password" class="col-md-4 col-lg-4 control-label">Contraseña:</label>
                            <div class="col-md-3 col-lg-3">
                                <input type="text" class="form-control" id="password"  name="usuarioEcommerce.password" value="" required>
                            </div>
                        </div>
                        
                                               
                        <div class="form-group">
                            <label for="button" class="col-md-4 col-lg-4 control-label"></label>
                            <div class="col-md-4 col-lg-4">
                                <button type="submit" class="btn btn-info">Crear mi cuenta</button>
                            </div>
                        </div>  

                    </s:form>
                </div>
            </div>
        </section>
        
        <footer>
            <p class="text-center">Desarrollado por www.templateit.com.ar</p>
        </footer>
	    
</body>
</html>