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
}
