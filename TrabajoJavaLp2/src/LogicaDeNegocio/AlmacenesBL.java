/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

import AccesoDatos.AlmacenesDA;
import java.util.ArrayList;
import modelo.Almacen;

/**
 *
 * @author MARTIN RAMIREZ
 */
public class AlmacenesBL {
    private AlmacenesDA almacenDA;
    public AlmacenesBL(){
        this.almacenDA=new AlmacenesDA();
    }
    public ArrayList<Almacen> listarAlmacenes()throws Exception{
        return almacenDA.listarAlmacenes();
    }
    public void insertarAlmacen(String fecha, String direccion)throws Exception{
        almacenDA.insertarAlmacen(fecha,direccion);
    }
}
