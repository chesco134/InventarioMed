/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author copec
 */

import Managers.*;

public abstract class Usuario {
    String nombre;
    String pass;
    ManejadorInventario manejadorInventario;
    ManejadorCatalogoProducto manejadorCatalogoProducto;
    
    public String getNombre(){return null;}
    public String getPass(){return null;}
    public Usuario(String nombre, String pass){}
    public String serializa(){return null;}
}
