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
public class ProductoAgregado {
    private Producto producto;
    private String nombreOperador;
    
    public ProductoAgregado(Producto producto, String nombreOperador){}

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
}
