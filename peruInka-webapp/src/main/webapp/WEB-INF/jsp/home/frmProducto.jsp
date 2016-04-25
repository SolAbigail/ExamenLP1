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

Formulario Producto : ${opc}<br>

${message}

<form:form commandName="producto" action="saveProducto" method="POST">

Id: <form:input path="id" id="id"/><br><p>
Nombre Producto: <form:input path="nombreProducto" id="nombreProducto"/><br><p>
Precio: <form:input path="precio" id="precio"/><br><p>
Descripcion: <form:input path="descripcion" id="descripcion"/><br><p>
Atributo: <form:input path="atributo" id="atributo"/><br><p>
Tipo Producto: <form:input path="tipoProducto" id="tipoProducto"/><br><p>


<input type="hidden" name="opc" id="opc" value="${opc}"><br>

<button type="submit">Guardar</button>

</form:form>