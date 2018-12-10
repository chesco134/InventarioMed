/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import java.io.File;

/**
 *
 * @author copec
 */

import java.io.PrintWriter;
import java.io.BufferedReader;
import Usuarios.Usuario;
import java.io.IOException;

public class ManejadorArchivo {
    
    private File archivo;
    private PrintWriter pw;
    private BufferedReader br;
    
    public ManejadorArchivo(String nombreArchivo, boolean concatenar){
        archivo = new File(nombreArchivo);
        try{
            pw = new PrintWriter(new java.io.FileWriter(archivo, concatenar));
            br = new BufferedReader(new java.io.FileReader(archivo));
        }catch(IOException e){}
    }
    
    public void escribeLinea(String linea){
        pw.println(linea);
    }
    
    public String leerLinea(){
        try{
            br.readLine();
            return br.readLine();
        }catch(IOException e){return null;}
    }
    
    public void cerrarArchivo(){
        pw.close();
    }
    
    public void cerrarBr(){
        try{br.close();}catch(IOException e){}
    }
    
}
