/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_20;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
        parámetro. Después haremos otra función o procedimiento que imprima el vector.*/ 
        Scanner leer= new Scanner(System.in);
        System.out.println("Definir el tamaño del arreglo");
        int n=leer.nextInt();
        int[] a=new int[n];
        rellenar(n,a);
        mostrar(a);
       
    }
    public static void rellenar(int n, int[] a){
        for (int i = 0; i <a.length; i++) {
            a[i]=(int) (Math.random()*10);
        }
    }
    public static void mostrar(int[] a){
        for (int elem: a)//Para mejorado - PARA DE MATRICES MEJORADO -> for(int[] filas:Matriz)// para cada fila de matriz //{ for(int elem: filas)//para cada elem de la fila//{}}
        {
            System.out.print("["+elem+"]");
        }
        System.out.println("");
    }
    
}
