/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_2_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_2_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
      Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String nom=leer.nextLine();
        System.out.println("Nombre: "+nom);
      
    }
    
}
