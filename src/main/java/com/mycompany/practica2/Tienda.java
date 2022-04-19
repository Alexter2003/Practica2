/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.practica2;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class Tienda extends javax.swing.JFrame {

    static Pokemon[] pokemones = new Pokemon[10];
    private static int posicion;
    private static int dinero=100;
    /**
     * Creates new form Tienda
     */
    
    public Tienda() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Tienda");
        this.getContentPane().setBackground(getBackground());
    }
    
    public void aumentarDinero(){
        this.dinero+=50;
    }
    
    public String getDineroString(){
       String dinero= String.valueOf(this.dinero);
       return dinero;
    }

    public Pokemon getPokemones(int posicion) {
        return pokemones[posicion];
    }

    public int getPosicion() {
        return posicion;
    }

    public  void setDinero(int dinero) {
        Tienda.dinero -= dinero;
    }
    
    

    public JLabel getLabelOro() {
        return labelOro;
    }

    public JLabel getLabelOro1() {
        return labelOro1;
    }

    public JLabel getLabelOro2() {
        return labelOro2;
    }
    
    
    
    private void comprarComida(String comida, int precio, int aumento){
         try{
            if(this.dinero>=precio){
        int posicion=Integer.parseInt(TextFieldMascotaADarComida.getText());
        pokemones[posicion].restarHambre();
        pokemones[posicion].setEfectoComida(comida);
        pokemones[posicion].aumentarHambreMaxima(aumento);
        this.dinero-=precio;
        String dinero= String.valueOf(this.dinero);
        labelOro.setText(dinero);
        
            }else{
                JOptionPane.showMessageDialog(this,"No tienes dinero suficiente");
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(this,"No tienes ningun pokemon en esa posicion");
        }
    }
    
    private void curarEnfermedad(int medicamento, int precio){
        try{
            if(this.dinero>=precio){
                int posicion = Integer.parseInt(TextFielMascotaADarMedicamento.getText());
                pokemones[posicion].restarEnfermedades(medicamento);
                this.dinero-=precio;
                String dinero= String.valueOf(this.dinero);
                labelOro1.setText(dinero);
            }
            
        }catch(NullPointerException e){
        JOptionPane.showMessageDialog(this,"No tienes ningun pokemon en esa posicion");
    }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        BotonWafles = new javax.swing.JButton();
        BotonManzana1 = new javax.swing.JButton();
        BotonCereal1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelOro = new javax.swing.JLabel();
        TextFieldMascotaADarComida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        NoPokemonAComprar = new javax.swing.JTextField();
        BotonComprar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        NombrePokemon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        labelOro2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TextFielMascotaADarMedicamento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BotonVitamina = new javax.swing.JButton();
        BotonVitamina1 = new javax.swing.JButton();
        BotonVitamina2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        labelOro1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BotonWafles.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        BotonWafles.setText("Waffles");
        BotonWafles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonWaflesActionPerformed(evt);
            }
        });

        BotonManzana1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        BotonManzana1.setText("Manzana");
        BotonManzana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonManzana1ActionPerformed(evt);
            }
        });

        BotonCereal1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        BotonCereal1.setText("Cereal");
        BotonCereal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCereal1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel1.setText("Presione para comprar");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel2.setText("Oro:");

        labelOro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextFieldMascotaADarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldMascotaADarComidaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel4.setText("Mascota a dar comida");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(BotonManzana1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonCereal1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelOro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addComponent(BotonWafles, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1)))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(TextFieldMascotaADarComida, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldMascotaADarComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonManzana1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCereal1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonWafles, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelOro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Restaurante", jPanel1);

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel7.setText("Escriba el No. del pokemon ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NoPokemonAComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoPokemonAComprarActionPerformed(evt);
            }
        });

        BotonComprar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        BotonComprar.setText("Comprar");
        BotonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComprarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel8.setText("Apodo de tu pokemon");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NombrePokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePokemonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel9.setText("Oro:");

        labelOro2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NoPokemonAComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(NombrePokemon))
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(labelOro2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(210, 210, 210))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(NoPokemonAComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombrePokemon, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BotonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelOro2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Tienda Pokemon", jPanel3);

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel5.setText("Mascota a dar medicina");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextFielMascotaADarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFielMascotaADarMedicamentoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        jLabel3.setText("Presione para comprar");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BotonVitamina.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        BotonVitamina.setText("Analgesico");
        BotonVitamina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVitaminaActionPerformed(evt);
            }
        });

        BotonVitamina1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        BotonVitamina1.setText("Vitamina");
        BotonVitamina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVitamina1ActionPerformed(evt);
            }
        });

        BotonVitamina2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 18)); // NOI18N
        BotonVitamina2.setText("Antibiotico");
        BotonVitamina2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVitamina2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jLabel6.setText("Oro:");

        labelOro1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(BotonVitamina1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonVitamina, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonVitamina2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TextFielMascotaADarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(labelOro1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel3)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextFielMascotaADarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonVitamina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonVitamina1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonVitamina2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(labelOro1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(44, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Farmacia", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void BotonWaflesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonWaflesActionPerformed
        comprarComida("Waffles",50,10);
    }//GEN-LAST:event_BotonWaflesActionPerformed

    private void BotonManzana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonManzana1ActionPerformed
        comprarComida("Manzana",10,5);
    }//GEN-LAST:event_BotonManzana1ActionPerformed

    private void BotonCereal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCereal1ActionPerformed
        comprarComida("Cereal",30,7);
    }//GEN-LAST:event_BotonCereal1ActionPerformed

    private void TextFieldMascotaADarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldMascotaADarComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMascotaADarComidaActionPerformed

    private void TextFielMascotaADarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFielMascotaADarMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFielMascotaADarMedicamentoActionPerformed

    private void BotonVitaminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVitaminaActionPerformed
        curarEnfermedad(2,50);
    }//GEN-LAST:event_BotonVitaminaActionPerformed

    private void BotonVitamina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVitamina1ActionPerformed
        curarEnfermedad(1,20);
    }//GEN-LAST:event_BotonVitamina1ActionPerformed

    private void BotonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComprarActionPerformed
        
        int comprar = JOptionPane.showConfirmDialog(this,"Seguro que quieres comprar este pokemon");
        if(comprar==0){
            if(this.dinero>=50){
            pokemones[this.posicion]= new Pokemon();
            pokemones[this.posicion].setNombre(NombrePokemon.getText());
            int tipo=Integer.parseInt(NoPokemonAComprar.getText());
            pokemones[this.posicion].setTipo(tipo);
            pokemones[this.posicion].setImagen(tipo);
            pokemones[this.posicion].start();
            this.posicion=this.posicion+1;
            this.dinero-=50;
            String dinero= String.valueOf(this.dinero);
            labelOro2.setText(dinero);
            }else{
                JOptionPane.showMessageDialog(this,"No tienes dinero suficiente para comprar");
            }
            
        }

    }//GEN-LAST:event_BotonComprarActionPerformed

    private void NombrePokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrePokemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombrePokemonActionPerformed

    private void NoPokemonAComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoPokemonAComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoPokemonAComprarActionPerformed

    private void BotonVitamina2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVitamina2ActionPerformed
        curarEnfermedad(3,80);
    }//GEN-LAST:event_BotonVitamina2ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCereal1;
    private javax.swing.JButton BotonComprar;
    private javax.swing.JButton BotonManzana1;
    private javax.swing.JButton BotonVitamina;
    private javax.swing.JButton BotonVitamina1;
    private javax.swing.JButton BotonVitamina2;
    private javax.swing.JButton BotonWafles;
    private javax.swing.JTextField NoPokemonAComprar;
    private javax.swing.JTextField NombrePokemon;
    private javax.swing.JTextField TextFielMascotaADarMedicamento;
    private javax.swing.JTextField TextFieldMascotaADarComida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelOro;
    private javax.swing.JLabel labelOro1;
    private javax.swing.JLabel labelOro2;
    // End of variables declaration//GEN-END:variables

    
}