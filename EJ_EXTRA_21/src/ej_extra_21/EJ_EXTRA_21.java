/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_21;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
        adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
        desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
        prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
        programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
        desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
        igual al 7 de sus notas del curso.*/ 
        Scanner leer= new Scanner(System.in);
        float[] prom=new float [3];
        notas(prom);
        cantAprob(prom);
    }
    public static void notas(float[] prom){
        Scanner leer= new Scanner(System.in);
        float acum=0,nota;
        int cont=0;
        System.out.println("CARGA DE NOTAS DE ALUMNOS");
        for (int i = 0; i < prom.length; i++) {
             System.out.println("\nALUMNO "+(cont+1));
            cont++;
            for (int j = 0; j <4; j++) {
                switch (j) {
                    case 0:
                        System.out.println(">>Ingrese la nota del Primer Trabajo Práctico Evaluativo");
                        nota=leer.nextInt();
                        acum=(float) (nota*0.1);
                        break;
                    case 1:
                        System.out.println("\n>>Ingrese la nota del Segundo Trabajo Práctico Evaluativo");
                        nota=leer.nextInt();
                        acum+=nota*0.15;
                        break;
                    case 2:
                        System.out.println("\n>>Ingrese la nota del Primer Integrador");
                        nota=leer.nextInt();
                        acum+=nota*0.25;
                        break;
                    case 3:
                        System.out.println("\n>>Ingrese la nota del Segundo Integrador");
                        nota=leer.nextInt();
                        acum+=nota*0.5;
                        break;
                    
                }
                
                
            }
            
            prom[i]=acum;
        }
    }
 public static void cantAprob(float[] prom){
        int ap=0,ds=0;
     for (int i = 0; i < prom.length; i++) {
         if(prom[i]>=7){
                ds++;}
            else{
                ap++;}
     }

        System.out.println("\n>>Cantidad de aprobados: "+ap);
        System.out.println("\n>>Cantidad de desaprobados: "+ds);
    }
    }
    


