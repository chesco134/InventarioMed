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
import org.json.JSONException;
import org.json.JSONObject;

public abstract class Usuario {
    private String nombre;
    private String pass;
    private ManejadorInventario manejadorInventario;
    private ManejadorCatalogoProducto manejadorCatalogoProducto;
    
    public String getNombre(){return nombre;}
    public String getPass(){return pass;}
    public Usuario(String nombre, String pass){
    this.nombre = nombre;
    this.pass = pass;
    }
    public abstract String serializa();
    public abstract void lanzarFrame();
    
    public static Usuario deserializa(String line){
        try{
            JSONObject json = new JSONObject(line);
            switch(json.getString("Tipo_Usuario")){
                case "Administrador":
                    return new Administrador(json.getString("nombreUsuario"), json.getString("Pass"));
                case "Operador":
                    return new Operador(json.getString("nombreUsuario"), json.getString("Pass"));
                case "Consultor":
                    return new Consultor(json.getString("nombreUsuario"), json.getString("Pass"));
            }
        }catch(JSONException e){
        }
        return null;
    }
}
