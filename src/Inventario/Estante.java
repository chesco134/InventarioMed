/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

import java.util.ArrayList;

/**
 *
 * @author copec
 */
public class Estante {
    private String nombre;
    private java.util.ArrayList<Slot> slots;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Slot> getSlots() {
        return slots;
    }

    public void setSlots(ArrayList<Slot> slots) {
        this.slots = slots;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Estante(String nombre, int cantidadSlots){}
    public Estante(String nombre, java.util.ArrayList<Slot> slots){}
    public Estante(String nombre, int cantidadSlots, int espacioPorSlot){}
    public boolean agregarProducto(ProductoAgregado producto){return false;}
    public Estante crearEstante(String linea){return null;}
}
