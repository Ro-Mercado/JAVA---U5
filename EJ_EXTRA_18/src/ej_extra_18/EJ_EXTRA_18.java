/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_18;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
        N, con los valores ingresados por el usuario.*/
        Scanner leer= new Scanner(System.in);
        System.out.println("Definir el tamaño del vector");
        int n=leer.nextInt();
        int[] vec=new int[n];
        int suma=cargar(n,vec);
        mostrar(n,vec);
        System.out.println("\nLa suma de todos los elementos del vector es: "+suma);
        
    }
    public static int cargar(int n, int[] vec){
         Scanner leer= new Scanner(System.in);
         int acum=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor "+(i+1));
            vec[i]=leer.nextInt();
            acum+=vec[i];
        }
        
        return acum;
    }
    public static void mostrar(int n, int[]vec){
        System.out.println("VECTOR:");
        for (int i = 0; i < n; i++) {
            System.out.print("["+vec[i]+"]");
        }
    }
   
}
