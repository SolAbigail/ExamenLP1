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
<a href="frmCliente">Nuevo Cliente</a>
<br>
<display:table name="${listCliente}" id="item" class="table">
 	<display:column title="Codigo" property="id" /><br>
	<display:column title="Nombre" property="nombre" /><br>
	<display:column title="Ape Paterno" property="apePaterno" /><br>
	<display:column title="Ape Materno" property="apeMaterno" /><br>
	<display:column title="Tipo Documento" property="tipoDocumento" /><br>
	<display:column title="Nro Documento" property="nroDocumento"/><br>
	<display:column title="Nro Telefono" property="nroTelefono"/><br>
	<display:column title="Estado" property="status" />
	<display:column title="OPC">
		<a href="editCliente?id_=${item.id}">Modificar</a>
		<a href="deleteCliente?id_=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>