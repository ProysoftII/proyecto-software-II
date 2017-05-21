/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.consultas;

import Modelo.datos.Conexion;
import Modelo.entidades.UnidadEnseñanza;
import Modelo.entidades.Coordinador;
import Modelo.entidades.Estudiante;
import Modelo.entidades.Profesor;
import Modelo.entidades.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Desarrollo2
 */
public class Consultas {

    public ResultSet consultarMaterias(String cedula) throws SQLException{
    
        Conexion conex = new Conexion();
        Statement st = conex.con.createStatement();
        ResultSet rs = null;
        String consulta = "select mat_nombre from oferta_monitor where usu_cedula='" + cedula + "'";
        rs =  st.executeQuery(consulta);
        return rs;
    }

    
    public static void main(String[] args) throws SQLException{
        
    }
}
