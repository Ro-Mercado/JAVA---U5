/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_22;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
        muestre la suma de sus elementos.*/ 
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz. Primero n y luego el valor de m");
        int n=leer.nextInt();
        int m=leer.nextInt();
        int[][] a=new int [n][m];
        cargar(n,m,a);
        mostrar(a);
        suma(n,m,a);
    }
    public static void cargar(int n, int m, int[][]a){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=(int)(Math.random()*10);  
            }
        }
    }
    public static void mostrar(int[][] a){
        for (int[] filas:a) {
            for(int elem: filas){
                System.out.print("["+elem+"]");
            }
                System.out.println("");
        }
        System.out.println("");
    }
    
    public static void suma(int n,int m,int[][] a){
        int sum=0;
        for (int[] filas:a) {
            for(int elem: filas){
                sum+=elem;
            }
        }
        System.out.println("La suma de los elementos de la matriz: "+sum);
    }
}
