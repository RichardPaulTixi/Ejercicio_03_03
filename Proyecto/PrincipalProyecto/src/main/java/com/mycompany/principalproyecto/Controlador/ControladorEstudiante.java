/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalproyecto.Controlador;

import com.mycompany.principalproyecto.Servicio.EstudianteServicio;
import com.mycompany.principalproyecto.modelo.Estudiante;
import java.util.List;

/**
 *
 * @author HP
 */
public class ControladorEstudiante {
    private final EstudianteServicio estudianteServicio= new EstudianteServicio();
    
    public Estudiante crearEstudiante(String [] params){
        var estudiante= new Estudiante(params[0],params[1],params[2],Integer.valueOf(params[3]));
        this.estudianteServicio.crearEst(estudiante);
        return estudiante;
    }
    
    public List<Estudiante> listarEstudiantes(){
        return this.estudianteServicio.listarEst();
    }
    
}
