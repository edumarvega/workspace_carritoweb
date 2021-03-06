	<%@ include file="/pages/template/taglibs.jsp" %>
	<div class="displayTable">
		<display:table id="data" name="productosDTO" requestURI="/producto_search.do" pagesize="2" export="false" class="table table-striped table-condensed" excludedParams="*">
			<display:column  media="html">
				<img src="${data.pathImage}" height="100"  width="100" alt="Foto no disponible"/>
			</display:column>
			<display:column  media="html">
				<c:out value="${data.descripcion}"/><br>
				<c:out value="${data.categoria.descripcion}"/><br>
				<b>$<c:out value="${data.precio}"/></b><br>
				<input type="number" class="cantidad${data.id}" min="1" max="10000" step="1" value="1" size="4"/>&nbsp;<button type="button" class="btn btn-info" onclick="agregarAlCarrito(${data.id});return false;"><span class="glyphicon glyphicon-shopping-cart"></span>&nbsp;Agregar</button>
			</display:column>
		</display:table>
	</div>
