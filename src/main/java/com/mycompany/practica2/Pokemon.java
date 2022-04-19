/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class Pokemon extends Thread  {

    private String nombre;
    private String efectoComida = "Ninguno";
    private String tipo;
    private String imagen;
    private boolean vivo = true;
    private int nivel = 1;
    private int batallasGanadas;
    private int enfermedades = 0;
    private int alimentado = 0;
    private int hambre = 0;
    private int hambreMaxima = 5;
    private int limpiar = 0;
    private int pasear = 0;
    private int paseoMaximo=4;
    private int tiempoDeVida;
    
    //getters y setters 
     public String getLimpiar() {
        String limpiar = String.valueOf(this.limpiar);
        return limpiar;
    }

    public String getPasear() {
        String pasear = String.valueOf(this.pasear);
        return pasear;
    }

    public String getEnfermedadString() {
        String enfermedades = String.valueOf(this.enfermedades);
        return enfermedades;
    }

    public void setEfectoComida(String efecto) {
        this.efectoComida = efecto;
    }
    
     public String getEfectoComida() {
        return this.efectoComida;
    }

    public String getTipo() {
        return tipo;
    }
    
     public void setTipo(int tipo) {
        switch (tipo) {
            case 1 -> {
                this.tipo = "Bulbasaur";
            }
            case 2 -> {
                this.tipo = "Ivysaur";
            }
            case 3 -> {
                this.tipo = "Venusaur";
            }
            case 4 -> {
                this.tipo = "Charmander";
            }
            case 5 -> {
                this.tipo = "Charmeleon";
            }
            case 6 -> {
                this.tipo = "Charizard";
            }
            case 7 -> {
                this.tipo = "Squirtle";
            }
            case 8 -> {
                this.tipo = "Wartortle";
            }
            case 9 -> {
                this.tipo = "Blastoise";
            }
            case 10 -> {
                this.tipo = "Caterpie";
            }

        }
    }

    public String getImagen() {
        return this.imagen;
    }

    public void setImagen(int tipo) {
        switch (tipo) {
            case 1 -> {
                this.imagen = "C:/Users/julio/Documents/Tareas universidad tercer semestre/intro a la progra/Practica2/src/main/java/com/mycompany/practica2/imagenes/bulbasaur .png";
            }
            case 2 -> {
                this.imagen = "C:/Users/julio/Documents/Tareas universidad tercer semestre/intro a la progra/Practica2/src/main/java/com/mycompany/practica2/imagenes/Ivysaur.png";
            }
            case 3 -> {
                this.imagen = "C:/Users/julio/Documents/Tareas universidad tercer semestre/intro a la progra/Practica2/src/main/java/com/mycompany/practica2/imagenes/Venusaur.png";
            }
            case 4 -> {
                this.imagen = "C:/Users/julio/Documents/Tareas universidad tercer semestre/intro a la progra/Practica2/src/main/java/com/mycompany/practica2/imagenes/Pokemon.png";
            }
            case 5 -> {
                this.imagen = "C:/Users/julio/Documents/Tareas universidad tercer semestre/intro a la progra/Practica2/src/main/java/com/mycompany/practica2/imagenes/Charmeleon.png";
            }
            case 6 -> {
                this.imagen = "C:/Users/julio/Documents/Tareas universidad tercer semestre/intro a la progra/Practica2/src/main/java/com/mycompany/practica2/imagenes/Charizard.png";
            }
            case 7 -> {
                this.imagen = "C:/Users/julio/Documents/Tareas universidad tercer semestre/intro a la progra/Practica2/src/main/java/com/mycompany/practica2/imagenes/Squirtle.png";
            }
            case 8 -> {
                this.imagen = "C:/Users/julio/Documents/Tareas universidad tercer semestre/intro a la progra/Practica2/src/main/java/com/mycompany/practica2/imagenes/Wartortle.png";
            }
            case 9 -> {
                this.imagen = "C:/Users/julio/Documents/Tareas universidad tercer semestre/intro a la progra/Practica2/src/main/java/com/mycompany/practica2/imagenes/Blastoise.png";
            }
            case 10 -> {
                this.imagen = "C:/Users/julio/Documents/Tareas universidad tercer semestre/intro a la progra/Practica2/src/main/java/com/mycompany/practica2/imagenes/Caterpie.png";
            }

        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getHambreString() {
        String hambre = String.valueOf(this.hambre);
        return hambre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNivelString() {
        String nivel = String.valueOf(this.nivel);
        return nivel;
    }
    public boolean isVivo() {
        return vivo;
    }

    
    
    public void cambiarEstado(boolean estado) {
        this.vivo = estado;
    }

    public void reiniciarHambre() {
        this.hambre = 0;
    }

   //procesos

    public void aumentarHambreMaxima(int aumento) {
        this.hambreMaxima = aumento;
    }

    public void restarHambre() {
        if (this.hambre >= 1) {
            this.hambre = this.hambre - 1;
        }
        this.alimentado++;
        pedirLimpieza();
    }

    public void restarEnfermedades(int medicamento) {
        if (this.enfermedades >= 1) {
            this.enfermedades -= medicamento;

        }
    }

    public void pedirComida() {
        if (vivo) {
            try {
                sleep(vecesPedirComida());
            } catch (InterruptedException ex) {
                Logger.getLogger(Pokemon.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, this.nombre + " tiene hambre");
            this.hambre++;
            if (this.hambre == this.hambreMaxima) {
                JOptionPane.showMessageDialog(null, this.nombre + " ha muerto de hambre :(");
                this.vivo = false;
                suspend();
            }
        }

    }

    public void pedirLimpieza() {
        if (this.alimentado == 2) {
            JOptionPane.showMessageDialog(null, this.nombre + " necesita que lo limpies");
            this.limpiar++;
            
        }
    }

    public void limpiar() {
        if (this.limpiar > 0) {
            this.limpiar--;
        } else {
            JOptionPane.showMessageDialog(null, this.nombre + " ya esta limpio");
        }
    }

    public void pedirCurar() {
        System.out.println(this.nombre + " esta enfermo");
        this.enfermedades++;

    }

    public void pedirPaseo() {
        try {
            sleep(vecesPedirPaseo());
        } catch (InterruptedException ex) {
            Logger.getLogger(Pokemon.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, this.nombre + " quiere pasear");
        this.pasear++;
        if (this.pasear == this.paseoMaximo) {
                JOptionPane.showMessageDialog(null, this.nombre + " se ha enfermado");
                this.enfermedades++;
                
            }

    }
    
    //tiempos

    public int vecesPedirComida() {
        if (this.nivel == 1) {
            return 60000;
        } else if (this.nivel == 2) {
            return 50000;
        } else if (this.nivel == 3) {
            return 30000;
        } else if (this.nivel == 4) {
            return 20000;
        } else {
            return 10000;
        }
    }

    public int vecesPedirPaseo() {
        if (this.nivel == 1) {
            return 60000;
        } else if (this.nivel == 2) {
            return 40000;
        } else if (this.nivel == 3) {
            return 30000;
        } else if (this.nivel == 4) {
            return 20000;
        } else {
            return 10000;
        }
    }

    //run
    @Override
    public void run() {
        while (true) {
            pedirComida();
            pedirPaseo();
        }

    }

}
