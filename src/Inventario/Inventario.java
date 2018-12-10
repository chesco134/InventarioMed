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
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author copec
 */
public class Inventario implements Serializa{
    private java.util.ArrayList<Estante> estantes;
    private String direccion;

    public ArrayList<Estante> getEstantes() {
        return estantes;
    }

    public void setEstantes(ArrayList<Estante> estantes) {
        this.estantes = estantes;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void obtenerEstantesConEspacioLibre(){}
    

    @Override
    public String serializa() {
        try{
            JSONObject jInventario = new JSONObject();
            jInventario.put("direccion", getDireccion());
            JSONArray jEstantes = new JSONArray();
            estantes.forEach((estante)->{
                jEstantes.put(estante.serializa());
            });
            jInventario.put("estantes", jEstantes);
            return jInventario.toString();
        }catch(JSONException e){return null;}
    }
    public static Inventario crearInventario(String linea){
        try {
            JSONObject json = new JSONObject(linea);
            Inventario inv = new Inventario();
            inv.setDireccion(json.getString("direccion"));
            java.util.ArrayList<Estante> estantes;
            estantes = new java.util.ArrayList<>();
            JSONArray jEstantes = json.getJSONArray("estantes");
            for(int i = 0; i <= jEstantes.length(); i++){
                estantes.add(Estante.deserializa(jEstantes.getString(i)));
            }
            inv.setEstantes(estantes);
            return inv;
        } catch (JSONException ex) {
            return null;
        }
    }
}
