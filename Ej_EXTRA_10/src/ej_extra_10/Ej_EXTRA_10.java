/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_10;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class Ej_EXTRA_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
        dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
        si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
        al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java.*/
        Scanner leer= new Scanner(System.in);
        int n1=generarnum();
        int n2=generarnum();
       
        System.out.println("RESULTADO MULTIPLICACION "+n1+"*"+n2+"="+(n1*n2));
        adivinar(n1,n2);
    }
    public static int generarnum(){
        int n=(int)(Math.random()*10);
        return n;
    }
    public static void adivinar(int n1, int n2){
        Scanner leer= new Scanner(System.in);
        int m;
        do {
        System.out.println("\nIngrese un resultado posible para la multiplicación ");
        m=leer.nextInt();
        if(m==(n1*n2)){
            System.out.println("\nRESPUESTA CORRECTA");
        } else{
            System.out.println("\nRESPUESTA INCORRECTA");
        }
        } while (m!=(n1*n2));
        
    }
}
