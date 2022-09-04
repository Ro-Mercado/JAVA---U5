/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_10_prueba;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_10_PRUEBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in);
       int n1 = 0,n2= 0,n3= 0,n4= 0,num;
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un número entero");
            num=leer.nextInt();
            while(num<0 || num>20){
            System.out.println("Ingrese un número entero entre 0 y 20");
            num=leer.nextInt();
            }
            switch (i) {
                case 0: n1=num;
                    
                    break;
                case 1: n2=num;
                    
                    break;
                case 2:n3=num;
                    
                    break;
                case 3: n4=num;
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
        
        System.out.print(n1);
        for (int i = 0; i < n1; i++) {
            System.out.print("*");
        }
         System.out.println("");
        
        System.out.print(n2);
        for (int i = 0; i < n2; i++) {
            System.out.print("*");
        }
        
           System.out.println("");
           
        System.out.print(n3);
        for (int i = 0; i < n3; i++) {
            System.out.print("*");
        }
        
          System.out.println("");
          
        System.out.print(n4);
        for (int i = 0; i < n4; i++) {
            System.out.print("*");
        }
        
        
    }
    
}
