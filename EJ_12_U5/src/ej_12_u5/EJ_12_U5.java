/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_12_u5;

import java.util.Scanner;

/**
 *
 * @author Rochii
 */
public class EJ_12_U5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
        dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
        fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
        X y el último tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
        especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
        de FDE, que no respete el formato se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
        incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
        siguientes funciones de Java Substring(), Length(), equals().*/
        
        Scanner leer= new Scanner (System.in);
        
        System.out.println("DISPOSITIVO RS232 \n");
        String cadena;
        int c1=0,c2=0;
        
        
        System.out.println("Ingrese una cadena");
        cadena=leer.nextLine();
        cadena=cadena.toUpperCase();

        
        while(cadena.equals("&&&&&")==false){
        while((cadena.length()!=5) || (cadena.substring(0, 1).equals("X")) || (cadena.substring(0, 1).equals("O"))){
            
            if((cadena.substring(0, 1).equals("X")) && (cadena.substring(cadena.length()-1, cadena.length()).equals("O")) ){
                c1+=1;
            }else{
                c2+=1;}
            
            System.out.println("Ingrese una cadena válida (Con 5 letas que comience con X y culmine en O)");
            System.out.println("Si desea culminar Ingrese &&&&&");
            cadena=leer.nextLine().toUpperCase();
        }}
        
        System.out.println("Cantidad de lecturas correctas: "+c1+"\nCantidad de lecturas incorrectas: "+c2);
    }
    
}
