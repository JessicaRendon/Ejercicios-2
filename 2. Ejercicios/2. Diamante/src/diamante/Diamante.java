/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamante;

import java.util.Scanner;

/**
 *
 * @author Labing I5
 */
public class Diamante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Num,Mit,C=0,V,p;
        Scanner s=new Scanner(System.in);
        
        do{

            System.out.println("Ingrese un numero impar del 1 al 100");
            Num=s.nextInt();
       
        }while(Num%2==0);
          Mit=Num/2;
          int aux=Mit;
        char[][] Ast= new char[Mit+1][Num]; 
        V=Mit;
        for(int i=0; i<(Mit+1);i++){
            for(int j=0;j<Num;j++){ 
                 Ast[i][j]='*';
            }
        }
        for(int i=0; i<(Mit+1);i++){
            for(int j=0;j<Num;j++){  
                if(j<aux || j>V){
                    Ast[i][j]=' ';
                }
            }
            aux--;
            V++;
        }
        for(int i=0; i<(Mit+1);i++){
            for(int j=0;j<Num;j++){ 
                 System.out.print(Ast[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=Mit-1;i>-1;i--){
            for(int j=Num-1;j>=0;j--){
                System.out.print(Ast[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }
   
}
