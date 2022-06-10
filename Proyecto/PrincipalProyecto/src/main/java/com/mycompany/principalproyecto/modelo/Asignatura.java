/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalproyecto.modelo;

/**
 *
 * @author HP
 */
public class Asignatura {
    private String nombre; 
    private String codigo; 
    private int horas;
    private int nivel;
    private String tipo; 

    public Asignatura(String nombre, String codigo, int horas, int nivel, String tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horas = horas;
        this.nivel = nivel;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", codigo=" + codigo + ", horas=" + horas + ", nivel=" + nivel + ", tipo=" + tipo + '}';
    }
    
    
    
    
}
