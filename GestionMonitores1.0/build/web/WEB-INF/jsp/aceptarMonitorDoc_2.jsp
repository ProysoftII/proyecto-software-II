<%-- 
    Document   : aceptarMonitor
    Created on : 3/04/2017, 03:53:41 PM
    Author     : Desarollo1
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Aceptar monitor docente</h1>
        <form action="mensaje1_1.htm" method="post">
                <table name='aceptarMonitorDocente'>
                    <tr>
                        <td><select name='materias' id="materias" size='1'/>
                        <option value="">Seleccione una materia</option>
                        <option value="sistemas operativos">Sistemas operativos</option>
                        <option value="ingenieria de software 1">Ingenieria software I</option>
                        <option value="ingenieria de software 2">Ingenieria software II</option>
                        </td></tr>
<tr><td><input type="submit" name="btnAceptar" id="btnAceptar" value="seleccionar" /></td></tr>
                </table>
                <!--<input type="hidden" name="tipo_controlador" id="tipo_controlador" value="login">-->
            </form>
    </body>
</html>
