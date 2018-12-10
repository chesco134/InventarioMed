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
    private ManejadorArchivo manejadorArchivo;
    
    public void guardaInventario(){
        manejadorArchivo = new ManejadorArchivo("Usuarios",true);
        manejadorArchivo.escribeLinea(inventario.serializa());
        manejadorArchivo.cerrarArchivo();
    }
    public void cargaInventario(){
        manejadorArchivo = new ManejadorArchivo("Usuarios",true);
        inventario = Inventario.Inventario.crearInventario(manejadorArchivo.leerLinea());
        manejadorArchivo.cerrarArchivo();
    }
    public Inventario.Inventario obtenerInventario(){return inventario;}
}
