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

import java.util.ArrayList;
import Inventario.*;
import org.json.JSONObject;
import org.json.JSONException;
import GUI.MainFrame;
import GUI.AdministradorFrame;

public class Administrador extends Usuario{

    public Administrador(String nombre, String pass) {
        super(nombre, pass);
    }
    public void crearEstante(String nombre, int cantidadSlot){}
    public void crearEstante(String nombre, int cantidadSlots, int espacioPorSlot){}
    public void crearEstante(String nombre, ArrayList<Slot> slots){}
    public void agregarProductoCatalogo(Producto producto){}
    public void quitarProductoCatalogo(Producto producto){}
    public void quitarProductoCatalogo(String nombre){}

    @Override
    public String serializa() {
        try {
            JSONObject json = new JSONObject();
            json.put("nombreUsuario", getNombre());
            json.put("Pass", getPass());
            json.put("Tipo_Usuario", "Administrador");
            return json.toString();
        } catch (JSONException e) {
            return null;
        }
    }

    @Override
    public void lanzarFrame() {
        
    }


}
