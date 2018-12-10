package Managers;

import Inventario.CatalogoProducto;

/**
 *
 * @author copec
 */
public class ManejadorCatalogoProducto {
    CatalogoProducto catalogoProducto;
    ManejadorArchivo manejadorArchivo;
    
    public void guardaProductos(){
        manejadorArchivo = new ManejadorArchivo("Usuarios",true);
        manejadorArchivo.escribeLinea(catalogoProducto.serializa());
        manejadorArchivo.cerrarArchivo();
    }
    public void cargaProductos(){
        manejadorArchivo = new ManejadorArchivo("Usuarios",true);
        catalogoProducto = CatalogoProducto.deserealiza(manejadorArchivo.leerLinea());
        manejadorArchivo.cerrarArchivo();
    }
    public CatalogoProducto obtenerCatalogoProductos(){return null;}
}
