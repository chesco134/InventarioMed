/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import Usuarios.*;
/**
 *
 * @author copec
 */
public class ManejadorUsuarios {
    private java.util.ArrayList<Usuarios.Usuario> usuarios;
    private ManejadorArchivo manejadorArchivo;
    
    public ManejadorUsuarios(){
        usuarios = new java.util.ArrayList<>();
    }
    
    public boolean validarUsuario(String name, String pass){
        boolean aux = false;
        if(usuarios.isEmpty()){return aux;}else{
        for(Usuarios.Usuario user : usuarios){
            if(user.getNombre().equals(name)){
                aux = true;
                return aux;
            }else{
        aux = false;
            }
        }
        }return aux;
    }
    public void agregarUsuario(String name, String pass, int who){
        switch(who){
            case 3:
                Administrador usuario = new Administrador(name, pass);
                usuarios.add(usuario);
            case 1:
                Operador usuarioOp = new Operador(name, pass);
                usuarios.add(usuarioOp);
            case 2:
                Consultor usuarioCo = new Consultor(name,pass);
                usuarios.add(usuarioCo);
        }
    }
    public Usuarios.Usuario quitarUsuario(Usuarios.Usuario usuario){return usuario;}
    public void guardaUsuario(){
         manejadorArchivo = new ManejadorArchivo("Usuarios",true);
        for(Usuarios.Usuario usuario : usuarios){
            manejadorArchivo.escribeLinea(usuario.serializa());
        }
        manejadorArchivo.cerrarArchivo();
    }
    public java.util.ArrayList<Usuarios.Usuario> cargaUsuarios(){
        String line;
        Usuarios.Usuario usuario;
         manejadorArchivo = new ManejadorArchivo("Usuarios",true);
        while((line = manejadorArchivo.leerLinea()) != null){
            if((usuario = Usuarios.Usuario.deserializa(line)) != null){
                usuarios.add(usuario);
            }
        }
        manejadorArchivo.cerrarArchivo();
        return usuarios;
    }
}
