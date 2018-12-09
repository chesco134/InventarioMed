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
public class Medicamento extends Producto{
    private String especificacion;

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    @Override
    public String serializa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static Medicamento deserializa(String linea){
        return null;
    }
}
