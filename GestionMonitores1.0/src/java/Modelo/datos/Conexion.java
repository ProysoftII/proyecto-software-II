/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.datos;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author Desarrollo2
 */
public class Conexion {
    
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String HOST = "localhost";
    public static final String PORT = "3306";
    public static final String DATABASE = "monitores";
    public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://" + HOST +":"+PORT+"/"+DATABASE;
    public java.sql.Connection con;
    
    public Conexion() throws SQLException{
        
        try{
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch(ClassNotFoundException e){
            System.out.println("error");
        }catch(SQLDataException e){
            System.out.println("error");
        }
    }
    
    
}
