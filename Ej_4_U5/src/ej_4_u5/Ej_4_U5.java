/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_4_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class Ej_4_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        //Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese grados centígrados");
        float cent=leer.nextFloat();
        float fahr=32+((9*cent)/5);
        System.out.println("Grados Centígrados: "+cent);
        System.out.println("Grados Fahrenheit: "+fahr);
        
    }
    
}
