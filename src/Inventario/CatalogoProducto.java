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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public static CatalogoProducto deserealiza(String linea){
        try {
            CatalogoProducto cP = new CatalogoProducto();
            JSONObject json = new JSONObject(linea);
            JSONArray jProductos = json.getJSONArray("producto");
            ArrayList<Producto> productos = new ArrayList<>();
            for(int i = 0; i <= jProductos.length(); i++){
                productos.add(Producto.deserializa(jProductos.getString(i)));
            }
            cP.setProductos(productos);
            return cP;
        } catch (JSONException ex) {
            return null;
        }
    }
}
