<%-- 
    Document   : registrarEstudiantesConMonitoria
    Created on : 21/05/2017, 05:36:41 PM
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
        <h1>Registrar estudiantes con monitoria</h1>
        
        <form action="mensaje1_1.htm" method="post">
        <table>
            <tr>
                <td>Seleccione el monitor:</td>
                <td>
                    <select name="sel_monitor">
                        <option value=""></option>
                        <option value="Pepe Perez">Pepe Perez</option>
                        <option value="Edwin Velasquez">Edwin Velasquez</option>
                        <option value="Teresita Franco">Teresita Franco</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Nombre del estudiante</td>
                <td>
                    <input />
                </td>
            </tr>
            <tr><td>Observación:  </td><td><textarea></textarea></td></tr>
            <tr><td>Fecha: </td><td><input value="dd/mm/yyyy" /></td></tr>
            <tr><td colspan="2"><input name="bot_registrar" id="bot_registrar" value="Registrar" type="submit"></td></tr>
        </table>
        </form>
    </body>
</html>
