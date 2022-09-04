/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Una obra social tiene tres clases de socios:
        o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
        todos los tipos de tratamientos.
        o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
        los mismos tratamientos que los socios del tipo A.
        o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
        tratamientos.
        o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
        real que represente el costo del tratamiento (previo al descuento) y determine el
        importe en efectivo a pagar por dicho socio.*/ 
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la clase de socio (A,B,C)");
        char clase=Character.toUpperCase(leer.next().charAt(0));
     
        
        while(clase!='A' && clase!='B' && clase!='C'){
            System.out.println("Por favor ingrese una clase de socio válida(A,B o C) ");
            clase=Character.toUpperCase(leer.next().charAt(0));
        }
        System.out.println("Ingrese el costo del tratamiento a realizarse");
        float costo=leer.nextFloat();
        importe(clase,costo);
        
    }
    public static void importe(char clase, float costo){
        switch (clase) {
            case 'A':
                System.out.println("El socio pertenece a la clase A");
                System.out.println("Debe abonar con un 50% de descuento");
                System.out.println("IMPORTE FINAL: $ "+(costo*0.5));
                
                break;
            case 'B':
                System.out.println("El socio pertenece a la clase B");
                System.out.println("Debe abonar con un 35% de descuento");
                System.out.println("IMPORTE FINAL: $ "+(costo-(costo*0.35)));
                
                break;
            case 'C':
                System.out.println("El socio pertenece a la clase C");
                System.out.println("Debe abonar sin descuento");
                System.out.println("IMPORTE FINAL: $ "+costo);
                break;
            default:
                throw new AssertionError();
        }
    }
}
