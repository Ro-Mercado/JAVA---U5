/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_13_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_13_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
        cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * **/
        /*SOLUCION PABLO:
        System.out.println("");
        
        
        for (int j = 1; j < N-1; j++) {
            
        
        for (int k = 0; k < N; k++) {
if (k==0 || k==N-1) {
                
                System.out.print("*");   
                
            }
            else{
                System.out.print(" ");
            }
            
        }
        
        System.out.println("");
        }
for (int i = 0; i < N; i++) {   
            System.out.print("*");   
        
        }
        System.out.println("");
    }
    
}
for (int i = 0; i < N; i++) {   
            System.out.print("*"); 
System.out.println("");
        
        
        for (int j = 1; j < N-1; j++) {
            
        
        for (int k = 0; k < N; k++) {
if (k==0 || k==N-1) {
                
                System.out.print("*");   
                
            }
            else{
                System.out.print(" ");
            }
            
        }
        
        System.out.println("");
        }
for (int i = 0; i < N; i++) {   
            System.out.print("*");   
        
        }
        System.out.println("");
    }
    
}

        */
        
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese la longitud del lado");
        int n=leer.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>0 && i<n-1 && j>0 && j<n-1){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
             }
            System.out.println(" ");
        }
        
    }
    
}
