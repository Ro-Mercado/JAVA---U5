/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_11_prueba;

import java.util.Scanner;

/**
 *
 * 
 */
public class EJ_11_PRUEBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner leer= new Scanner (System.in);
         
     String frase;
   
     frase=leer.nextLine();
        System.out.println(frase+"  Longitud de la fraae:"+frase.length());

        System.out.println("La frase new es: "+cambioFrase(frase));
    }
    public static String cambioFrase(String frase){
    String frase2="";
    String letra;
        for (int i = 0; i < frase.length(); i++) {
            letra=frase.substring(i, i+1);
            
            switch (letra) {
                case "a" :
                    frase2=frase2.concat("@");
                    break;
                case "e":
                    frase2=frase2.concat("#");
                    break;
                case "i":
                    frase2=frase2.concat("$");
                    break;
                case "o":
                    frase2=frase2.concat("%");
                    break;
                case "u":
                    frase2=frase2.concat("*");
                    break;
                default:
                   frase2=frase2.concat(letra);
            }
        }
        
    return frase2;
    }
}
