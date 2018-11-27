/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

import AccesoDatos.UsuarioDA;
import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author MARTIN RAMIREZ
 */
public class UsuarioBL {
    private UsuarioDA usuarioDA;
    public UsuarioBL(){
        this.usuarioDA=new UsuarioDA();
    }
    public ArrayList<Usuario>listarUsuarios()throws Exception{
        return usuarioDA.listarUsuarios();
    }
    public void cambiarContraseña(String contra,String respuesta)throws Exception{
        usuarioDA.cambiarContraseña(contra,respuesta);
    }
}
