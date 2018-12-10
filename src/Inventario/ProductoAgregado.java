/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author copec
 */
public class ProductoAgregado implements Serializa{
    private Producto producto;
    private String nombreOperador;
    
    public ProductoAgregado(Producto producto, String nombreOperador){
        this.producto = producto;
        this.nombreOperador = nombreOperador;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getNombreOperador() {
        return nombreOperador;
    }

    public void setNombreOperador(String nombreOperador) {
        this.nombreOperador = nombreOperador;
    }
    
    public ProductoAgregado creaProductoAgregado(String linea){return null;}

    @Override
    public String serializa() {
        try{
            JSONObject jProductoAgregado = new JSONObject();
            jProductoAgregado.put("nombreOperador", getNombreOperador());
            jProductoAgregado.put("producto", getProducto().serializa());
            return jProductoAgregado.toString();
        }catch(JSONException e){
            return null;
        }
    }
    public static ProductoAgregado deserializa(String line){
        try {
            JSONObject json = new JSONObject(line);
            return new ProductoAgregado(Producto.deserializa(json.getString("producto")),json.getString("nombreOperador"));
        } catch (JSONException ex) {
            return null;
        }
    }
}
