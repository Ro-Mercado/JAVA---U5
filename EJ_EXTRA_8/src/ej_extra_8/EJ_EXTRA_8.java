/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_8;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
        detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
        la cantidad de números impares. Al igual que en el ejercicio anterior los números
        negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/ 
       Scanner leer= new Scanner(System.in);
        int num,cont=1,pares=0,impares=0;
        System.out.println("Ingrese un número entero");
        num=leer.nextInt();
        
            while(num%5!=0 && num>0){
                if(num%2==0){
                    pares+=1;
                }else{
                    impares+=1;
                }
                System.out.println("Ingrese un número entero");
                num=leer.nextInt();
                cont+=1;
                
            }
            if(num%2==0){
                    pares+=1;
                }else{
                    impares+=1;
                }
        
        System.out.println("\nCantidad de números leídos: "+ cont);
        System.out.println("Cantidad de números leidos pares: "+pares);
        System.out.println("Cantidad de números leidos impares: "+impares);
                
        
    }
    
}
