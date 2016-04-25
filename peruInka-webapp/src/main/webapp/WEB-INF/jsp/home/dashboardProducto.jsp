<%@ page import="org.springframework.web.util.UrlPathHelper"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%--@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

Bienvenido a la cadena de hotel PeruInka

<br>
<a href="frmProducto">Nuevo Producto</a>
<br>
<display:table name="${listProducto}" id="item" class="table">
 	<display:column title="Codigo" property="id" /><br>
	<display:column title="Nombre" property="nombreProducto" /><br>
	<display:column title="Ape Paterno" property="precio" /><br>
	<display:column title="Ape Materno" property="descripcion" /><br>
	<display:column title="Tipo Documento" property="atributo" /><br>
	<display:column title="Nro Documento" property="tipoProducto"/><br>
	<display:column title="Estado" property="status" /><br>
	<display:column title="OPC">
		<a href="editProducto?id_=${item.id}">Modificar</a>
		<a href="deleteProducto?id_=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>