/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principalproyecto.Vista;

import com.mycompany.principalproyecto.Controlador.ControladorAsignatura;
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
public class VentanaAsignatura extends JFrame implements ActionListener{
    
    private List<JLabel> jlabelList;
    private List<JTextField> jtextfieldList;
    private List<JButton> jbuttonList;
    private List<JPanel> jpanellist; 
    private JPanel jpanel1;
    private ControladorAsignatura controladorAsignatura = new ControladorAsignatura();

    public VentanaAsignatura(String title) throws HeadlessException {
        super(title);
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jpanel1);
    }
    
    public void iniciarComponentes(){
        this.jpanel1=new JPanel();
        this.jpanel1.setLayout(new GridLayout(5,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTexto();
        this.iniciarBotones();
    }
    
    public void iniciarPaneles(){
        this.jpanellist=new ArrayList<>();
        this.jpanellist.add(new JPanel());
        this.jpanellist.add(new JPanel());
        this.jpanellist.add(new JPanel());
        this.jpanellist.add(new JPanel());
        this.jpanellist.add(new JPanel());
        
        this.jpanel1.add(this.jpanellist.get(0));
        this.jpanel1.add(this.jpanellist.get(1));
        this.jpanel1.add(this.jpanellist.get(2));
        this.jpanel1.add(this.jpanellist.get(3));
        this.jpanel1.add(this.jpanellist.get(4));
        
    }
    
    public void iniciarEtiquetas(){
        this.jlabelList=new ArrayList<>();
        this.jlabelList.add(new JLabel("Ingrese Nombre de la Asignatura: "));
        this.jlabelList.add(new JLabel("Ingrese codigo de la Asignatura: "));
        this.jlabelList.add(new JLabel("Ingrese #horas de la Asignatura: "));
        this.jlabelList.add(new JLabel("Ingrese Nivel de la Asignatura: "));
        this.jlabelList.add(new JLabel());
        this.jpanellist.get(0).add(this.jlabelList.get(0));
        this.jpanellist.get(1).add(this.jlabelList.get(1));
        this.jpanellist.get(2).add(this.jlabelList.get(2));
        this.jpanellist.get(3).add(this.jlabelList.get(3));
    }
    
    public void iniciarTexto(){
        this.jtextfieldList=new ArrayList<>();
        this.jtextfieldList.add(new JTextField());
        this.jtextfieldList.add(new JTextField());
        this.jtextfieldList.add(new JTextField());
        this.jtextfieldList.add(new JTextField());
        
        this.jtextfieldList.get(0).setColumns(20);
        this.jtextfieldList.get(1).setColumns(20);
        this.jtextfieldList.get(2).setColumns(20);
        this.jtextfieldList.get(3).setColumns(20);
        this.jpanellist.get(0).add(this.jtextfieldList.get(0));
        this.jpanellist.get(1).add(this.jtextfieldList.get(1));
        this.jpanellist.get(2).add(this.jtextfieldList.get(2));
        this.jpanellist.get(3).add(this.jtextfieldList.get(3));
    }
    
    public void iniciarBotones(){
        this.jbuttonList=new ArrayList<>();
        this.jbuttonList.add(new JButton("Guardar"));
        this.jbuttonList.add(new JButton("Listar"));
        this.jpanellist.get(4).add(this.jbuttonList.get(0));
        this.jpanellist.get(4).add(this.jbuttonList.get(1));
        this.jbuttonList.get(0).addActionListener(this);
        this.jbuttonList.get(1).addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.jbuttonList.get(0))){
        String [] params =new String[5];
        params[0]=this.jtextfieldList.get(0).getText();
        params[1]=this.jtextfieldList.get(1).getText();
        params[2]=this.jtextfieldList.get(2).getText();
        params[3]=this.jtextfieldList.get(3).getText();
        params[4]="basica";
        
        this.controladorAsignatura.crear(params);
        this.jtextfieldList.get(0).setText("");
        this.jtextfieldList.get(1).setText("");
        this.jtextfieldList.get(2).setText("");
        this.jtextfieldList.get(3).setText("");
        this.jtextfieldList.get(4).setText("");
        }
        
        if(e.getSource().equals(this.jbuttonList.get(1))){
            System.out.println(this.controladorAsignatura.listar().toString());
        }
    }
    
}
