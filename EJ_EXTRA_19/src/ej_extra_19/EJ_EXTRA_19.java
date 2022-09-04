/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_19;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
        comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
        elementos).*/ 
        Scanner leer= new Scanner(System.in);
        System.out.println("Definir el tamaño de los vectores");
        int n=leer.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        cargar(n,a, b);
        mostrar(n,a);
        mostrar(n,b);
        comprobar(n,a,b);
        
    }
    public static void cargar(int n, int[] a, int[] b){
        Scanner leer= new Scanner(System.in);
        System.out.println("CARGA VECTOR 1");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un número");
            a[i]=leer.nextInt();
        }
        System.out.println("\nCARGA VECTOR 2");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un número");
            b[i]=leer.nextInt();
        }
    }
    public static void mostrar(int n, int[] a){
        for (int i = 0; i <n; i++) {
            System.out.print("["+a[i]+"]");
        }
        System.out.println("");
    }
    public static void comprobar(int n, int[] a, int[] b){
       int i=0;
       while(i<n && a[i]==b[i]){
           i+=1;
       }
       if(i==n){
           System.out.println("LOS ARREGLOS SON IGUALES");
       }else{System.out.println("Los arreglos son DIFERENTES");}
    }
}
