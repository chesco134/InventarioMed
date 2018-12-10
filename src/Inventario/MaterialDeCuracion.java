package Inventario;

/**
 *
 * @author copec
 */

import org.json.JSONObject;
import org.json.JSONException;

public class MaterialDeCuracion extends Producto{
    
    private String clasificacion;

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    @Override
    public String serializa() {
        try{
            JSONObject json = new JSONObject();
            json.put("nombre", getNombre());
            json.put("precio", getPrecio());
            json.put("descripcion", getDescripcion());
            json.put("clasificacion", getClasificacion());
            json.put("unidadDeMedida", getUnidadMedida());
            json.put("dimension", getDimension());
            json.put("fechaCaducidad", getFechaCaducidad());
            return json.toString();
        }catch(JSONException e){return null;}
    }
    
    public static MaterialDeCuracion deserializa(String linea){
        try{
            JSONObject json = new JSONObject(linea);
            MaterialDeCuracion materialDeCuracion = new MaterialDeCuracion();
            materialDeCuracion.setClasificacion(json.getString("clasificacion"));
            materialDeCuracion.setDescripcion(json.getString("descripcion"));
            materialDeCuracion.setDimension(new Dimension(json.getString("nombreTamaño"),json.getInt("TamañoEnNumero")));
            materialDeCuracion.setFechaCaducidad((json.getString("FechaCaducidad")));
            materialDeCuracion.setPrecio(json.getLong("precio"));
            materialDeCuracion.setUnidadMedida(json.getString("UnidadDeMedida"));
            materialDeCuracion.setNombre(json.getString("NombreProducto"));
            return materialDeCuracion;
        }catch(JSONException e){
            e.printStackTrace();
            return null;
        }
    }
}
