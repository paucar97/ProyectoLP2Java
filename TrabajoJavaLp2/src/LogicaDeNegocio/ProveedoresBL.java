/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

import AccesoDatos.ProveedoresDA;
import java.util.ArrayList;
import modelo.Proveedor;

/**
 *
 * @author MARTIN RAMIREZ
 */
public class ProveedoresBL {
    private ProveedoresDA provedorDA;
    public ProveedoresBL(){
        this.provedorDA=new ProveedoresDA();
    }
    public ArrayList<Proveedor>listarProveedores()throws Exception{
        return provedorDA.listarProveedores();
    }
}
