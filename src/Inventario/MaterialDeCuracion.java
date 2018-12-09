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
public class MaterialDeCuracion extends Producto{
    
    private String clasificacion;

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    @Override
    public String serializa(){return null;}
    
    public static MaterialDeCuracion deserializa(String linea){
        try{
            JSONObject json = new JSONObject(linea);
            MaterialDeCuracion materialDeCuracion = new MaterialDeCuracion();
            materialDeCuracion.setClasificacion(json.getString("clasificacion"));
            materialDeCuracion.setDescripcion(json.getString("descripcion"));
            // materialDeCuracion.setDimension(new Dimension());
        }catch(JSONException e){
            return null;
        }
    }
}
