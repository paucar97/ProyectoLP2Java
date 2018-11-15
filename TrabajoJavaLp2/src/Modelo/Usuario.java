/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MARTIN RAMIREZ
 */
public class Usuario {

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public String getRespuestaC() {
        return respuestaC;
    }

    public void setRespuestaC(String respuestaC) {
        this.respuestaC = respuestaC;
    }

    public Usuario() {
    }

    public Usuario(int tipo, String idUsuario, String contraseña, int estado, int ingreso, String respuestaC) {
        this.tipo = tipo;
        this.idUsuario = idUsuario;
        this.contraseña = contraseña;
        this.estado = estado;
        this.ingreso = ingreso;
        this.respuestaC = respuestaC;
    }
    
    private int tipo;
    private String idUsuario;
    private String contraseña;
    private int estado;
    private int ingreso;
    private String respuestaC;
    
}
