/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_17_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_17_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/ 
        
        Scanner leer= new Scanner (System.in);    
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
        int[] vec= new int[n];
       
        rellenarRandom(vec,n);
        contabilizar(vec,n);
    }
    
    public static void rellenarRandom(int[] vec, int n){ //RELLENA Y MUESTRA
         for (int i = 0; i < n; i++) {
            vec[i]=(int)(Math.random()*11111);
        }
         for (int i=0 ; i <n; i++) {
            System.out.print("["+vec[i]+"]");
        }
         System.out.println("");
        
    }
    
    public static void contabilizar(int[] vec, int n){
        int[] cont=new int[5];
        String numcadena;
        cereaCont(cont);
        
          for (int i = 0; i < n; i++) {
            numcadena=String.valueOf(vec[i]);
            
            switch (numcadena.length()) {
                    case 1:
                        cont[0]+=1;
                    break;
                    
                    case 2:
                        cont[1]+=1;
                    break;
                        
                    case 3:
                        cont[2]+=1;
                    break;
                    
                    case 4:
                        cont[3]+=1;
                    break;
                    
                    case 5:
                        cont[4]+=1;
                    break;
                    
                default:
                    throw new AssertionError();
            }
        }
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Números con "+(i+1)+" dígitos: "+cont[i]);
        }
          
    }
    
    public static void cereaCont(int[] c){
         for (int i = 0; i < 5; i++) {
            c[i]=0;
        }
    }
    
    
}
