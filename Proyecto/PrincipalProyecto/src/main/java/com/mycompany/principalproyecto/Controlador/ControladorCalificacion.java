/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalproyecto.Controlador;

import com.mycompany.principalproyecto.Servicio.CalificacionServicio;
import com.mycompany.principalproyecto.modelo.Calificacion;
import java.util.List;

/**
 *
 * @author HP
 */
public class ControladorCalificacion {
    
    private final CalificacionServicio calificacionServicio= new CalificacionServicio();
    
    public Calificacion crear(String [] params){
        var calificacion= new Calificacion(params[0],params[1],Integer.valueOf(params[2]),Integer.valueOf(params[3]));
        this.calificacionServicio.crear(calificacion);
        return calificacion;
    }
    
    public List<Calificacion> listar(){
        return this.calificacionServicio.listar();
    }
    
}
