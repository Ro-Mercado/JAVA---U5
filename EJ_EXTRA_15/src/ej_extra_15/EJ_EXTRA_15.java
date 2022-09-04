/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_15;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
        restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
        matemática y deben devolver sus resultados para imprimirlos en el main.*/
        Scanner leer= new Scanner(System.in);
        System.out.println(">>Ingrese el primer número");
        int n0=leer.nextInt();
        System.out.println(">>Ingrese el segundo número");
        int n1=leer.nextInt();
        menu(n0,n1);
        
    }
    public static void menu(int n0, int n1){
        Scanner leer= new Scanner(System.in);
        int op;
        char op2;
        boolean salir=false;
        while(salir!=true){
        System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println(">Introduzca una opción");
            op=leer.nextInt();
        
        switch (op) {
                case 1:
                    System.out.println("1. Sumar");
                    System.out.println(n0+"+"+n1+"="+sumar(n0,n1));
                    break;
                case 2:
                    System.out.println("2. Restar");
                    System.out.println(n0+"-"+n1+"="+restar(n0,n1));
                   break;
                case 3:
                    System.out.println("3. Multiplicar");
                    System.out.println(n0+"x"+n1+"="+multiplicar(n0,n1));
                    break;
                case 4:
                    System.out.println("4. Dividir");
                    System.out.println("Resultado Truncado:");
                    System.out.println(dividirTrunc(n0,n1));
                    System.out.println("Resultado:");
                    System.out.println(dividir(n0,n1));
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa? s=si/n=no");
                    op2=leer.next().charAt(0);
                    if((op2=='s') || (op2=='S'))
                    {salir=true;
                    } 
                    break;
                default:
                    System.out.println("Opción ingresada incorrecta");
                }
        
         System.out.println("\nPresione una letra y enter para continuar");
            char c=leer.next().charAt(0);
        }
       
    }
    public static int sumar(int n0, int n1){
        return n0+n1;
    }
     public static int restar(int n0, int n1){
        return n0-n1;
    }
     public static int multiplicar(int n0, int n1){
        return n0*n1;
    }
    public static int dividirTrunc(int n0, int n1){
        if(n0>=n1){
            System.out.print(n0+":"+n1+"=");
        return n0/n1;}
        else{System.out.print(n1+":"+n0+"=");
            return n1/n0;}
    }
     public static float dividir(int n0, int n1){
        float a=n0,b=n1;
        if(a>=b){
            System.out.print(n0+":"+n1+"=");
        return a/b;}
        else{System.out.print(n1+":"+n0+"=");
            return b/a;}
    }
}
