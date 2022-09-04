/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_23;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
        que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
        20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
        será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
        rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
        por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
        de Java substring(), Length() y Math.random().*/
        Scanner leer= new Scanner(System.in);
        String[][] sopa=new String[20][20];
        String palabra;
       
        for(int i=0; i< 5; i++) {
            System.out.println("Introduzca una palabra entre 3 y 5 letras");
            palabra=leer.next();
                while (palabra.length()<3 || palabra.length()>5){
                System.out.println("Por favor, introduzca una palabra válida de entre 3 y 5 letras");
                palabra=leer.next();
                }
                int l=(int)(Math.random()*15);
                int k=(int)(Math.random()*15);
                
                while(sopa[l][k]!=null && sopa[l][k+(palabra.length()-1)]!=null){
                 l=(int)(Math.random()*15);
                 k=(int)(Math.random()*15);}    
            
            asignarFila(sopa,palabra,l,k);
        }
       
        // mostrarSopa(sopa);
         System.out.println("________________________________________________________");
         rellenarVacio(sopa);
         mostrarSopa(sopa);
    }
    public static void asignarFila(String[][] sopa, String palabra, int l, int k){
        for (int j = 0; j < palabra.length(); j++) {
            sopa[l][k]=palabra.substring(j,j+1);
            k++;
        }
    }
    public static void mostrarSopa(String[][] sopa){
        for (String[] fila : sopa) {
            for (String elem: fila) {
                System.out.print("["+elem+"]");
            }
            System.out.println("");
        }
    }
    public static void rellenarVacio(String[][] sopa){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(sopa[i][j]==null){
                    //sopa[i][j]=Integer.toString((int)(Math.random()*9));
                   sopa[i][j]="-";
            }
        }
   
    
    }
        
 }
}
