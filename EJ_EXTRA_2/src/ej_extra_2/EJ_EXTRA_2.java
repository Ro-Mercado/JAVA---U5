/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_2;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
        una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
        tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
        iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/ 
        int A=10,B=2,C=5,D=8;
        System.out.println("VALORES INICIALES DE LAS VARIABLES");
        mostrar(A,B,C,D);
        
        int aux;
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;  
        
        System.out.println("VALORES FINALES DE LAS VARIABLES");
        mostrar(A,B,C,D);
        
        
    }
    public static void mostrar(int A, int B, int C, int D){
        System.out.println("A: "+A+"\nB: "+B+"\nC: "+C+"\nD: "+D);
    }
    
}
