/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.consultas;

import Modelo.datos.Conexion;
import Modelo.entidades.Coordinador;
import Modelo.entidades.Estudiante;
import Modelo.entidades.Profesor;
import Modelo.entidades.UnidadEnseñanza;
import Modelo.entidades.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Desarollo1
 */
public class ConsultasRegistro {
    
    public boolean registrar(Usuario usuario) throws SQLException{
    
        Conexion conex = new Conexion();
        Statement st = conex.con.createStatement();
        ResultSet rs = null;
        String consulta = "";
       
       if(usuario instanceof Estudiante){
            Estudiante estudiante = (Estudiante)usuario;
            String materias = " ";
            System.out.println("insert into usuarios (usu_usuario,usu_clave,usu_cedula, usu_nombre, usu_apellido, usu_materias, usu_programa) values ('" + estudiante.getUsuLogin() + "'," + estudiante.getClave()+ "," + estudiante.getCedula() + ",'" + estudiante.getNombre() + "','" + estudiante.getApellido() + "','null','null')");
            consulta = "insert into usuarios (usu_usuario,usu_clave,usu_cedula, usu_nombre, usu_apellido, usu_materias, usu_programa, usu_tipo) values ('" + estudiante.getUsuLogin() + "','" + estudiante.getClave()+ "','" + estudiante.getCedula() + "','" + estudiante.getNombre() + "','" + estudiante.getApellido() + "','null','null','estudiante')";
           
       }else if(usuario instanceof Profesor){
           Profesor profesor = (Profesor)usuario;
            consulta = "insert into usuarios (usu_usuario,usu_clave,usu_cedula, usu_nombre, usu_apellido, usu_materias, usu_programa, usu_tipo) values ('" + profesor.getUsuLogin() + "','" + profesor.getClave()+ "','" + profesor.getCedula() + "','" + profesor.getNombre() + "','" + profesor.getApellido() + "','" + profesor.getMaterias() + "','null','profesor')";
           
       }else if(usuario instanceof Coordinador){
           
           Coordinador coordinador = (Coordinador)usuario;
           String materias = "null";
           consulta = "insert into usuarios (usu_usuario,usu_clave,usu_cedula, usu_nombre, usu_apellido, usu_materias, usu_programa, usu_tipo) values ('" + coordinador.getUsuLogin() + "','" + coordinador.getClave()+ "','" + coordinador.getCedula() + "','" + coordinador.getNombre() + "','" + coordinador.getApellido() + "','" + materias + "','" + coordinador.getPrograma() + "','coordinador')";
           System.out.println(consulta);
       }else if(usuario instanceof UnidadEnseñanza){
           
           UnidadEnseñanza usuUnidad = (UnidadEnseñanza)usuario;
           String materias = "null";
           consulta = "insert into usuarios (usu_usuario,usu_clave,usu_cedula, usu_nombre, usu_apellido, usu_materias, usu_programa, usu_tipo) values ('" + usuUnidad.getUsuLogin() + "','" + usuUnidad.getClave()+ "','" + usuUnidad.getCedula() + "','" + usuUnidad.getNombre() + "','" + usuUnidad.getApellido() + "','" + materias + "','null','unidad')";
           System.out.println(consulta);
       }else{
           consulta = "";
       }
      
        System.out.println(consulta);
       int res =  st.executeUpdate(consulta);
        
        /*hile(rs.next()){
            if(user.equals(rs.getString("usu_usuario")) && pass.equals(rs.getString("usu_clave")))
                return true;  
        }*/
        if(res > 0){
            return true;
        }
        return false;
    }
    
    public void registrarOferta(String cedula,String materia) throws SQLException{
    
        Conexion conex = new Conexion();
        Statement st = conex.con.createStatement();
        int rs;
        String consulta = "";
        
        consulta = "insert into oferta_monitor (usu_id,mat_id,usu_cedula,mat_nombre) values ('1','1','" + cedula + "','" + materia + "')";
        System.out.println("consulta: " + consulta);
        rs =  st.executeUpdate(consulta);
    }
    
    public void registrarPostulacion(String cedula,String materia) throws SQLException{
    
        Conexion conex = new Conexion();
        Statement st = conex.con.createStatement();
        int rs;
        String consulta = "";

        consulta = "insert into postulacion_monitor (mat_nombre,usu_cedula) values ('" + materia + "','" + cedula + "')";
       System.out.println("consulta: " + consulta);
        rs =  st.executeUpdate(consulta);
    }
    
}
