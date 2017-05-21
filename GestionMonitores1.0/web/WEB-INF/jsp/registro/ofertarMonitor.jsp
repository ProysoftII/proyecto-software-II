<%-- 
    Document   : ofertarMonitor
    Created on : 3/04/2017, 03:42:42 PM
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
       <h1>Ofertar Monitor</h1>
        
        <form action="mensaje2.htm" method="post">
        <table>
            <tr>
                <td>Seleccione la materia a ofertar:</td>
                <td>
                    <select name="sel_materia">
                        <option value=""></option>
                        <option value="Sistemas Operativos">Sistemas Operativos</option>
                        <option value="Calculo Integral">Calculo Integral</option>
                        <option value="Calculo Diferencial">Calculo Diferencial</option>
                    </select>
                </td>
            </tr>
            <tr><td colspan="2"><input name="bot_ofertar" id="bot_registrar" value="Ofertar" type="submit"></td></tr>
        </table>
        </form>
    </body>
</html>
