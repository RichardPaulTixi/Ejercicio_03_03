/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.principalproyecto.Servicio;
import com.mycompany.principalproyecto.modelo.Asignatura;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IasignaturaServicio {
    public Asignatura crear(Asignatura asignatura);
    public List<Asignatura> listar(); 
    
    
}
