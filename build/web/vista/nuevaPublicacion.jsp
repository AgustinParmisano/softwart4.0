<%-- 
    Document   : nuevaPublicacion
    Created on : 03/06/2014, 17:58:29
    Author     : agustin
--%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NUEVA PUBLIACION</title>
    </head>
    <body>
        <h1>NUEVA PUBLICACION</h1>
        <s:form action="NuevaPublicacionAction">  
            <s:textfield name="nombrePublicacion" label="Nombre Publicacion"></s:textfield>
            <s:textfield name="descripcionPublicacion" label="Descripcion Publicacion"></s:textfield>
            <s:file name="imagenPublicacion" label="Imagen Publicacion"></s:file>
            <s:file name="videoPublicacion" label="Video Publicacion"></s:file>
            <s:submit value="Publicar" label="Publicar"></s:submit>  
        </s:form>
    </body>
</html>
