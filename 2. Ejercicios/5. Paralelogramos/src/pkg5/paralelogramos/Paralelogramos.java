/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.paralelogramos;

import java.util.Scanner;

/**
 *
 * @author LabingXEON
 */
public class Paralelogramos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String Palabra;
        int Longitud;
        
       
        do{
            
        System.out.println("Ingrese una palabra de maximo 10 letras");
        Palabra=s.nextLine();  
        Longitud=Palabra.length();
        
        }while(Longitud>=10);
        

        
        
    }
    
}
