/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_1;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos");
        int tiempo=leer.nextInt();
        calcularDia(tiempo);
        
    }
    public static void calcularDia(int tiempo){
        int dia,horas,min;
        dia=(tiempo/60)/24;
        min=tiempo-(1440*dia);
        horas=min/60;// Al ser una operacion con enteros se trunca 
        //horas=(int) Math.floor(min/60);//floor: redondeo para abajo ||| ceil: redondeo para arriba
        System.out.println("Dados "+tiempo+" minutos"+"\nEquivalen a: "+dia+" día/s, "+horas+" horas/s");
        
        
    }
    
}
