/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
/**
 *
 * @author copec
 */
public class Estante implements Serializa{
    private String nombre;
    private java.util.ArrayList<Slot> slots;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Slot> getSlots() {
        return slots;
    }

    public void setSlots(ArrayList<Slot> slots) {
        this.slots = slots;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Estante(String nombre, int cantidadSlots){}
    public Estante(String nombre, java.util.ArrayList<Slot> slots){}
    public Estante(String nombre, int cantidadSlots, int espacioPorSlot){}
    public Estante(){}
    public boolean agregarProducto(ProductoAgregado producto){return false;}

    @Override
    public String serializa() {
        try{
            JSONObject json = new JSONObject();
            json.put("nombreEstante", getNombre());
            json.put("descripcion", "jajajajtl");
            JSONArray jSlots = new JSONArray();
            for(Slot slot : slots){
                jSlots.put(slot.serializa());
            }
            json.put("slots", jSlots);
            return json.toString();
        }catch(JSONException e){return null;}
    }
    
    public static Estante deserializa(String linea){
        try {
            JSONObject json = new JSONObject(linea);
            Estante estante = new Estante();
            estante.setDescripcion(json.getString("descripcion"));
            estante.setNombre(json.getString("nombreEstante"));
            java.util.ArrayList<Slot> slots;
            slots = new java.util.ArrayList<>();
            JSONArray jSlots = json.getJSONArray("slots");
            for(int i = 0; i <= jSlots.length(); i++){
                slots.add(Slot.deserializa(jSlots.getString(i)));
            }
            estante.setSlots(slots);
            return estante;
        } catch (JSONException ex) {
            return null;
        }
    }
}
