/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Producto {

    public Producto(ArrayList<Proveedor> listaProveedores, String codigo, String nombre, String descripcion, double precio, Medida um, char tipo, int minimoStock) {
        this.listaProveedores = listaProveedores;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.um = um;
        this.tipo = tipo;
        this.minimoStock = minimoStock;
    }
    
    public Producto(){}
   
    private ArrayList<Proveedor> listaProveedores;
        
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private Medida um;
    private char tipo;
    private int minimoStock;

    public ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(ArrayList<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Medida getUm() {
        return um;
    }

    public void setUm(Medida um) {
        this.um = um;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getMinimoStock() {
        return minimoStock;
    }

    public void setMinimoStock(int minimoStock) {
        this.minimoStock = minimoStock;
    }
}