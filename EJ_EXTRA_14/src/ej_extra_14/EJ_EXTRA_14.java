/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_14;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
        hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
        de hijos para averiguar la media de edad de los hijos de todas las familias.*/
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int n=leer.nextInt();
        int acum=0,hijos=0,edad,cont=0;
        for (int i = 0; i < n; i++) {
            System.out.print("\n>>Para la familia "+(i+1));
            System.out.println(",ingrese la cantidad de hijos");
            hijos=leer.nextInt();
            cont+=hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.println("\n>>> Ingrese la edad para el "+(j+1)+" hijo, de la familia "+(i+1));
                edad=leer.nextInt();
                acum+=edad;
            }
             
        }
        System.out.println("\nLa media de edad de los hijos de todas las familias es: "+acum/cont);
    }
    
}
