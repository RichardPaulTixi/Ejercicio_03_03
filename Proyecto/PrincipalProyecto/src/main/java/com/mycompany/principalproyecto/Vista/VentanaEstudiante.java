/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalproyecto.Vista;

import com.mycompany.principalproyecto.Controlador.ControladorEstudiante;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class VentanaEstudiante extends JFrame implements ActionListener{
    
    private JPanel jpanel3;
    private List<JPanel> jpanellist3;
    private List<JLabel> jlabellist3;
    private List<JTextField> jtextfield3; 
    private List<JButton> jbuttonlist3;
    private ControladorEstudiante controladorEstuadiante= new ControladorEstudiante();

    public VentanaEstudiante(String title) throws HeadlessException {
        super(title);
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jpanel3);
    }
    
    public void iniciarComponentes(){
        this.jpanel3=new JPanel();
        this.jpanel3.setLayout(new GridLayout(5,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTexto();
        this.iniciarBotones();
        
    }
    
    public void iniciarPaneles(){
        this.jpanellist3= new ArrayList<>();
        this.jpanellist3.add(new JPanel());
        this.jpanellist3.add(new JPanel());
        this.jpanellist3.add(new JPanel());
        this.jpanellist3.add(new JPanel());
        this.jpanellist3.add(new JPanel());
        
        this.jpanel3.add(this.jpanellist3.get(0));
        this.jpanel3.add(this.jpanellist3.get(1));
        this.jpanel3.add(this.jpanellist3.get(2));
        this.jpanel3.add(this.jpanellist3.get(3));
        this.jpanel3.add(this.jpanellist3.get(4));
    }
    
    public void iniciarEtiquetas(){
        this.jlabellist3=new ArrayList<>();
        this.jlabellist3.add(new JLabel("Ingrese Nombre: "));
        this.jlabellist3.add(new JLabel("Ingrese Carrera: "));
        this.jlabellist3.add(new JLabel("Ingrese Correo: "));
        this.jlabellist3.add(new JLabel("Ingrese Ciclo: "));
        this.jlabellist3.add(new JLabel());
        this.jpanellist3.get(0).add(this.jlabellist3.get(0));
        this.jpanellist3.get(1).add(this.jlabellist3.get(1));
        this.jpanellist3.get(2).add(this.jlabellist3.get(2));
        this.jpanellist3.get(3).add(this.jlabellist3.get(3));
    }
    
    public void iniciarTexto(){
        this.jtextfield3=new ArrayList<>();
        this.jtextfield3.add(new JTextField());
        this.jtextfield3.add(new JTextField());
        this.jtextfield3.add(new JTextField());
        this.jtextfield3.add(new JTextField());
        this.jtextfield3.get(0).setColumns(20);
        this.jtextfield3.get(1).setColumns(20);
        this.jtextfield3.get(2).setColumns(20);
        this.jtextfield3.get(3).setColumns(20);
        this.jpanellist3.get(0).add(this.jtextfield3.get(0));
        this.jpanellist3.get(1).add(this.jtextfield3.get(1));
        this.jpanellist3.get(2).add(this.jtextfield3.get(2));
        this.jpanellist3.get(3).add(this.jtextfield3.get(3));
    }
    
    public void iniciarBotones(){
        this.jbuttonlist3=new ArrayList<>();
        this.jbuttonlist3.add(new JButton("Guardar"));
        this.jbuttonlist3.add(new JButton("Listar"));
        this.jpanellist3.get(4).add(this.jbuttonlist3.get(0));
        this.jpanellist3.get(4).add(this.jbuttonlist3.get(1));
        this.jbuttonlist3.get(0).addActionListener(this);
        this.jbuttonlist3.get(1).addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.jbuttonlist3.get(0))){
            String [] params=new String[4];
            params[0]=this.jtextfield3.get(0).getText();
            params[1]=this.jtextfield3.get(0).getText();
            params[2]=this.jtextfield3.get(0).getText();
            params[3]=this.jtextfield3.get(0).getText();
            
            this.controladorEstuadiante.crearEstudiante(params);
            this.jtextfield3.get(0).setText("");
            this.jtextfield3.get(1).setText("");
            this.jtextfield3.get(2).setText("");
            this.jtextfield3.get(3).setText("");
        }
        
        if(e.getSource().equals(this.jbuttonlist3.get(1))){
            System.out.println(this.controladorEstuadiante.listarEstudiantes().toString());
        }
    
    }
    
    
    
    
}
