/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author julio
 */
public class RecordJugador extends JFrame implements ActionListener{
    JLabel lblnombrejuga, lbltiempoju, lblhorainicio, lblfechaju,etiqueta;
    JButton regresar;
    public RecordJugador(){
        this.setTitle("Record de Jugador");
        this.setSize(1010, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        //agregamos panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        etiqueta = new JLabel("Tu Record");
        etiqueta.setBounds(430,60,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        panel.add(etiqueta);
        
        etiqueta = new JLabel("Nombre Jugador: ");
        etiqueta.setBounds(320,180,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //este label obtendra el nombre del jugador colocado anteriormente
        lblnombrejuga = new JLabel("nombre");
        lblnombrejuga.setBounds(480,180,150,40);
        lblnombrejuga.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblnombrejuga);
        
      
        
        regresar = new JButton("Regresar a Menu");
        regresar.setBounds(370,560,250,40);
        regresar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
        regresar.addActionListener(this);
        panel.add(regresar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //el boton regresar hara que regresemos a la ventana de menu
        if(e.getSource() == regresar){
            menuinicio ventana = new menuinicio();
            JuegoMemoria ventana2 = new JuegoMemoria();
            ventana2.setVisible(false);
            ventana.setVisible(true);
            this.setVisible(false);
        
        }
    }
    
}
