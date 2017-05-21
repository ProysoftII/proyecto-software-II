/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.controles;

import Modelo.entidades.Usuario;

/**
 *
 * @author Desarollo1
 */
public class ControlUsuario {
    
        private Usuario usu;

    public ControlUsuario(Usuario usu) {
        this.usu = usu;
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }
        
        
    
}
