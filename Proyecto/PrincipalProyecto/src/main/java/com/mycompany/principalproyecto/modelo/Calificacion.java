/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalproyecto.modelo;

/**
 *
 * @author HP
 */
public class Calificacion {
    
    private String rendimiento; 
    private String promedio; 
    private int porcentaje; 
    private int rango; 
    private Asignatura asignatura; 
    private Estudiante estudiante; 

    public Calificacion(String rendimiento, String promedio, int porcentaje, int rango) {
        this.rendimiento = rendimiento;
        this.promedio = promedio;
        this.porcentaje = porcentaje;
        this.rango = rango;
    }

    public String getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(String rendimiento) {
        this.rendimiento = rendimiento;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Calificacion{" + "rendimiento=" + rendimiento + ", promedio=" + promedio + ", porcentaje=" + porcentaje + ", rango=" + rango + '}';
    }

    
    
    
}
