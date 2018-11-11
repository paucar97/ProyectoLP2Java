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
public class Proveedor extends AgenteExterno{
    private int ruc;
    private String razonSoc;
    private String direccion;
    private int telefono;
    private String email;
    private ArrayList<String> listaProductos;
    private int estado;

    public Proveedor() {
    }

    public Proveedor(int ruc, String razonSoc, String direccion, int telefono, String email) {
        this.ruc = ruc;
        this.razonSoc = razonSoc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    public Proveedor(int ruc, String razonSoc, String direccion, int telefono, String email, int estado) {
        this.ruc = ruc;
        this.razonSoc = razonSoc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.estado=estado;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getRazonSoc() {
        return razonSoc;
    }

    public void setRazonSoc(String razonSoc) {
        this.razonSoc = razonSoc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<String> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Proveedor(int ruc, String razonSoc, String direccion, int telefono, String email, ArrayList<String> listaProductos, int estado) {
        this.ruc = ruc;
        this.razonSoc = razonSoc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.listaProductos = listaProductos;
        this.estado = estado;
    }
}
