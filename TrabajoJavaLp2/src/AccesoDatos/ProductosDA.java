/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.CallableStatement;
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
                double precio=rs.getDouble("precio");
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
    public void insertarProducto(String id,String nombre,String medida,double precio,
            String desc,int stock,int tipo,int stockMin,int estado)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");
        
        CallableStatement comando=con.prepareCall("{call insertarProducto(?,"
                                                    + "?,?,?,?,?,?,?)}");
        comando.setString("_id_producto",id.toUpperCase());
        comando.setString("_nombre",nombre);
        comando.setString("_UnidMedida",medida);
        comando.setDouble("_precio", precio);
        comando.setString("_descripcion", desc);
        comando.setInt("_stock",stock);
        comando.setInt("_tipo", tipo);
        comando.setInt("_stokcMinimo", stockMin);
        comando.execute();
        con.close();
    }
    public void eliminarProducto(String id)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");
        
        CallableStatement comando=con.prepareCall("{call eliminarProducto(?)}");
        comando.setString("_id", id);
        comando.execute();
        con.close();
    }
    public void modificarProducto(Producto prod, String unidad, String idBuscar)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");
        
        CallableStatement comando=con.prepareCall("{call modificarProducto(?,"
                                                    + "?,?,?,?,?,?,?,?)}");
        comando.setString("_id_producto",prod.getCodigo().toUpperCase());
        comando.setString("_nombre",prod.getNombre());
        comando.setString("_UnidMedida",unidad);
        BigDecimal bd=new BigDecimal(prod.getPrecio());
        bd=bd.setScale(2,RoundingMode.HALF_UP);
        comando.setBigDecimal("_precio", bd);
        comando.setString("_descripcion", prod.getDescripcion());
        comando.setInt("_stock",prod.getStock());
        comando.setInt("_tipo", prod.getTipo());
        comando.setInt("_stokcMinimo", prod.getMinimoStock());
        comando.setString("_idB", idBuscar);
        comando.execute();
        con.close();
    }
    public void incrementarStock(int stock,String cod)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");
        
        CallableStatement comando=con.prepareCall("{call incrementarStock(?,"
                                                    + "?)}");
        comando.setInt("_stock",stock);
        comando.setString("_id_producto",cod);
        comando.execute();
        con.close();
    }
}
