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

public class CatalogoProducto {
    ArrayList<Producto> productos;

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public ArrayList<Producto> consultaCatalogo(){return null;}
}
