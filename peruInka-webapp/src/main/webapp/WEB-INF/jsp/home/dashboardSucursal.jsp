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
<a href="frmSucursal">Nuevo Sucursal</a>
<br>
<display:table name="${listSucursal}" id="item" class="table">
 	<display:column title="Codigo" property="id" /><br>
	<display:column title="Razonn Social" property="razonSocial" /><br>
	<display:column title="RUC" property="RUC" /><br>
	<display:column title="Direccion" property="direccion" /><br>
	<display:column title="Nro Telefono" property="nrTelefono" /><br>
	<display:column title="Estado" property="status" /><br>
	<display:column title="OPC"><br>
		<a href="editSucursal?id_=${item.id}">Modificar</a><br>
		<a href="deleteSucursal?id_=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>