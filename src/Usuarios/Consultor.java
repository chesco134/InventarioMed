/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import org.json.JSONException;
import org.json.JSONObject;
import GUI.MainFrame;
import GUI.ConsultorFrame;

/**
 *
 * @author copec
 */
public class Consultor extends Usuario{

    public Consultor(String nombre, String pass) {
        super(nombre, pass);
    }
    
    public void consultarProductoEnInventario(){}

    @Override
    public String serializa() {
        try {
            JSONObject json = new JSONObject();
            json.put("nombreUsuario", getNombre());
            json.put("Pass", getPass());
            json.put("Tipo_Usuario", "Consultor");
            return json.toString();
        } catch (JSONException e) {
            return null;
        }
    }

    @Override
    public void lanzarFrame() {
        
    }
}
