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
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
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
public class Controlador {
    
    ControlConsultas controlCons = new ControlConsultas();
    Usuario usuario;
    
    @RequestMapping(value = "ofertarMonitor.htm", method = RequestMethod.GET)
    public ModelAndView ofertarMonitor(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("registro/ofertarMonitor");
        return mav;
    }
    
    @RequestMapping(value = "postularMonitor.htm", method = RequestMethod.GET)
    public ModelAndView postularMonitor(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("registro/postularMonitor");
        return mav;
    }
    
    @RequestMapping(value = "aceptarMonitorDoc.htm", method = RequestMethod.GET)
    public ModelAndView aceptarMonitorDoc(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("aceptarMonitorDoc");
        return mav;
    }
    
    @RequestMapping(value = "aceptarMonitorUnidad.htm", method = RequestMethod.GET)
    public ModelAndView aceptarMonitorUnidad(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("aceptarMonitorUnidad");
        return mav;
    }
    
    @RequestMapping(value = "aceptarMonitorDoc_1.htm", method = RequestMethod.POST)
    public ModelAndView aceptarMonitorDoc_1(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("aceptarMonitorDoc_1");
        return mav;
    }
    
    @RequestMapping(value = "aceptarMonitorUnidad_1.htm", method = RequestMethod.POST)
    public ModelAndView aceptarMonitorUnidad_1(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("aceptarMonitorUnidad_1");
        return mav;
    }
    
    @RequestMapping(value = "aceptarMonitorUnidad_2.htm", method = RequestMethod.POST)
    public ModelAndView aceptarMonitorUnidad_2(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("aceptarMonitorUnidad_2");
        return mav;
    }
    
    
    
}
