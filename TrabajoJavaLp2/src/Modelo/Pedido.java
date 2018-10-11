/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author PC
 */
public class Pedido extends Venta {
    private Date horaFechaImp;
    private EtapaPedido etapa;
    private String patida;
    private String llegada;
    private ArrayList<DetallePedido> detallesPedido;
}
