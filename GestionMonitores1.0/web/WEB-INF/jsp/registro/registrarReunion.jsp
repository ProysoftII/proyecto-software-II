<%-- 
    Document   : registrarReunion
    Created on : 21/05/2017, 05:35:58 PM
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
        <h1>Registrar reunión</h1>
        
        <form action="mensaje1_1.htm" method="post">
        <table>
            <tr>
                <td>Seleccione el profesor:</td>
                <td>
                    <select name="sel_profesor">
                        <option value=""></option>
                        <option value="Reinel Tabares">Reinel Tabares</option>
                        <option value="Yesid Forero">Yesid Forero</option>
                        <option value="Carlos Zapata">Carlos Zapata</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Seleccione el estudiante</td>
                <td>
                    <select name="sel_estudiante">
                        <option value=""></option>
                        <option value="Carlos Montes">Carlos Montes</option>
                        <option value="Pedro Franco">Pedro Franco</option>
                        <option value="Alejandra Escobar">Alejandra Escobar</option>
                    </select>
                </td>
            </tr>
            <tr><td>Descipción: </td><td><textarea></textarea></td></tr>
            <tr><td>Fecha: </td><td><input value="dd/mm/yyyy" /></td></tr>
            <tr><td colspan="2"><input name="bot_registrar" id="bot_registrar" value="Registrar" type="submit"></td></tr>
        </table>
        </form>
    </body>
</html>
