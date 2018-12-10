/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author copec
 */
public class Slot implements Serializa{
    private int index;
    private int espacio;
    private java.util.ArrayList<ProductoAgregado> productos;
    private String receptorDeMaterial;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public ArrayList<ProductoAgregado> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoAgregado> productos) {
        this.productos = productos;
    }

    public String getReceptorDeMaterial() {
        return receptorDeMaterial;
    }

    public void setReceptorDeMaterial(String receptorDeMaterial) {
        this.receptorDeMaterial = receptorDeMaterial;
    }

    @Override
    public String serializa() {
        try{
            JSONObject jSlot = new JSONObject();
            jSlot.put("index", getIndex());
            jSlot.put("espacio", getEspacio());
            JSONArray jProductosAgregados = new JSONArray();
            productos.forEach((productoAgregado) -> {
                jProductosAgregados.put(productoAgregado.serializa());
            });
            jSlot.put("productosAgregados",jProductosAgregados);
            return jSlot.toString();
        }catch(JSONException e){return null;}
    }
    public static Slot deserializa(String linea){
        try{
            JSONObject json = new JSONObject(linea);
            Slot slot = new Slot();
            slot.setEspacio(json.getInt("espacio"));
            slot.setIndex(json.getInt("index"));
            java.util.ArrayList<ProductoAgregado> productos;
            productos = new java.util.ArrayList<>();
            JSONArray jProductosAgregados = json.getJSONArray("productosAgregados");
            for(int i = 0; i<=jProductosAgregados.length(); i++){
                productos.add(ProductoAgregado.deserializa(jProductosAgregados.getString(i)));
            }
            slot.setProductos(productos);
            return slot;
        }catch(JSONException e){return null;}
    }
}
