<%-- 
    Document   : index
    Created on : 16/02/2017, 10:57:43 AM
    Author     : Desarrollo2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css"/>
        <script src="js/script.js"></script>
        <title>Gestión Monitores</title>
    </head>
    <body>
        <div align="center">
            <form action="ingreso.htm" method="post">
                <table>
                    <tr><td>&nbsp;</td></tr>
                    <tr><td>&nbsp;</td></tr>
                    <tr><td>&nbsp;</td></tr>
                    <tr><td>&nbsp;</td></tr>
                    <tr>
                        <td colspan="2"><strong><font size="6"><div align="center">Sistema Monitores</div></font></strong></td>
                    </tr>
                    <tr><td>Usuario:</td><td><input type="text" name="user" id="user"></td></tr>
                    <tr><td>Contraseña: </td><td><input type="password" name="pass" id="pass"></td></tr>
                    <tr><td colspan="2">
                      <div align="center">
                      <input type="submit" name="entrar" id="entrar" value="Entrar">
                      </div>
                      </td></tr>
                </table>
                </form>
            <form action="registro.htm" method="post">
                <table name='registrar'>
                    <tr><td>¿No est&aacute; registrado?</td>
                        <td><input type="submit" name="registrar" id="registrar" value="Registrese"></td>
                        <td><select name='roles' id="roles" size='1'/>
                        <option value="">Seleccione un rol</option>
                        <option value="estudiante">Estudiante</option>
                        <option value="profesor">Profesor</option>
                        <option value="coordinador">Coordinador</option>
                        <option value="usu_enap">Usuario ense&nacute;anza y aprendizaje</option>
                        </td></tr>
                </table>
                <!--<input type="hidden" name="tipo_controlador" id="tipo_controlador" value="login">-->
            </form>
        </div>
        
    </body>
    
</html>
