/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_19_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_19_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
        matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
        signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
        denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
         Scanner leer= new Scanner (System.in); 
         int[][] matriz=new int [3][3]; 
         int[][] matb=new int[3][3];
         
        Llenar_matriz(matriz);
        System.out.println("");
        Trasponer_matriz(matriz,matb);
        comparar(matriz,matb);
    }
    
    public static void Llenar_matriz(int[][]matriz){
        Scanner leer= new Scanner (System.in); 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.println("Ingrese un número");
                matriz[i][j]=leer.nextInt();    
            }  
        }
        for (int i=0 ; i <3; i++) {
             for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]"); 
             }
            System.out.println("");
        }
    }
    public static void Trasponer_matriz(int[][] matriz, int[][]matb){
        //para trasponer de una hacer un mostrar con m[j][i] 
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                matb[j][i]=matriz[i][j];
            }  
        }
         for (int i=0 ; i <3; i++) {
             for (int j = 0; j < 3; j++) {
                System.out.print("["+matb[i][j]+"]"); 
             }
            System.out.println("");
        }
    }
    
    public static void comparar(int [][] matriz, int [][]matb){
        boolean band=true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j]==(-1)*matb[i][j]) {
                    band=true && band;
                }
                else{
                    band=band && false;//Reemplazar con While para mejor práctica y no usar un break
                   
                }
            }
             
        }
        
        if (band==true){
            System.out.println("LA MATRIZ ES ANTISIMÉTRICA");
            
        }
        else{System.out.println("LA MATRIZ NO ES ANTISIMÉTRICA");}
        
        
       
    }
    
}
