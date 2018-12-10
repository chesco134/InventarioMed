/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

/**
 *
 * @author copec
 */

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CatalogoProducto implements Serializa{
    private ArrayList<Producto> productos;

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public ArrayList<Producto> consultaCatalogo(){return null;}

    @Override
    public String serializa() {
        try{
            JSONObject json = new JSONObject();
            JSONArray jProductos = new JSONArray();
            productos.forEach((producto) -> {
                jProductos.put(producto.serializa());
            });
            json.put("producto", jProductos);
            return json.toString();
        }catch(JSONException e){return null;}
    }
}
