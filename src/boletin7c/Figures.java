/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7c;

import javax.swing.JOptionPane;

/**
 *
 * @author mblancosoto
 */
public class Figures {
    
      private float lado,base,altura,radio,triangulo,cuadrado,circulo;
    private final double Pi=3.14;
    
    
    
    public Figures(){
        
        
    }
    
    public Figures(float lado,float base,float altura,float radio){
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
       
    }
    
    
    
    public void cuadrado(float lado){
        lado = Float.parseFloat(JOptionPane.showInputDialog(" inserte el valor de lado"));
        System.out.println("El area del cuadrado es "+lado*lado);
    }
    
    public void circulo (float radio){
        radio = Float.parseFloat(JOptionPane.showInputDialog("Inserte el valor del radio "));
        System.out.println(" el area de la circunferencia es "+ Pi*Math.pow(radio,2));
    }
    
    
    public void triangulo(float base,float altura){
        base = Float.parseFloat(JOptionPane.showInputDialog(" inserte el valor de la base "));
        altura = Float.parseFloat(JOptionPane.showInputDialog(" Inserte la altura " ));
        System.out.println(" el area del triangdulo es  "+ (base*altura)/2);
        
    }
    
    
    
    
}
