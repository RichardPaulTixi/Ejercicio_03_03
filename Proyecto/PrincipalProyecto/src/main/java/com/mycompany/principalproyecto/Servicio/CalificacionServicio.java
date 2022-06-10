/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalproyecto.Servicio;

import com.mycompany.principalproyecto.modelo.Calificacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class CalificacionServicio implements ICalificacionServicio{
    
    private final List<Calificacion> calificacionlist= new ArrayList<>();

    @Override
    public Calificacion crear(Calificacion calificacion) {
        this.calificacionlist.add(calificacion);
        return calificacion;
        }

    @Override
    public List<Calificacion> listar() {
        return this.calificacionlist;
    }

    
    
}
