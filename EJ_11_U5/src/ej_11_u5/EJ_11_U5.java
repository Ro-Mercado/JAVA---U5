/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_11_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_11_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un programa que pida dos números enteros positivos por teclado y muestre por
            pantalla el siguiente menú:

            MENU
            1. Sumar
            2. Restar
            3. Multiplicar
            4. Dividir
            5. Salir
            Elija opción:

            El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
            y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
            Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
            directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
            desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
            programa, caso contrario se vuelve a mostrar el menú.*/
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese dos números enteros");
        float n0=leer.nextInt(), n1=leer.nextInt();
        boolean salir=false;
        int op;
        char op2;
        
        //menu
        while(salir!=true){
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Introduzca una opción");
            op=leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("1. Sumar");
                    System.out.println(n0+"+"+n1+"="+(n0+n1));
                    break;
                case 2:
                    System.out.println("2. Restar");
                    System.out.println(n0+"-"+n1+"="+(n0-n1));
                   break;
                case 3:
                    System.out.println("3. Multiplicar");
                    System.out.println(n0+"x"+n1+"="+(n0*n1));
                    break;
                case 4:
                    System.out.println("4. Dividir");
                    System.out.println(n0+":"+n1+"="+(n0/n1));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa? s=si/n=no");
                    op2=leer.next().charAt(0);
                    if((op2=='s') || (op2=='S'))
                    {salir=true;
                    } 
                    break;
                default:
                    System.out.println("Opción ingresada incorrecta");;
            }
        
            System.out.println("Presione una letra y enter");
            char c=leer.next().charAt(0);
        }
        
        
    }
    
}
