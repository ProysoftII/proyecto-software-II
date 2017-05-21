/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.entidades;

import Modelo.entidades.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Desarollo1
 */
public class Profesor extends Usuario {
    private String materias;

    public Profesor(String cedula, String nombre, String apellido, String clave, String usu_login, String materias) {
        super(cedula, nombre, apellido, clave, usu_login);
        this.materias = materias;
    }

    /**
     * @return the materias
     */
    public String getMaterias() {
        return materias;
    }

    /**
     * @param materias the materias to set
     */
    public void setMaterias(String materias) {
        this.materias = materias;
    }
    
}
