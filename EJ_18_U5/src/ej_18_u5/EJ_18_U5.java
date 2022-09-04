/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_18_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_18_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
        traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
        cambiando sus filas por columnas (o viceversa). */ 
       Scanner leer= new Scanner (System.in); 
       int[][] matriz=new int [3][3]; 
       int[][] matb=new int[3][3];
       
       rellenar(matriz);
       traspuesta(matriz,matb);
       mostrar(matriz);
       mostrar(matb);
       
    }
    
    public static void rellenar(int[][] matriz ){
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                matriz[i][j]=(int)(Math.random()*11);
            }  
        }
    }
    
    public static void traspuesta(int[][] matriz,int[][] matb){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                matb[j][i]=matriz[i][j];
            } 
        }
    }
    
    public static void mostrar(int[][] matriz){
         for (int i=0 ; i <3; i++) {
             for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]"); 
             }
            System.out.println("");
        }
         System.out.println("");
    }
    
    
}
