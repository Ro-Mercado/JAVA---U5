/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_4;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
        equivalente en romano.*/
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 10");
        int num=leer.nextInt();
        while(num<0 || num>10){
            System.out.println("Por favor ingrese un número entre 1 y 10");
            num=leer.nextInt();
        }
        romanos(num);
    }
    public static void romanos(int n){
        System.out.println("Número ingresado: "+n);
        System.out.print("Su equivalente en números romanos: ");
        switch (n) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                throw new AssertionError();
        }
    }
            
    
}
