/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_11;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero y devuelva el número de dígitos que
        componen ese número. Por ejemplo, si introducimos el número 12345, el programa
        deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
        de división. Nota: recordar que las variables de tipo entero truncan los números o
        resultados.*/ 
        Scanner leer= new Scanner(System.in);
         System.out.println("Ingrese un número entero");
         int num=leer.nextInt();
        
         cantDigitos(num);
         
    }
    public static void cantDigitos(int num){
        int cont=0;
        while (num>1){
            num=num/10;
            cont++;
        }
        System.out.println("La cantidad de dígitos del número ingresado es "+cont);
    }
    
}
