/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_24;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que complete un vector con los N primeros números de la sucesión
        de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
        números:
        1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        Donde cada uno de los números se calcula sumando los dos anteriores a él.
        Algoritmo Ej_Fibonacci_Funciones_U3_EXTRA7
	Definir num Como Entero
	
	Escribir "Ingrese un número entero"
	Leer num
	
	Escribir "La sucesión de Fibonacci de " num " es: " Fibonacci(num)
	
FinAlgoritmo

Funcion actual <- Fibonacci(num)
	Definir actual, i como Entero
	Definir anterior1, anterior2 Como Entero
	actual=1
	anterior1 = 0
	anterior2 = 1

	si num==0
		actual=0
	SiNo
		Para i = 1 hasta num Hacer
				Si actual<>num
					Escribir actual, ", " Sin Saltar
					actual = anterior1 + anterior2
					anterior1 = anterior2
					anterior2 = actual
				Finsi
		FinPara
	FinSi

FinFuncion
        */
        
         Scanner leer= new Scanner(System.in);
         System.out.println("Ingrese un número para obetener su sucesión");
         int num=leer.nextInt();
         System.out.print("La sucesión de Fibonacci de "+num+" es: ");
         System.out.println(fibonacci(num));
        
        
        
    }
    public static int fibonacci(int num){
        int actual=1,anterior1=0,anterior2=1;
        if(num==0){
            actual=0;
        }
        else{
            for (int i = 0; i < num; i++) {
                if (actual!=num) {
                    System.out.print(actual+",");
                    actual=anterior1+anterior2;
                    anterior1=anterior2;
                    anterior2=actual;
                }
            }
        }
        return actual;
    }
}
