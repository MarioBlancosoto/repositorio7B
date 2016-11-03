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
public class Boletin7c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        int select;

        Figures obj = new Figures();
  
        
       
        

             
           select = Integer.parseInt(JOptionPane.showInputDialog("\n teclea 1 para el circulo \n teclea 2 para el cuadrado \n teclea 3 para el triangulo \n teclea 0 para salir "));
                 
      switch(select){
          
          case 1 : obj.circulo(0);
          break;
          case 2 : obj.cuadrado(0);
          break;
          case 3 : obj.triangulo(0, 0);
          break;
              
          default:
              System.out.println("Error,seleccione otro número ");
        
      }
        
    }
    
}
