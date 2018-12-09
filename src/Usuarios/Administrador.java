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

import java.util.ArrayList;
import Inventario.*;

public class Administrador extends Usuario{

    public Administrador(String nombre, String pass) {
        super(nombre, pass);
    }
    public void crearEstante(String nombre, int cantidadSlot){}
    public void crearEstante(String nombre, int cantidadSlots, int espacioPorSlot){}
    public void crearEstante(String nombre, ArrayList<Slot> slots){}
    public void agregarProductoCatalogo(Producto producto){}
    public void quitarProductoCatalogo(Producto producto){}
    public void quitarProductoCatalogo(String nombre){}
}
