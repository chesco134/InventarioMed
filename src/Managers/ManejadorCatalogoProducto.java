package Managers;

import Inventario.CatalogoProducto;

/**
 *
 * @author copec
 */
public class ManejadorCatalogoProducto {
    CatalogoProducto catalogoProducto;
    ManejadorArchivo manejadorArchivo = new ManejadorArchivo("catalogoProducto", false);
    
    public void guardaProductos(){
        manejadorArchivo.escribeLinea(catalogoProducto.serializa());
    }
    public void cargaProductos(){}
    public CatalogoProducto obtenerCatalogoProductos(){return null;}
}
