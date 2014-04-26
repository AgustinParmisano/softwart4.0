<%-- 
    Document   : login
    Created on : 26/04/2014, 18:16:52
    Author     : agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Ingrese</h1>
        <s:form action="LoginAction">  
            <s:textfield name="username" label="Nombre"></s:textfield>  
            <s:password name="userpass" label="Password"></s:password>  
            <s:submit value="login"></s:submit>  
        </s:form>   
    </body>
</html>
