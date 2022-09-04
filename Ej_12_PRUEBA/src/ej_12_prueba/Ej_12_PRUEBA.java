/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_12_prueba;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class Ej_12_PRUEBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese dos números");
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        System.out.println("El menor número entre los ingresados es: "+Math.min(num1 , num2));
        
        multiplo(num1,num2);
    }
    public static void multiplo(int n1, int n2){
        if(n1%n2==0){
            System.out.println("El primer número es múltiplo del segundo");
            
        } else{System.out.println("El primer número no es múltiplo del segundo número");}
            
    }
}
