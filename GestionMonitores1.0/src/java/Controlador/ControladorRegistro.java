/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.controles.ControlConsultas;
import Modelo.entidades.Coordinador;
import Modelo.entidades.Estudiante;
import Modelo.entidades.Profesor;
import Modelo.entidades.UnidadEnseñanza;
import Modelo.entidades.Usuario;
import java.sql.SQLException;
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
public class ControladorRegistro {
    
    ControlConsultas controlCons = new ControlConsultas();
    Usuario usuario;
    
    @RequestMapping(value = "mensaje1_1.htm", method = RequestMethod.POST)
    public ModelAndView mensaje1_1(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("registro/mensaje1_1");
        return mav;
    }
    
    //////////////////////////////////////
@RequestMapping(value = "mensaje2.htm", method = RequestMethod.POST)
    public ModelAndView registrarOferta(@RequestParam("sel_materia") String sel_materia){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("registro/mensaje2");
        mav.addObject("sel_materia", sel_materia);
        try {
            controlCons.getConRe().registrarOferta("1111", sel_materia);
            return mav;
           
        }catch(SQLException ex){
            ex.printStackTrace();
         }

        return mav;
    }
    
    @RequestMapping(value = "mensaje3.htm", method = RequestMethod.POST)
    public ModelAndView registrarPostulacion(@RequestParam("sel_materia") String sel_materia){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("registro/mensaje3");
        mav.addObject("sel_materia", sel_materia);
        try {
            controlCons.getConRe().registrarPostulacion(this.usuario.getCedula(), sel_materia);
            return mav;
           
        }catch(SQLException ex){
            ex.printStackTrace(); 
         }

        return mav;
    }
    
    @RequestMapping(value = "registro.htm", method = RequestMethod.POST)
    public ModelAndView registroForm(@RequestParam("roles") String rolControlador){
        ModelAndView mav = new ModelAndView();
        mav.addObject("rol", rolControlador);
        mav.setViewName("registro/registrar");
        return mav;
    }
    
    @RequestMapping(value = "registroReunion.htm", method = RequestMethod.GET)
    public ModelAndView registroReunion(){
        ModelAndView mav = new ModelAndView();

        mav.setViewName("registro/registrarReunion");
        return mav;
    }
    
    @RequestMapping(value = "registroEstuMonitoria.htm", method = RequestMethod.GET)
    public ModelAndView registroEstuMonitoria(){
        ModelAndView mav = new ModelAndView();

        mav.setViewName("registro/registrarEstudiantesConMonitoria");
        return mav;
    }
    
    @RequestMapping(value = "mensaje.htm", method = RequestMethod.POST)
    public ModelAndView registro(@RequestParam("hid_rol") String rolControlador, @RequestParam("txt_nombre") String txt_nombre, @RequestParam("txt_apellidos") String txt_apellidos,
    @RequestParam("txt_cedula") String txt_cedula,
    @RequestParam("txt_usuario") String txt_usuario,
    @RequestParam("txt_clave") String txt_clave,
    @RequestParam("txt_programa") String txt_programa,
    @RequestParam("txt_materias") String txt_materias){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("registro/mensaje");
        try {
            if( rolControlador.equals("estudiante")){
             Boolean res = controlCons.getConRe().registrar(new Estudiante(txt_cedula, txt_nombre, txt_apellidos, txt_clave, txt_usuario));
                System.out.println(res);
             if(res){
                 return mav;
             }else{
                 mav.setViewName("registro");
                 return mav;
             }
           }else if( rolControlador.equals("coordinador")){
             controlCons.getConRe().registrar(new Coordinador(txt_cedula, txt_nombre, txt_apellidos, txt_clave, txt_usuario, txt_programa));
             return mav;
           }
           else if( rolControlador.equals("profesor")){
             controlCons.getConRe().registrar(new Profesor(txt_cedula, txt_nombre, txt_apellidos, txt_clave, txt_usuario, txt_materias));
             return mav;
           }else if( rolControlador.equals("usu_enap")){
             controlCons.getConRe().registrar(new UnidadEnseñanza(txt_cedula, txt_nombre, txt_apellidos, txt_clave, txt_usuario));
            return mav;
           }
        }catch(SQLException ex){
            ex.printStackTrace();
         }

        return mav;
    }
    
}
