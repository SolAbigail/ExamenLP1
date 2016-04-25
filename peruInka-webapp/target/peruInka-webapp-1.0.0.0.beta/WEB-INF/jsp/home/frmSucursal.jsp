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

Formulario Sucursal : ${opc}<br>

${message}

<form:form commandName="sucursal" action="saveSucursal" method="POST">

Id: <form:input path="id" id="id"/><br><p>
Razon Social: <form:input path="razonSocial" id="razonSocial"/><br><p>
RUC: <form:input path="RUC" id="RUC"/><br><p>
Direccion: <form:input path="direccion" id="direccion"/><br><p>
Nro Telefono: <form:input path="nrTelefono" id="nrTelefono"/><br><p>
Estado: <form:input path="status" id="status"/><p>
<br>

<input type="hidden" name="opc" id="opc" value="${opc}"><br><p>

<button type="submit">Guardar</button>

</form:form>