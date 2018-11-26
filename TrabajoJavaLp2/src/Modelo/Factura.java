/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Factura extends Venta {
    private int nuGuia;
    private int nPedido;
    private double valor_neto;
    private double total_imp;
    private double pagoVendedor;
    private int estadoPagoVendedor;
    private ArrayList<DetalleFactura> detallesFactura; 
}
