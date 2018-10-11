/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author PC
 */
public abstract class Persona {
    
   
        
    private int tipoUsuario;
    
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private String dni;
    private String direccion;
    private int telefono;
    private String email;
    private int estado;
    //format date

    private Date fecha_ingreso;
    private String IDUsuario;
    private String password;
    private String respuestaConfimacion;
    
}
