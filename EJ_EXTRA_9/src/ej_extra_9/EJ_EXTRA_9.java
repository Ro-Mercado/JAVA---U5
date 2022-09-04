/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_9;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Simular la división usando solamente restas. Dados dos números enteros mayores que
        uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
        Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
        resultado es el residuo, y el número de restas realizadas es el cociente.
        Por ejemplo: 50 / 13:
        50 – 13 = 37 una resta realizada
        37 – 13 = 24 dos restas realizadas
        24 – 13 = 11 tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/ 
        Scanner leer= new Scanner(System.in);
        int resto=99,cont=0;
        System.out.println("Ingresar dos números enteros para dividir");
        int n1=leer.nextInt();
        int n2=leer.nextInt();
        while (n1<1 || n2<1){
            System.out.println("Por favor ingrese dos números enteros mayores a 1");
            n1=leer.nextInt();
            n2=leer.nextInt();
        }
        System.out.print("DIVISON: ");
        if(n1>n2){
            System.out.println(n1+"/"+n2);
            while(resto>n2){
                resto=n1-n2;
                n1=resto;
                cont+=1;
            }
        }
        else{
            System.out.print(n2+"/"+n1);
            while(resto>n1){
                resto=n2-n1;
                n2=resto;
                cont+=1;
            }
        }
        
        System.out.println("\nRESULTADOS:");
        System.out.println("Residuo: "+resto+" Cociente:"+cont);
                
        
        
    }
    
}
