/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principalproyecto.Vista;

/**
 *
 * @author HP
 */
public class PrincipalProyecto {

    public static void main(String[] args) {
        
        var v1= new VentanaAsignatura("Asignatura");
        v1.setVisible(true);
        
        var v2= new VentanaCalificacion("Calificacion");
        v2.setVisible(true);
        
        var v3= new VentanaEstudiante("Estudiante");
        v3.setVisible(true);
    }
}
