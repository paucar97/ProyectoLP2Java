/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Modelo.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Medida;

/**
 *
 * @author MARTIN RAMIREZ
 */
public class UsuarioDA {
    public UsuarioDA(){
    }
    public ArrayList<Usuario>listarUsuarios()throws Exception{
        ArrayList<Usuario>usuarios=new ArrayList<Usuario>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");

        Statement cadena=con.createStatement();
        String sql="SELECT * FROM n_usuarios";
        ResultSet rs=cadena.executeQuery(sql);
        while(rs.next()){
            int tipo = rs.getInt("tipoUsuario");
            String idUsuario=rs.getString("IDusuario");
            String contraseña=rs.getString("contrasenia");
            int estado=rs.getInt("estado");
            int ingreso=rs.getInt("logeado");
            String respuestaC=rs.getString("respuestaConfirmacion");
            Usuario user=new Usuario(tipo, idUsuario, contraseña, estado, ingreso, respuestaC);
            if(user.getEstado()==1){
                usuarios.add(user);
            }
        }
        con.close();
        return usuarios;
    }
    public void cambiarContraseña(String contra, String respuesta)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");
        
        CallableStatement comando=con.prepareCall("{call cambiarContrasenia(?,?)}");
        comando.setString("_contrasenia",contra);
        comando.setString("_respuesta", respuesta);
        comando.execute();
        con.close();
    }
    public void iniciarSesion(String idUser, int estado)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://quilla.lab.inf.pucp.edu.pe/inf282g5","inf282g5","qRs7ue");
        
        CallableStatement comando=con.prepareCall("{call iniciarSesion(?,?)}");
        comando.setString("_idUsuario",idUser);
        comando.setInt("_estado", estado);
        comando.execute();
        con.close();
    }
}
