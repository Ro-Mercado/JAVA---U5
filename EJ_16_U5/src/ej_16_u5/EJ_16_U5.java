/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_16_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_16_U5 {

    /**
     * @param args the command line arguments
     */public static void main(String[] args) {
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
        usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        numero y si se encuentra repetido*/
       Scanner leer= new Scanner (System.in);    
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
        int[] vec= new int[n];
        rellenar(vec,n);
        busqueda(vec,n);
    }
     public static void rellenar(int[]vec, int n){
         for (int i = 0; i < n; i++) {
            vec[i]=(int)(Math.random()*11);
        }
         for (int i=0 ; i <n; i++) {
            System.out.print("["+vec[i]+"]");
        }
     }
     public static void busqueda(int[]vec,int n){
         Scanner leer= new Scanner (System.in); 
        System.out.println("\nIngrese un número a buscar");
        int b=leer.nextInt();
        int i=0,c=0;
        boolean encontrado=false;
        while(i<n){
            
            if(b==vec[i]){
                System.out.println("El número "+b+" se encuentra en la posición "+i);
                c+=1;
                encontrado=true || encontrado;
            }else{encontrado=encontrado || false;}
            
            i+=1;
            
        }
        
        if (c>1){
            System.out.println("El número buscado está repetido");
        }
        if(encontrado==false){System.out.println("El número no fue encontrado");}
     }
    
}
