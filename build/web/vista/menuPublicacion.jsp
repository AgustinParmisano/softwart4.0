<%-- 
    Document   : formPublicar
    Created on : 03/06/2014, 17:40:31
    Author     : agustin
--%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MENU DE PUBLICACIONES</title>
    </head>
    <body>
        <h1>MENU PUBLICACIONES</h1>
         <ul>
            <li><a href="nuevaPublicacion.jsp">Nueva Publicacion</a></li>
            <li><a href="<s:url action="ObtenerPublicacionesUsuarioAction"/>">Ver mis publicaciones</a></li>
         </ul>
    </body>
</html>
