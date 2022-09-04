/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_10_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_10_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingres un número límite");
        int num=leer.nextInt();
        int suma=0;
        while(suma<num){
            System.out.println("Ingrese números a sumar");
            suma=leer.nextInt()+suma;
        }
        System.out.println("La suma total "+suma);
       
    }
    
}
