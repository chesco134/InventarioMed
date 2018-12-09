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
    private String nombre;
    private String pass;
    private ManejadorInventario manejadorInventario;
    private ManejadorCatalogoProducto manejadorCatalogoProducto;
    
    public String getNombre(){return null;}
    public String getPass(){return null;}
    public Usuario(String nombre, String pass){}
    public abstract String serializa();
    public abstract Usuario deserializa();
}
