/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author copec
 */

import Inventario.*;

public class Operador extends Usuario{

    public Operador(String nombre, String pass) {
        super(nombre, pass);
    }
    
    public void agregarProductoEstante(ProductoAgregado productoAgregado){}
    public void quitarProductoEstante(String nombreProducto, Estante estante){}
    public void quitarProductoEstante(ProductoAgregado productoAgregado, Estante estante){}
    public void guardaInventario(){}
}
