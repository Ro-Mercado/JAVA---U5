/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_8_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class Ej_8_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
        usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
        pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
        Nota: investigar la función Lenght() en Java.*/
        Scanner leer=new Scanner(System.in);
        String frase;
        
        do{
        System.out.println("Ingrese una frase");
        frase=leer.nextLine();
        if(frase.length()!=8){
            System.out.println("INCORRECTO- El largo de la frase o palabra no es 8 ");}
        else{System.out.println("CORRECTO- El largo de la frase es 8");}
            
        }while (frase.length()!=8);
    }
    
}
