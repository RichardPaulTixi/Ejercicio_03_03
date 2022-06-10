/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalproyecto.Controlador;

import com.mycompany.principalproyecto.Servicio.AsignaturaServicio;
import com.mycompany.principalproyecto.modelo.Asignatura;
import java.util.List;

/**
 *
 * @author HP
 */
public class ControladorAsignatura {
    
    private final AsignaturaServicio asignaturaServicio= new AsignaturaServicio();
    
    public Asignatura crear(String [] params){
        var asignatura =new Asignatura(params[0],params[1],Integer.valueOf(params[2]),Integer.valueOf(params[3]),params[4]);
        this.asignaturaServicio.crear(asignatura);
        return asignatura;
    }
    
    public List<Asignatura> listar(){
        return this.asignaturaServicio.listar();
    }
    
}
