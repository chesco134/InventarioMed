/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

/**
 *
 * @author copec
 */
public class ManejadorInventario {
    private Inventario.Inventario inventario;
    private ManejadorArchivo manejadorArchivo = new ManejadorArchivo("Inventario", false);
    
    public void guardaInventario(){
    manejadorArchivo.escribeLinea(inventario.serializa());
    }
    public void cargaInventario(){}
    public Inventario.Inventario obtenerInventario(){return null;}
}
