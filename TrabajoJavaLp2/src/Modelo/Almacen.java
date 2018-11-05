/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author PC
 */
public class Almacen {

    public Almacen(int idalmacen, String direccion) {
        this.idalmacen = idalmacen;
        this.direccion = direccion;
    }

    public Almacen(int idalmacen, String direccion, int numDifProd) {
        this.idalmacen = idalmacen;
        this.direccion = direccion;
        this.numDifProd = numDifProd;
    }
    private int idalmacen;
    private String direccion;
    private int numDifProd;
    private int estado;

    public Almacen() {
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Almacen(int idalmacen, String direccion, int numDifProd, int estado) {
        this.idalmacen = idalmacen;
        this.direccion = direccion;
        this.numDifProd = numDifProd;
        this.estado = estado;
    }

    public int getNumDifProd() {
        return numDifProd;
    }

    public void setNumDifProd(int numDifProd) {
        this.numDifProd = numDifProd;
    }

    public int getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(int idalmacen) {
        this.idalmacen = idalmacen;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
