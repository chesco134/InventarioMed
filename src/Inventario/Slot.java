/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.util.ArrayList;

/**
 *
 * @author copec
 */
public class Slot {
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
    
    public Slot creaSlot(String linea){return null;}
}
