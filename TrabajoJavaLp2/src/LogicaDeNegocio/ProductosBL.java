/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

import AccesoDatos.ProductosDA;
import java.util.ArrayList;
import modelo.Producto;

/**
 *
 * @author MARTIN RAMIREZ
 */
public class ProductosBL {
    private ProductosDA productoDA;
    public ProductosBL(){
        this.productoDA=new ProductosDA();
    }
    public ArrayList<Producto> listarProductos()throws Exception{
        return productoDA.listarProductos();
    }
    public void insertarProducto(String id, String nombre, String medida, 
            double precio, String desc, int stock, int tipo, int stockMin, int estado)throws Exception{
        productoDA.insertarProducto(id, nombre, medida, precio, desc, stock, tipo, stockMin, estado);
    }
    public void eliminarProducto(String id)throws Exception{
        productoDA.eliminarProducto(id);
    }
    public void modificarProducto(Producto prod,String unidad,String idBuscar)throws Exception{
        productoDA.modificarProducto(prod, unidad,idBuscar);
    }
    public void incrementarStock(int stock, String cod)throws Exception{
        productoDA.incrementarStock(stock, cod);
    }
}
