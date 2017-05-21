<%-- 
    Document   : registrar
    Created on : 24/02/2017, 04:17:57 PM
    Author     : Desarollo1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <% String rol = request.getAttribute("rol").toString();%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <form action="mensaje.htm" method="post">
        <table>
            <tr><s: var="rol" id="roles" value="${rolControlador}"></s:><td>Nombre:</td><td><input name="txt_nombre" id="txt_nombre" type="text" ><input name="hid_rol" id="hid_rol" type="hidden" value="<%=rol%>"></td></tr>
            <tr><td>Apellidos: </td><td><input name="txt_apellidos" id="txt_apellidos" type="text"></td></tr>
            <tr><td>Cédula </td><td><input name="txt_cedula" id="txt_cedula" type="text"></td></tr>
            <tr><td>Usuario </td><td><input name="txt_usuario" id="txt_usuario" type="text"></td></tr>
            <tr><td>Contraseña </td><td><input name="txt_clave" id="txt_clave" type="password"></td></tr>
            <% if(!rol.equals("coordinador")){%>
            <tr><input name="txt_programa" id="txt_programa" value="null" type="hidden"/></tr>
            <% } %>
            <% if(!rol.equals("profesor")){%>
            <input name="txt_materias" id="txt_materias" type="hidden" value="null">
            <% } %>
        
            <% if( rol.equals("profesor")){%>
            
            <tr><td>Ingrese las materias (separadas por comas):</td><td><input name="txt_materias" id="txt_materias" type="text"></td></tr>
            <tr><input name="txt_programa" id="txt_programa" value="null" type="hidden"/></tr>
            <% }else if(rol.equals("coordinador")){%>
            <input name="txt_materias" id="txt_materias" type="hidden" value="null">
            <tr><td>Programa al cual pertenece:</td><td><input name="txt_programa" id="txt_programa" type="text"></td></tr>
            <%}  %>
            
            <tr><td colspan="2"><input name="bot_registrar" id="bot_registrar" value="Registrar" type="submit"></td></tr>
        </table>
        </form>
    </body>
</html>
