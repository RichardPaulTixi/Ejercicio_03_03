/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalproyecto.Servicio;

import com.mycompany.principalproyecto.modelo.Asignatura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class AsignaturaServicio implements IasignaturaServicio{
    
    private final List<Asignatura> asignaturaList= new ArrayList<>();

    @Override
    public Asignatura crear(Asignatura asignatura) {
        this.asignaturaList.add(asignatura);
        return asignatura; 
       }

    @Override
    public List<Asignatura> listar() {
        return this.asignaturaList;
        
        }
    
    
}
