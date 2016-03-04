<%@ include file="/pages/template/taglibs.jsp" %>	        
<s:url action="login_loadLogin.do" var="loadLogin" namespace="/" />
<s:url action="registrarse_loadRegistrarse.do" var="loadRegistrarse" namespace="/" />
		<section id="loginRegistrarse" class="loginRegistrarse">
			<br>
			<div class="col-md-2 col-lg-2">
            </div>
            <div class="col-md-2 col-lg-2">
            </div>
            <div class="col-md-2 col-lg-2">
            </div>
            <div class="col-md-2 col-lg-2">
            </div>
            <div class="col-md-2 col-lg-2">
            	<s:if test="#session.userecommerce == null">
					<a href="<s:property value="loadRegistrarse"/>"><img src="img/registrarse.png" alt="logo" class="img-responsive pull-right"></a>
				</s:if>
				<s:else>
    				<img src="img/user01.png" alt="usuario" height="60" width="60" class="img-responsive pull-right">
				</s:else>
            </div>
            <div class="col-md-2 col-lg-2">
           		<s:if test="#session.userecommerce == null">
					<a href="<s:property value="loadLogin"/>"><img src="img/ingresar.png" alt="logo" class="img-responsive center-block"></a>
				</s:if>
				<s:else>
					<br>
    				<p class="text-left texto-user-session"><strong>Bienvenido:&nbsp;&nbsp;<s:property value="#session.userecommerce" /></strong></p>
				</s:else>	
            </div>
			<br><br><br>
		</section>
        <section id="contenido"><br><br>
            <div class="container">
                <div id="buscador" class="row">
                    <div class="col-md-3 col-lg-3">
                    </div>
                    <div class="col-md-6 col-lg-6">
                        <form id="filterForm" action="producto_search" class="form-inline"  role="form">
                        	<s:hidden id="idCategoria" name="idCategoria" value=""/>
                            <div class="row">
                                <div class="form-group">
                                    <input type="text" id="descripcion" class="form-control input-md" name="descripcion" placeholder="Buscar"  size="50" autofocus>
                                </div>
            
                                <div class="form-group">
                                    <button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-search"></span>&nbsp;Buscar</button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="col-md-3 col-lg-3">
                    </div>
                    
                </div><br>
                
                <div id="data" class="row">
                	<hr>
                    <div class="col-md-2 col-lg-2">
                        <span class="texto-titulo">Categorķas</span>
                        <br><br>
                        <!--<a href="#">Notebook <span class="badge">12</span></a><br>
                        <a href="#">Tablet <span class="badge">12</span></a><br>
                        <a href="#">Celulares <span class="badge">10</span></a><br>
                        <a href="#">Pendrive <span class="badge">20</span></a><br> -->
                        <s:if test="%{categoriasDTO!=null}">
                        	<s:if test="%{categoriasDTO.size>19}">
                        		<div class="categoriaScroll">
    								<s:iterator value="categoriasDTO">
										<a onclick="cargarCategoria(<s:property value="id"/>);return false;" class="categoria"><s:property value="descripcion"/></a><br>                 
       								</s:iterator>
       							</div>		
       						</s:if>	
       						<s:else>
       							<s:iterator value="categoriasDTO">
									<a onclick="cargarCategoria(<s:property value="id"/>);return false;" class="categoria"><s:property value="descripcion"/></a><br>                 
       							</s:iterator>
							</s:else>
       					</s:if>	
       					
                    </div>
                    <div class="col-md-6 col-lg-6">
                        <span class="texto-titulo">Resultado</span><br><br>
                        <!--<div id="resultado">
                        	<table id="tableProductos" class="table table-striped table-condensed">
                            	<tbody>
                                	<tr>      
                                    	<td><img src="img/hp.png" width="140px" height="100px"></td>
                                    	<td><p>Notebook HP</p>
                                        	<p>I5 core</p>
                                        	<p>$23.000</p></td>
                                	</tr>
                                	<tr>      
                                    	<td colspan="2"><button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-shopping-cart"></span>&nbsp;Agregar</button></td>
                                	</tr>
                                	<tr>      
                                    	<td><img src="img/macbook.jpg" width="140px" height="100px"></td>
                                    	<td><p>Macbook Pro</p>
                                        	<p>I5 core</p>
                                        	<p>$33.000</p></td>
                                	</tr>
                                	<tr>      
                                    	<td colspan="2"><button type="submit" class="btn btn-info"><span class="glyphicon glyphicon-shopping-cart"></span>&nbsp;Agregar</button></td>
                                	</tr>
                            	</tbody>
                        	</table>
                    	</div>-->
                    	<div id="resultado">
							<%@ include file="/pages/ajax/producto/resultadoProductos.jsp"%>
						</div>    
                    </div>
                    <div class="col-md-4 col-lg-4">
                        <div class="row">
                            <div class="col-md-12 col-lg-12">
                                <span class="texto-titulo">Tu pedido:</span>
                                <img src="img/carrito.png" alt="carrito" class="img-responsive center-block" width="80px" height="80px">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12 col-lg-12">
                            
                            	<!--<div class="carritoGrillaScroll">
                                	<table id="tableProductos" class="table table-striped table-condensed">
                                    	<thead>
                                        	<tr>
                                            	<th>Cant.</th>
                                            	<th>Nombre</th>
                                            	<th>Descripcion</th>
                                            	<th>Precio</th>
                                            	<th></th>
                                        	</tr>
                                    	</thead>
                                     	<tbody>
                                        	<tr>      
                                            	<td>1</td>
                                            	<td>Notebook</td>
                                            	<td>13" i5 core</td>
                                            	<td>$23.000</td>
                                            	<td><a>[Quitar]</a></td>                 
                                        	</tr>
                                        	<tr>      
                                            	<td>1</td>
                                            	<td>Notebook</td>
                                            	<td>11" HP</td>
                                            	<td>$33.000</td>
                                            	<td><a>[Quitar]</a></td>                 
                                        	</tr>
                                    	</tbody>
                                	</table>
                                </div> -->
                                
                                <div id="itemsCarrito" class="form-group">
  									<%@ include file="/pages/ajax/producto/grillaCarrito.jsp"%>
    							</div>
                              
                            </div>
                        </div>
                    </div>
                </div>
                
            </div>
            
        </section>
                