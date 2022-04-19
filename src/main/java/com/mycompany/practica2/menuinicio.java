/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author julio
 */
public class menuinicio extends JFrame implements ActionListener{
    JLabel nomjudador,etiqueta;
    JButton creditos,iniciarjuego,salir;
    JTextField txtnomjugador;
   
    public menuinicio(){
        this.setTitle("Menu");
        this.setSize(1010, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        
        componentes();
    }
    
    //metodo que contiene todos los compoenentes de la ventana
    
    public void componentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        etiqueta = new JLabel("Juego de Memoria ");
        etiqueta.setBounds(380,60,250,60);
        etiqueta.setFont(new Font("Berlin Sans FB", Font.PLAIN, 30));
        panel.add(etiqueta);
        
        etiqueta = new JLabel("Nombre del pokemon ");
        etiqueta.setBounds(400,250,250,40);
        etiqueta.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //texto donde se coloca el nombre de jugador
        txtnomjugador = new JTextField();
        txtnomjugador.setBounds(300,300,400,40);
        txtnomjugador.setHorizontalAlignment(JTextField.CENTER);
        txtnomjugador.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
        panel.add(txtnomjugador);
        
        //boton iniciar juego, este mandara directamente a iniciar el juego 
        iniciarjuego = new JButton("Iniciar Juego");
        iniciarjuego.setBounds(370,400,250,40);
        iniciarjuego.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 15));
        iniciarjuego.addActionListener(this);
        panel.add(iniciarjuego);
        
        
        
        
        
        
    }
    
    //eventos de acción

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
       if(e.getSource() == iniciarjuego){
           
           
             if(txtnomjugador.getText().equals("")){
                 
             JOptionPane.showMessageDialog(null, "Escriba el nombre del pokemon que peleara");
             
            }else{
                 
                 JuegoMemoria ventana = new JuegoMemoria();
                 
                 ventana.nombreju.setText(txtnomjugador.getText());
                 
                 ventana.tiempo.start();
                 
                 ventana.setVisible(true);
                 
                 this.setVisible(false);
                 
                 
             }
        }
       
     
     
      
    }
}
