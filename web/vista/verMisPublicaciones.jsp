<%-- 
    Document   : verMisPublicaciones
    Created on : 03/06/2014, 18:19:36
    Author     : agustin
--%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MIS PUBLICACIONES</title>
    </head>
    <body>
        <h1>MIS PUBLICACIONES</h1>
        <ul>
        <s:iterator value="publicaciones">
            <li><s:property value="publicacion"/></li>
        </s:iterator>
        </ul>
    </body>
</html>
