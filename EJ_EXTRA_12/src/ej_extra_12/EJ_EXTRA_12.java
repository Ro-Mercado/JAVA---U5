/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_extra_12;

/**
 *
 * @author Rochii
 */
public class EJ_EXTRA_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*SOLUCION NICOLAS
        Scanner leer = new Scanner(System.in);
        int i, unidad, decena, centena;
        String numeroCadena;
        
        
        
        for (i=0;i<=999;i++){
            centena=i/100;
            decena=(i-centena*100)/10;
            unidad=i%10;
            //INTEGER== ENTERO TO STRING: https://lineadecodigo.com/java/digitos-de-un-numero/

            numeroCadena = (((Integer.toString(centena).concat("-")).concat(Integer.toString(decena))).concat("-")).concat(Integer.toString(unidad));
                 
            numeroCadena = numeroCadena.replace("3", "E");
            
            System.out.println(numeroCadena);      
        }
        */
        /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
        0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
        Ejemplo:
        0-0-0
        0-0-1
        0-0-2
        0-0-E
        0-0-4
        0-1-2
        0-1-E
        Nota: investigar función equals() y como convertir números a String.*/
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {   
                 if(i!=3){
                     System.out.print(i+"-");}
                 else{System.out.print("E-");}
                 if(j!=3){
                     System.out.print(j+"-");
                 }
                 else{System.out.print("E-");}
                 if(k!=3){
                     System.out.print(k);
                 }
                 else{System.out.print("E");}
                    System.out.println("");
                }
            }
        }
    }
}
    
