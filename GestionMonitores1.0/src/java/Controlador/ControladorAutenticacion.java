/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.controles.ControlConsultas;
import Modelo.entidades.Coordinador;
import Modelo.entidades.Estudiante;
import Modelo.entidades.Monitor;
import Modelo.entidades.Profesor;
import Modelo.entidades.UnidadEnseñanza;
import Modelo.entidades.Usuario;
import java.sql.ResultSet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Desarollo1
 */
@Controller
public class ControladorAutenticacion {
    ControlConsultas controlCons = new ControlConsultas();
    Usuario usuario;
    
    
    @RequestMapping("acceso.htm")
    public ModelAndView acceso(){
        System.out.println("Pruebaaaa");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("autenticacion/acceso");
        return mav;
    }
    
    @RequestMapping(value = "ingreso.htm", method = RequestMethod.POST)
    public ModelAndView ingreso(@RequestParam("user") String user, @RequestParam("pass") String pass ){
        ModelAndView mav = new ModelAndView();
        mav.addObject("user", user);
        mav.addObject("pass", pass);
        try {
            ResultSet rs = controlCons.getConAut().autenticar(user, pass);
            while(rs.next()){
                if(user.equals(rs.getString("usu_usuario")) && pass.equals(rs.getString("usu_clave"))){
                       mav.setViewName("menu");
                       if(rs.getString("usu_tipo").equals("estudiante")){
                           usuario = new Estudiante(rs.getString("usu_cedula"), rs.getString("usu_nombre"), rs.getString("usu_apellido"), rs.getString("usu_clave"), rs.getString("usu_usuario"));
                           return mav;
                       }else if(rs.getString("usu_tipo").equals("profesor")){
                           usuario = new Profesor(rs.getString("usu_cedula"), rs.getString("usu_nombre"), rs.getString("usu_apellido"), rs.getString("usu_clave"), rs.getString("usu_usuario"), rs.getString("usu_materias"));
                           return mav;
                       }else if(rs.getString("usu_tipo").equals("monitor")){
                           usuario = new Monitor(rs.getString("usu_cedula"), rs.getString("usu_nombre"), rs.getString("usu_apellido"), rs.getString("usu_clave"), rs.getString("usu_usuario"), rs.getString("usu_materias"));
                           return mav;
                       }else if(rs.getString("usu_tipo").equals("coordinador")){
                           usuario = new Coordinador(rs.getString("usu_cedula"), rs.getString("usu_nombre"), rs.getString("usu_apellido"), rs.getString("usu_clave"), rs.getString("usu_usuario"), rs.getString("usu_programa"));
                           return mav;
                       }else if(rs.getString("usu_tipo").equals("unidad")){
                           usuario = new UnidadEnseñanza(rs.getString("usu_cedula"), rs.getString("usu_nombre"), rs.getString("usu_apellido"), rs.getString("usu_clave"), rs.getString("usu_usuario"));
                           return mav;
                       }
                    }else{
                    mav.setViewName("autenticacion/acceso");
                    return mav;
                    }  
                }
                
        } catch (Exception e) {}
        
        mav.setViewName("autenticacion/acceso");
        return mav;
    }
    
}
