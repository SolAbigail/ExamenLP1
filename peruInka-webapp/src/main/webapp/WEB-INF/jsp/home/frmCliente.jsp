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

Formulario Cliente : ${opc}<br>

${message}

<form:form commandName="cliente" action="saveCliente" method="POST">

Id: <form:input path="id" id="id"/><br><p>
Nombre: <form:input path="nombre" id="nombre"/><br><p>
Apellido Pateno: <form:input path="apePaterno" id="apePaterno"/><br><p>
Apellido Mateno: <form:input path="apeMaterno" id="apeMaterno"/><br><p>
Tipo Documento: <form:input path="tipoDocumento" id="tipoDocumento"/><br><p>
Nro Documento: <form:input path="nroDocumento" id="nroDocumento"/><br><p>
Nro Telefono: <form:input path="nroTelefono" id="nroTelefono"/><br><p>

<input type="hidden" name="opc" id="opc" value="${opc}"><br><p>

<button type="submit">Guardar</button>

</form:form>