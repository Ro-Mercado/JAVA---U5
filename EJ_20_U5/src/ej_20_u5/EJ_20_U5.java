/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_20_u5;

import java.util.Scanner;


/**
 *
 * @author Rochii
 */
public class EJ_20_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.*/
        
        
        int[][] mat= new int [3][3];
        int[] Filas=new int[3];
        int[] Col=new int[3];
        int Diag, DiagInv;
        Llenar_mat(mat);
        Cerea(Filas,Col);
        sumFil(mat,Filas);
        sumCol(mat,Col);
        Diag=sumDiag(mat);
        DiagInv=sumInv(mat);
        magic(mat,Filas,Col, Diag, DiagInv);
    }
    public static void Llenar_mat(int[][] mat){
        int num;
    Scanner leer= new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 System.out.println("Ingrese número");
                 num=leer.nextInt();
                if(num<10){
                mat[i][j]=num;}
                else{
                    System.out.println("Número incorrecto");    
                j-=1;
                }
            }
        }
    
    }
    public static void Cerea(int[] Filas,int[] Col){
        for (int i = 0; i < 3; i++) {
            Filas[i]=0;
            Col[i]=0;
        }
    
    }
    public static void sumFil(int[][] mat, int [] Filas){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Filas[i]=mat[i][j]+Filas[i];
            }           
        }
            
        }
    
    public static void sumCol(int[][] mat, int[] Col){
    for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                Col[j]=mat[j][i]+Col[j];
            }           
        }
    }
    public static int sumDiag(int[][] mat){
        int sum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if(i==j){
                sum+=mat[i][j];}
            }
        }
        return sum;
    
    }
    
    public static int sumInv(int[][] mat){
        int sum=0,i=0;
        for (int j = 2; j >=0; j--) { 
            sum+=mat[i][j];
            i+=1;
        }
        return sum;
    }
    public static void magic(int[][] mat, int[] Filas, int[] Col, int Diag, int Inv){
        boolean band=true;
        for (int i = 0; i <3; i++) {
            if(Filas[i]==Col[i] && Diag==Inv && Col[i]==Diag && Filas[i]==Inv){
                band=true && band;
            }
            else{band=false && band;}
        }
        if(band==true){
        System.out.println("ES UNA MATRIZ MÁGICA"); 
        }
        else{System.out.println("LA MATRIZ INGRESADA NO ES MÁGICA");}
    }

}