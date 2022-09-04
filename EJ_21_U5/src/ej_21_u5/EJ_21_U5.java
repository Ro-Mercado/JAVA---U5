/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_21_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_21_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
        3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
        dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
        se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
        que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
        la matriz M en la cual empieza el primer elemento de la submatriz P.*/
        int[][] m=new int[10][10];
        int[][] p=new int [3][3];
        cargar(m,10);//carga m con números random
        mostrar(m,10);
        //cargar(p,3);//carga p con números random
        cargarManual(p,3);
        mostrar(p,3);
        buscarMat(m,p);
    }
    public static void cargar(int[][] mat, int n){
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j]=(int)(Math.random()*10);
            }
            
        }
    }
    public static void cargarManual(int[][] mat, int n){
        Scanner leer= new Scanner(System.in);
        System.out.println("CARGA  MATRIZ P (MATRIZ + PEQUEÑA) \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("INGRESE UN NÚMERO");
                mat[i][j]=leer.nextInt();
            }
            
        }
    }
    public static void mostrar(int[][] mat, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+mat[i][j]+"]");  
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void buscarMat(int[][] m,int [][]p){
        boolean band=false;
        int k=0,l=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               if(band==false && i<8 && j<8){
                if(m[i][j]==p[0][0])
                {band=verificacionMat(i,j,m,p);
                k=i;
                l=j;
                }}
            }
        }
        
      // System.out.println("Bandera: "+band);
        if(band==false){System.out.println("MATRIZ P NO ENCONTRADA");}
        else{System.out.println("MATRIZ P ENCONTRADA.");
             System.out.println("Se encuentra en los índices"); muestraIndex(k,l);}
    }

   public static boolean verificacionMat(int i, int j, int[][] m, int[][] p){
       int a=0;
       int b=0;
       boolean band=true;
       
       for (int k =i; k < (i+3); k++) {
           for (int  l= j; l < (j+3); l++) {
               
               if(m[k][l]==p[a][b]){
                   band=true && band;
               }
               else{band=false && band;}
               b+=1;
           }
           a+=1;
           b=0;
       }
       return band;
   }
   public static void muestraIndex(int k, int l){

       for (int i = k; i < (k+3); i++) {
           for (int j = l; j < (l+3); j++) {
               System.out.print(" ("+i+","+j+") ");
           }
       }
       System.out.println("");
   }
      
    
}
