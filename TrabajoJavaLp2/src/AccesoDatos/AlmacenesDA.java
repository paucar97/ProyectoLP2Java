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
import modelo.Almacen;
import modelo.Medida;

/**
 *
 * @author MARTIN RAMIREZ
 */
public class AlmacenesDA {
    public AlmacenesDA(){
        
    }
    public ArrayList<Almacen> listarAlmacenes()throws Exception{
        ArrayList<Almacen> almacenes=new ArrayList<Almacen>();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");
        
            Statement cadena=con.createStatement();
            String sql="SELECT * FROM n_almacen";
            ResultSet rs=cadena.executeQuery(sql);
            Medida med;
            while(rs.next()){
                int codigo=rs.getInt("id_almacen");
                String direccion=rs.getString("direccion");
                int num = rs.getInt("numProdDif");
                int estado=rs.getInt("estado");
                Almacen almacen=new Almacen(codigo,direccion,num,estado);
                if(almacen.getEstado()==1)
                    almacenes.add(almacen);
               
            }
            con.close();
       
        return almacenes;
    }
    public void insertarAlmacen(String fecha, String direccion,int num)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");
        
        Statement cadena=con.createStatement();
        String sql="INSERT INTO n_almacen(fecha,direccion,numProdDif) VALUES('"+fecha+"','"+direccion+"','"+num+"')";
        cadena.executeUpdate(sql);
        con.close();
    }
    public void eliminarAlmacen(int id)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");
        
        Statement cadena=con.createStatement();
        String sql="UPDATE n_almacen SET estado='0' WHERE id_almacen='"+id+"'";
        cadena.executeUpdate(sql);
        con.close();
    }
}
