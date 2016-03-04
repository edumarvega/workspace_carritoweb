<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="/pages/template/taglibs.jsp" %>
<s:url action="producto_agregarAlCarrito" namespace="/" var="agregarAlCarrito" />
<s:url action="producto_eliminarDelCarrito" namespace="/" var="eliminarDelCarrito" />
<s:url action="producto_vaciarCarrito" namespace="/" var="vaciarCarrito" />
<s:url action="producto_search" namespace="/" var="search" />
<s:url action="pedido_loadPedido" namespace="/" var="loadPedido" />

<!DOCTYPE html>
<html lang="es">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><decorator:title default="Carrito Web"/></title>
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

		.texto-total{
			font-size: 20px;
		}
		
		.carritoGrillaScroll{
			height: 240px !important;
    		overflow-y: scroll;
    		overflow-x: hidden;
		}
		.categoriaScroll{
			height: 360px !important;
    		overflow-y: scroll;
    		overflow-x: hidden;
		}
		
		.texto-captcha{
			font-family: 'Bitter', serif;
			font-size: 25px;
		}
		.error-captcha{
			color:#FF0000 ;
		}
		
		.loginRegistrarse{
    		background-color: #2492b3;
		}
		
		.texto-footer{
    		color:#115773; 
			font-size: 12px; 
			font-weight:bold;
		}
		.texto-user-session{
			color:#FFFFFF; 
			font-size: 12px;  
		}
		
	</style>
	<decorator:head></decorator:head>
	<script type="text/javascript">
  		
		$(document).ready(function(){
			
			changeLinksPagination('resultado','filterForm');
			
			$('.categoria').css('cursor', 'pointer');
						
									
  			var optionsFilter = { 
  				    target:     '#resultado', 
  				    url:        '${search}', 
  				 	beforeSerialize: function($form, options) { 
  				 		$('#idCategoria').val('');
  				        return true;                  
  					},
  				    beforeSubmit:  function(){
  				    	$(".displayTable").block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
  					},
  				    success:    function(){ 
  						changeLinksPagination('resultado','filterForm');
  				    } 
  			};
  	  		
  			$('#filterForm').submit(function() {
  	  	        $(this).ajaxSubmit(optionsFilter);
  	  	        return false;
  	  	    });
  		
  		});
  		
  		function agregarAlCarrito(id){
  			var cantidad = $('.cantidad'+id).val();
  			if(cantidad.length>0){
  				var url = '${agregarAlCarrito}?id='+id+'&cantidad='+cantidad;
  				$.ajax({
  	  				url:  url,
  	  				cache: false,
  	  				type:  'get',
  	  				beforeSend: function () {
  	  					$("#itemsCarrito").block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
  	  				},
  	  				success:  function (response) {
  	  					$("#itemsCarrito").html(response);
  	  					$("#itemsCarrito").unblock();
  	  					$('.quitar').css('cursor', 'pointer');
  	  					$('.vaciarCarrito').css('cursor', 'pointer');
  	  				}
  	  		    });	
  			}
  			else{
  				showMsgError('Debe ingresar una cantidad.');
  			}
  			
  			
  		}
  		
  		function eliminar(index){
  			
  			var url = '${eliminarDelCarrito}?index='+index;
  			$.ajax({
  				url:  url,
  				cache: false,
  				type:  'get',
  				beforeSend: function () {
  					$("#itemsCarrito").block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
  				},
  				success:  function (response) {
  					$("#itemsCarrito").html(response);
  					$("#itemsCarrito").unblock();
  					$('.quitar').css('cursor', 'pointer');
  					$('.vaciarCarrito').css('cursor', 'pointer');
  				}
  		    });
  		}
  		
  		function cargarCategoria(id){
  			
  			var url = '${search}?idCategoria='+id;
  			$.ajax({
  				url:  url,
  				cache: false,
  				type:  'get',
  				beforeSend: function () {
  					$("#resultado").block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
  				},
  				success:  function (response) {
  					$("#resultado").html(response);
  					$("#resultado").unblock();
  					$('#idCategoria').val(id);
  		  			changeLinksPagination('resultado','filterForm');
  				}
  		    });
  			
  		}
  		
  		function vaciarCarrito(){
  			$.ajax({
  				url:  '${vaciarCarrito}',
  				cache: false,
  				type:  'get',
  				beforeSend: function () {
  					$("#itemsCarrito").block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
  				},
  				success:  function (response) {
  					$("#itemsCarrito").html(response);
  					$("#itemsCarrito").unblock();
  				}
  		    });
  		}
  		
  		var divPedido;
  	  	function showModalPedido(){
  	  		divPedido = $("#divPedido").dialog({
  				   title: 'Ingreso de datos del pedido',
  				   modal: true,
  				   width: 600,
  				   height: 580,
  				   position: 'center',
  				   hide: "scale",
  				   resizable: 'false'
  				}).load('${loadPedido}',function(){
  						$(this).unblock();
  		  			}).block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
  	  	}
  	  	
  	  	var divComprobante;
  	  	function showModalComprobante(){
  	  		divComprobante =$("#divComprobante").dialog({
				   title: 'Comprobante del pedido',
				   modal: true,
				   width: 500,
				   height: 420,
				   position: 'center',
				   hide: "scale",
				   resizable: 'false',
				   beforeClose: function(event, ui) { 
					   
					   $.ajax({
			  				url:  '${vaciarCarrito}',
			  				cache: false,
			  				type:  'get',
			  				beforeSend: function () {
			  					$("#itemsCarrito").block({ message: '<h5><img src="${appCtx}/images/loading.gif"/> Procesando...</h5>' });
			  				},
			  				success:  function (response) {
			  					$("#itemsCarrito").html(response);
			  					$("#itemsCarrito").unblock();
			  					 divComprobante.dialog('close');
			  				}
			  		    });
					  
	         	   },
	         	   buttons: {
				   		"Imprimir": function () {
							$("#divPrint").printArea();
					 	}
				   }
				});
	    }
  	  	
  	  	  		
  		
  	</script>
</head>
<body>
	<%@ include file="/pages/header.jsp"%>
	<%@ include file="/pages/body.jsp"%>
	<%@ include file="/pages/footer.jsp"%>	
	<div id="divPedido" style="display: none;"></div>
	<div id="divComprobante" style="display: none;"></div>
	<%@ include file="/pages/template/dialogs.jsp"%>	
    
</body>
</html>