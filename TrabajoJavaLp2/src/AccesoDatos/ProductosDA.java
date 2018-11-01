/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Medida;
import modelo.Producto;

/**
 *
 * @author MARTIN RAMIREZ
 */
public class ProductosDA {
    public ProductosDA(){
        
    }
    public ArrayList<Producto> listarProductos()throws Exception{
        ArrayList<Producto> productos=new ArrayList<Producto>();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");
        
            Statement cadena=con.createStatement();
            String sql="SELECT * FROM n_producto";
            ResultSet rs=cadena.executeQuery(sql);
            Medida med;
            while(rs.next()){
                String codigo=rs.getString("id_producto");
                String nombre=rs.getString("nombre");
                double precio=rs.getFloat("precio");
                String desc=rs.getString("descripcion");
                int stock=rs.getInt("stock");
                int tipo=rs.getInt("tipo");
                int stockMin=rs.getInt("stokcMinimo");
                String unidad=rs.getString("UnidMedida");
                int estado=rs.getInt("estado");
                
                if(unidad.compareTo("UNIDAD")==0){
                    Producto prod=new Producto(codigo,nombre,desc,precio,Medida.unidad,tipo,stockMin,stock,estado);
                    if(prod.getEstado()==1)
                    productos.add(prod);
                }else if(unidad.compareTo("CENTENA")==0){
                    Producto prod=new Producto(codigo,nombre,desc,precio,Medida.centena,tipo,stockMin,stock,estado);
                    if(prod.getEstado()==1)
                    productos.add(prod);
                }else if(unidad.compareTo("METRO")==0){
                    Producto prod=new Producto(codigo,nombre,desc,precio,Medida.metro,tipo,stockMin,stock,estado);
                    if(prod.getEstado()==1)
                    productos.add(prod);
                }else if(unidad.compareTo("BOLSA")==0){
                    Producto prod=new Producto(codigo,nombre,desc,precio,Medida.bolsa,tipo,stockMin,stock,estado);
                    if(prod.getEstado()==1)
                    productos.add(prod);
                }else if(unidad.compareTo("DOCENA")==0){
                    Producto prod=new Producto(codigo,nombre,desc,precio,Medida.docena,tipo,stockMin,stock,estado);
                    if(prod.getEstado()==1)
                    productos.add(prod);
                }else if(unidad.compareTo("KILOGRAMO")==0){
                    Producto prod=new Producto(codigo,nombre,desc,precio,Medida.kilogramo,tipo,stockMin,stock,estado);
                    if(prod.getEstado()==1)
                    productos.add(prod);
                }            
            }
            con.close();
       
        return productos;
    }
}
