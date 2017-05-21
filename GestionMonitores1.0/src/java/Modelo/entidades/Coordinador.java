/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.entidades;

import Modelo.entidades.Usuario;

/**
 *
 * @author Desarollo1
 */
public class Coordinador extends Usuario{
    private String programa;

    public Coordinador(String cedula, String nombre, String apellido, String clave, String usu_login, String programa) {
        super(cedula, nombre, apellido, clave, usu_login);
        this.programa = programa;
    }

    /**
     * @return the programa
     */
    public String getPrograma() {
        return programa;
    }

    /**
     * @param programa the programa to set
     */
    public void setPrograma(String programa) {
        this.programa = programa;
    }
}
