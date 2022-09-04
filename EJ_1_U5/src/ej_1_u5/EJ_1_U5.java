/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_1_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_1_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("HOLA");
        /*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/
        int a,b,c;
       
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese dos números enteros");
        //int a=leer.nextInt();
        //int b=leer.nextInt();
        a=leer.nextInt();
        b=leer.nextInt();
        c=a+b;
                        
        System.out.println("La suma es "+a+"+"+b+"="+c);   
       
    }
    
}
