/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.circulo;

import java.util.Scanner;

/**
 *
 * @author Windows 7
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner (System.in); 
             int Circulo1x,Circulo2x, Circulo2y, Circulo1y, Radio1, Radio2, Distancia;
             
                    System.out.println("Digite las coordenadas del circulo 1. X & Y respectivamente");
                    Circulo1x=s.nextInt();
                    Circulo1y=s.nextInt();
                    System.out.println("Digite el radio del circulo 1");
                    Radio1=s.nextInt();
                    
                    System.out.println("Digite las coordenadas del circulo 2. X & Y respectivamente");
                    Circulo2x=s.nextInt();
                    Circulo2y=s.nextInt();
                    System.out.println("Digite el radio del circulo 2");
                    Radio2=s.nextInt();

   Distancia=(Math.abs(Circulo1x-Circulo2x)+Math.abs(Circulo1y-Circulo2y));

   if (Distancia == Radio1 + Radio2){ 
      System.out.println ("Los circulos son tangenciales"); 
   }else{ 
      if (Distancia <Radio1 + Radio2){ 
        System.out.println ("Los circulos se superponen"); 
      }else{ 
         System.out.println ("Los circulos no se superponen"); 
       }
   }
    }
    
}
