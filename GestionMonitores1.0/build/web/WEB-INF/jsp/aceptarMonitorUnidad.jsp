<%-- 
    Document   : aceptarMonitor
    Created on : 3/04/2017, 03:53:41 PM
    Author     : Desarollo1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Aceptar monitor unidad de enseñanza</h1>
        <form action="aceptarMonitorUnidad_1.htm" method="post">
                <table name='aceptarMonitorUnidad'>
                    <tr>
                        <td><select name='profesores' id="materias" size='1'/>
                        <option value="">Seleccione un profesor</option>
                        <option value="">Juan Carlos Lopez</option>
                        <option value="">Carla Yudith Medina</option>
                        <option value="">Elkin Blanco</option>
                        </td></tr>
<tr><td><input type="submit" name="btnAceptar" id="btnAceptar" value="seleccionar" /></td></tr>
                </table>
                <!--<input type="hidden" name="tipo_controlador" id="tipo_controlador" value="login">-->
            </form>
    </body>
</html>
