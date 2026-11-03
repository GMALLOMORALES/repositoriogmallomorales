/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasclase;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class practicaswitchaplicaciones {
    public static void main(String args[]){
     Scanner verOpcion = new Scanner(System.in);   
        System.out.println("Introduce 1 para calcular el area de un rectangulo");
        System.out.println("Introduce para ver multiplos de tres");     
     int opcion = verOpcion.nextInt();
     
        switch(opcion){
        case 1: System.out.println("dame la base");
        Scanner verMedida = new Scanner(System.in);
        int base = verMedida.nextInt();
            System.out.println("dame la altura");
        int altura = verMedida.nextInt();
            System.out.println("el area del rectangulo es " + base*altura);
        case 2: System.out.println("dame un numero");
       Scanner verNum = new Scanner(System.in);
       int numero = verNum.nextInt();
       if (numero%3==0){
           System.out.println("el numero es multiplo de 3");
       }else{
           System.out.println("el numero no es multiplo de 3");
       }
       
        }
    }
    
    
    
    
    
}
