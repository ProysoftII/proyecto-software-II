/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.consultas;

import Modelo.datos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Desarollo1
 */
public class ConsultasAutenticacion {
    
    public ResultSet autenticar(String user, String pass) throws SQLException{
        Conexion conex = new Conexion();
        Statement st = conex.con.createStatement();
        ResultSet rs = null;
        String consulta = "select * from usuarios where usu_usuario='" + user + "'and usu_clave='" + pass + "'";
        rs =  st.executeQuery(consulta);
        return rs;
    }
    
}
