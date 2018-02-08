/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Blanco
 */
public class jugadores {
    List<objetoJugadores> listjugadores;

    public jugadores() {
        this.listjugadores= new ArrayList<>();
    }
    
    /**
     *
     * @param nombre, nombre del jugador recivida
     * @param edad, edad del jugador recivida
     * @param estatura, estatura del jugador recivida
     * @param peso, pedo del jugador recivido
     */
    public void agregar(String nombre,int edad,double estatura,double peso){
        objetoJugadores objju = new objetoJugadores(nombre, edad, estatura, peso);
        this.listjugadores.add(objju);
        JOptionPane.showMessageDialog(null, "Jugador ingresado");
        
    }
    
    /**
     * Metodo edad que compara cual es la menor edad entre los jugadores
     */
    public void edad(){
        int edad=1000000;
        String nombre="";
        try{
            for(objetoJugadores temp : this.listjugadores)
            {
                if (temp.getEdad() < edad) {
                    edad=temp.getEdad();
                    nombre=temp.getNombre();
                }
            }
            if (edad ==1000000 && nombre =="") {
               JOptionPane.showMessageDialog(null,"No ha ingresado nada aun, por favor ingrese jugadores");
            } else {
               JOptionPane.showMessageDialog(null,"El jugador con menor edad es " + nombre + " con la edad de " +edad+ " años");
            }
            
        }
        catch(Exception ex)
        {
            System.out.println("Ha ocurrido un error: " + ex);
        }
    }
    
    /**
     *Metodo estatura para verificar que jugador tiene mayor estatura
     */
    public void estatura(){
        double estatura=0.0;
        String nombre="";
        
        try{
            for(objetoJugadores temp : this.listjugadores)
            {
                if (temp.getEstatura()> estatura) {
                    estatura=temp.getEstatura();
                    nombre=temp.getNombre();
                }
            }
            if (estatura ==0.0 && nombre =="") {
               JOptionPane.showMessageDialog(null,"No ha ingresado nada aun, por favor ingrese jugadores");
            } else {
               JOptionPane.showMessageDialog(null,"El jugador con mayor estatura es " + nombre + " con la estatura "
                       + "de " + estatura + " metros");
            }
            
        }
        catch(Exception ex)
        {
            System.out.println("Ha ocurrido un error: " + ex);
        }
    }
    
    /**
     *Metodo peso para verficiar cual es el jugador con mayor peso
     */
    public void peso(){
        double peso=0.0;
        String nombre="";
        
        try{
            for(objetoJugadores temp : this.listjugadores)
            {
                if (temp.getPeso()> peso) {
                    peso=temp.getPeso();
                    nombre=temp.getNombre();
                }
            }
            if (peso ==0.0 && nombre =="") {
               JOptionPane.showMessageDialog(null,"No ha ingresado nada aun, por favor ingrese jugadores");
            } else {
               JOptionPane.showMessageDialog(null,"El jugador con mayor peso es " + nombre + " con el peso "
                       + "de " + peso + " libras");
            }
            
        }
        catch(Exception ex)
        {
            System.out.println("Ha ocurrido un error: " + ex);
        }
    }
}
