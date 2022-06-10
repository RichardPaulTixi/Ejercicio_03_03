/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.principalproyecto.Servicio;

import com.mycompany.principalproyecto.modelo.Calificacion;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ICalificacionServicio {
    public Calificacion crear(Calificacion calificacion);
    public List<Calificacion> listar();
    
}
