/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Cliente;

/**
 *
 * @author Marie
 */
public class ClienteDA {
    
    public ArrayList<Cliente> ListarClientes() throws ClassNotFoundException, SQLException{
        
        //Estableciendo la conexión
        
        
        ArrayList<Cliente> listaclientes = new ArrayList<>();
        
            //registrar el Driver
        Class.forName("com.mysql.jdbc.Driver");
            //establecer la conexión
        Connection con = DriverManager.getConnection("jdbc:mysql://50.62.209.73/inf282", "inf282", "inf282lp2");
              
        
        Statement sentencia;
        sentencia = con.createStatement();
                
        String query =  "SELECT * FROM n_clientes";
        
        ResultSet rs = sentencia.executeQuery(query);
        
        while(rs.next()){
            
        Cliente cl = new Cliente();
        
        cl.DNI = rs.getString("dni");
        String nombres = rs.getString("nombres");
        String apellido_paterno = rs.getString("apellido_paterno");
        String apellido_materno = rs.getString("apellido_materno");
        System.out.println(dni +" "+nombres+" "+apellido_paterno+" "+
        apellido_materno);
        }
        con.close();
       
        return listaclientes;
     
    }
    
}
