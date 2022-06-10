/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalproyecto.Vista;

import com.mycompany.principalproyecto.Controlador.ControladorCalificacion;
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
public class VentanaCalificacion extends JFrame implements ActionListener{
    
    private List<JLabel> jlabelList2;
    private List<JTextField> jtextfieldList2;
    private List<JButton> jbuttonList2;
    private List<JPanel> jpanellist2; 
    private JPanel jpanel2;
    private ControladorCalificacion controladorcalificacion = new ControladorCalificacion();

    public VentanaCalificacion(String title) throws HeadlessException {
        super(title);
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jpanel2);
    }
    
    public void iniciarComponentes(){
        this.jpanel2=new JPanel();
        this.jpanel2.setLayout(new GridLayout(5,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTexto();
        this.iniciarBotones();
       
        
    }
    public void iniciarPaneles(){
        this.jpanellist2=new ArrayList<>();
        this.jpanellist2.add(new JPanel());
        this.jpanellist2.add(new JPanel());
        this.jpanellist2.add(new JPanel());
        this.jpanellist2.add(new JPanel());
        this.jpanellist2.add(new JPanel());
        
        this.jpanel2.add(this.jpanellist2.get(0));
        this.jpanel2.add(this.jpanellist2.get(1));
        this.jpanel2.add(this.jpanellist2.get(2));
        this.jpanel2.add(this.jpanellist2.get(3));
        this.jpanel2.add(this.jpanellist2.get(4));
    }
    
    public void iniciarEtiquetas(){
        this.jlabelList2=new ArrayList<>();
        this.jlabelList2.add(new JLabel("Rendimiento: "));
        this.jlabelList2.add(new JLabel("Promedio:"));
        this.jlabelList2.add(new JLabel("Porcentaje: "));
        this.jlabelList2.add(new JLabel("Rango: "));
        
        this.jpanellist2.get(0).add(this.jlabelList2.get(0));
        this.jpanellist2.get(1).add(this.jlabelList2.get(1));
        this.jpanellist2.get(2).add(this.jlabelList2.get(2));
        this.jpanellist2.get(3).add(this.jlabelList2.get(3));
        
    }
    
    public void iniciarTexto(){
        this.jtextfieldList2=new ArrayList<>();
        this.jtextfieldList2.add(new JTextField());
        this.jtextfieldList2.add(new JTextField());
        this.jtextfieldList2.add(new JTextField());
        this.jtextfieldList2.add(new JTextField());
        
        this.jtextfieldList2.get(0).setColumns(20);
        this.jtextfieldList2.get(1).setColumns(20);
        this.jtextfieldList2.get(2).setColumns(20);
        this.jtextfieldList2.get(3).setColumns(20);
        
        this.jpanellist2.get(0).add(this.jtextfieldList2.get(0));
        this.jpanellist2.get(1).add(this.jtextfieldList2.get(1));
        this.jpanellist2.get(2).add(this.jtextfieldList2.get(2));
        this.jpanellist2.get(3).add(this.jtextfieldList2.get(3));
    }
    
    public void iniciarBotones(){
        this.jbuttonList2=new ArrayList<>();
        this.jbuttonList2.add(new JButton("Guardar"));
        this.jbuttonList2.add(new JButton("Listar"));
        this.jpanellist2.get(4).add(this.jbuttonList2.get(0));
        this.jpanellist2.get(4).add(this.jbuttonList2.get(1));
    }

    @Override
    public void actionPerformed(ActionEvent f) {
        if(f.getSource().equals(this.jbuttonList2.get(0))){
            String [] params= new String[4];
            params[0]=this.jtextfieldList2.get(0).getText();
            params[1]=this.jtextfieldList2.get(1).getText();
            params[2]=this.jtextfieldList2.get(2).getText();
            params[3]=this.jtextfieldList2.get(3).getText();
            
            this.controladorcalificacion.crear(params);
            this.jtextfieldList2.get(0).setText("");
            this.jtextfieldList2.get(1).setText("");
            this.jtextfieldList2.get(2).setText("");
            this.jtextfieldList2.get(3).setText("");
        }
        
        if (f.getSource().equals(this.jbuttonList2.get(1))){
            System.out.println(this.controladorcalificacion.listar().toString());
        }
    }
}
