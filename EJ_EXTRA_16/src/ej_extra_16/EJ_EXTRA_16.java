/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_16;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
            las personas ingresadas por teclado e indique si son mayores o menores de edad.
            Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
            mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/
           
         Scanner leer= new Scanner(System.in);
         System.out.println("Ingrese la cantidad de personas");
         int n=leer.nextInt();
         
         String[] nombres=new String[n];
         int[] edad=new int[n];
         
         completar(n,nombres,edad); 
         mostrar(n,nombres,edad);
    }
    public static void completar(int n, String[] nombres, int[]edad){
        Scanner leer= new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            System.out.println("\n>>Ingrese el nombre para la persona "+(i+1));
            nombres[i]=leer.next();
            System.out.println(">>Ingrese la edad para la persona "+(i+1));
            edad[i]=leer.nextInt();
            System.out.println("");
        }
        
    }
    
    public static void mostrar(int n,String[] nombres, int[] edad){
         Scanner leer= new Scanner(System.in);
         String resp;
         boolean op=true;
         int i=0;
         while(i<n && op==true){
             System.out.println("\nNOMBRE Y EDAD DE LA PERSONA "+(i+1));
             System.out.print("Nom: "+nombres[i]);
             System.out.println(" Edad: "+edad[i]);
             if(edad[i]>=18){
                 System.out.println("Persona mayor de edad");
             }
             i+=1;
             if(i<n){
             System.out.println("\n>¿Desea seguir mostrando personas?");
             resp= leer.next();
             if(resp.equalsIgnoreCase("No") ){
                 op=false;
             }
             }
             
         }
         
    }
    
}
