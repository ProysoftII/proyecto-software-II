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
public class UnidadEnseñanza extends Usuario{

    public UnidadEnseñanza() {
    }

    public UnidadEnseñanza(String cedula, String nombre, String apellido, String clave, String usu_login) {
        super(cedula, nombre, apellido, clave, usu_login);
    }
    
    
}
