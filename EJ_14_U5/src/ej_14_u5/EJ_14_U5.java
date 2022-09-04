/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_14_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_14_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
        * 0.86 libras es un 1 €
        * 1.28611 $ es un 1 €
        * 129.852 yenes es un 1 €*/ 
         Scanner leer= new Scanner (System.in);
         System.out.println("Introduzca los euros a convertir");
         float eu=leer.nextFloat();
         System.out.println("Introduzca la moneda a la que desea convertir:dolares,yenes o libras");
         String moneda=leer.next();
         conversion(eu,moneda);
        
        
    }
    
    public static void conversion(float e, String moneda){
        switch (moneda) {
            case "dolares":
                System.out.println("EUROS:"+e+ "€");
                System.out.println("DÓLARES:"+(e*1.02)+"$");
                break;
            case "yenes":
                System.out.println("EUROS:"+e+ "€");
                System.out.println("YENES:"+(e*141.07)+"¥");
               break;
            case "libras":
                 System.out.println("EUROS:"+e+ "€");
                System.out.println("LIBRAS:"+(e*0.85)+"£");
               break;
            default:
                System.out.println("Moneda ingresada incorrecta");
        }
    }
    
}
