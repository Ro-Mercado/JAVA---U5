/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_24_intento2;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_24_INTENTO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*FIBONACCI
        Definir n Como Entero
	Escribir "Ingrese el numero n de la sucesión"
	Leer n 
	Escribir "La sucesión del número ", n, " se calcula sumando: ", SerieF(n), ")"
FinAlgoritmo

Funcion retorna<-SerieF(n)
	definir retorna,a,b,c,i Como Entero
	a=0
	b=1
	Para i<-1 Hasta n-1 Hacer
		
		retorna=a+b
		a<-b
		b<-retorna
		
	FinPara
	
	Escribir Sin Saltar "f(", a,")"
	Escribir Sin Saltar "+ f(", b-1,")"
	Escribir Sin Saltar "= f("
FinFuncion*/ 
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el número n de la sucesión");
        int n=leer.nextInt();
        System.out.print("La sucesión del número "+n+" es: ");
        serieF(n);
        
        
    }
    public static void serieF(int n){
        int  a=0,b=1,c;
        System.out.print(b+" , ");
        for (int i = 0; i < n; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" , ");
        }
    }
    
}
