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
public class ManejadorUsuarios {
    private java.util.ArrayList<Usuarios.Usuario> usuarios;
    private ManejadorArchivo manejadorArchivo = new ManejadorArchivo("Usuarios",true);
    
    public ManejadorUsuarios(){
        usuarios = new java.util.ArrayList<Usuarios.Usuario>();
    }
    
    public boolean validarUsuario(Usuarios.Usuario usuario){return true;}
    public Usuarios.Usuario  agregarUsuario(Usuarios.Usuario usuario){return null;}
    public Usuarios.Usuario  quitarUsuario(Usuarios.Usuario usuario){return null;}
    public void guardaUsuario(){
        for(Usuarios.Usuario usuario : usuarios){
            manejadorArchivo.escribeLinea(usuario.serializa());
        }
    }
    public java.util.ArrayList<Usuarios.Usuario> cargaUsuarios(){return null;}
}
