/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Proveedor;

/**
 *
 * @author MARTIN RAMIREZ
 */
public class ProveedoresDA {
   public ProveedoresDA(){
        
   }
   public ArrayList<Proveedor> listarProveedores()throws Exception{
        ArrayList<Proveedor> proveedores=new ArrayList<Proveedor>();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");
        
            Statement cadena=con.createStatement();
            String sql="SELECT * FROM n_proveedores";
            ResultSet rs=cadena.executeQuery(sql);
            while(rs.next()){
                String razon=rs.getString("nombre_empresa");
                String email=rs.getString("email");
                int ruc = rs.getInt("ruc");
                int telefono=rs.getInt("telefono");
                String direccion=rs.getString("direccion");
                int estado=rs.getInt("estado");
                Proveedor proveedor=new Proveedor(ruc,razon,direccion,telefono,email,estado);
                if(proveedor.getEstado()==1)
                proveedores.add(proveedor);
               
            }
            con.close();
       
        return proveedores;
    } 
}
