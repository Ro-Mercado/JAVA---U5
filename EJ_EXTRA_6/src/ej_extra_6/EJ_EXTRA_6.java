/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_6;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
        debajo de 1.60 mts. y el promedio de estaturas en general.*/ 
         Scanner leer= new Scanner(System.in);
         System.out.println("Ingrese la cantidad de personas de las que desea leer la altura");
         int n=leer.nextInt();
         alturaPersonas(n);
    }
    public static void alturaPersonas(int n){
        Scanner leer= new Scanner(System.in);
        float sum=0, sum1_6=0;
        float prom1=0, prom2=0,m;
        int cont=0;
               
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la estatura en metros para la persona "+(i+1));
            m=leer.nextFloat();
            sum+=m;
            if (m<1.60) {
                sum1_6+=m;
                cont+=1;
            }
        }
        System.out.println("La estatura promedio que se encuentra por debajo de los 1.60 m es "+(sum1_6/cont)+" m");
        System.out.println("La estatura promedio en general es: "+(sum/n)+" m");
    }
}
