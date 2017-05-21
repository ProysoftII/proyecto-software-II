/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.controles;

import Modelo.consultas.Consultas;
import Modelo.consultas.ConsultasAutenticacion;
import Modelo.consultas.ConsultasRegistro;

/**
 *
 * @author Desarollo1
 */
public class ControlConsultas {
    
    private Consultas con;
    private ConsultasRegistro conRe;
    private ConsultasAutenticacion conAut;
    
    public ControlConsultas(){
        
        con = new Consultas();
        conRe = new ConsultasRegistro();
        conAut = new ConsultasAutenticacion();
    }

    public Consultas getCon() {
        return con;
    }

    public ConsultasRegistro getConRe() {
        return conRe;
    }

    public void setConRe(ConsultasRegistro conRe) {
        this.conRe = conRe;
    }

    public ConsultasAutenticacion getConAut() {
        return conAut;
    }

    public void setConAut(ConsultasAutenticacion conAut) {
        this.conAut = conAut;
    }
    
    
    
}
