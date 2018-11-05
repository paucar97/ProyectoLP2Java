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
    public void insertarProveedor(Proveedor prov)throws Exception{
        provedorDA.insertarProveedor(prov);
    }
    public void eliminarProveedor(String ruc)throws Exception{
        provedorDA.eliminarProveedor(ruc);
    }
    public void modificarProveedor(Proveedor prov,String rucB,String ruc)throws Exception{
        provedorDA.modificarProveedor(prov,rucB,ruc);
    }
}
