/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_7;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
        de n números (n>0). El valor de n se solicitará al principio del programa y los números
        serán introducidos por el usuario. Realice dos versiones del programa, una usando el
        bucle “while” y otra con el bucle “do - while”.*/
        
        //int n=validacionWhile();
        int n=validacionDoWhile();
        System.out.println(" ");
        numeros(n);
        
    }
    public static int validacionWhile(){
        Scanner leer= new Scanner(System.in);
  
        System.out.println("Ingrese cuantos números se van a ingresar");
        int n=leer.nextInt();
        
         while(n<=0){
            System.out.println("Por favor, ingrese una cantidad válida. Mayor a 0.");
            n=leer.nextInt();
        }
        return n;
    }
      public static int validacionDoWhile(){
         Scanner leer= new Scanner(System.in);
         int n;
          do {
              System.out.println("Ingrese cuantos números se van a ingresar");
              n=leer.nextInt();
          } while (n<=0);
          
        return n;
    }
    public static void numeros(int n){
        Scanner leer= new Scanner(System.in);
        int max=0,min=0,num;
        float acum=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el número "+(i+1));
            num=leer.nextInt();
            acum+=num;
            if(i==0){
                max=num;
                min=num;
            }
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
            
        }
        System.out.println("\nEl valor MÁXIMO entre los números ingresados es: "+max);
        System.out.println("El valor MÍNIMO entre los números ingresados es: "+min);
        System.out.println("El valor PROMEDIO de los números ingresadoe es: "+acum/n);
        
    }
}
