/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_17;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
        por parámetro para que nos indique si es o no un número primo, debe devolver true si es
        primo, sino false.
        Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
        primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/ 
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num=leer.nextInt();
        boolean result=primo(num);
        if(result){
            System.out.println("El número es primo");
        }else{
            System.out.println("El número NO es primo");
        }
    }
    public static boolean primo(int num){
        boolean r=true;
        for (int i = 2; i <num; i++) {
            
            if(num%i==0){
                System.out.println("El número es divisible por "+i);
                r=false;
                break;
            }
           
        }
        return r;
    }
}
