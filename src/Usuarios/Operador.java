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

import Inventario.*;
import org.json.JSONException;
import org.json.JSONObject;
import GUI.MainFrame;
import GUI.ConsultorFrame;

public class Operador extends Usuario{

    public Operador(String nombre, String pass) {
        super(nombre, pass);
    }
    
    public void agregarProductoEstante(ProductoAgregado productoAgregado){}
    public void quitarProductoEstante(String nombreProducto, Estante estante){}
    public void quitarProductoEstante(ProductoAgregado productoAgregado, Estante estante){}
    public void guardaInventario(){}

    @Override
    public String serializa() {
        try {
            JSONObject json = new JSONObject();
            json.put("nombreUsuario", getNombre());
            json.put("Pass", getPass());
            json.put("Tipo_Usuario", "Operador");
            return json.toString();
        } catch (JSONException e) {
            return null;
        }
    }

    @Override
    public void lanzarFrame() {
        
    }
}
