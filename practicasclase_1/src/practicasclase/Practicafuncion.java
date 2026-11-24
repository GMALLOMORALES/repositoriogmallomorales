/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasclase;

import java.util.Scanner;

/**
 *
 * @author Guillermo
 */
   
public class Practicafuncion {
     public static int suma(int num1, int num2){
        return num1+num2;     
    }
      public static int resta(int num1,int num2){
        return num1-num2;     
    }
      public static int producto(int num1,int num2){
        return num1*num2;     
    }
      public static int division(int num1,int num2){
        return num1/num2;     
    }
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Elige una funcion");
         System.out.println("1:suma\n2:resta\n3:multiplicacion\n4:division");
         int caso = sc.nextInt();
         System.out.println("Ahora dame dos numeros");
         System.out.println("Numero 1:");
         int num1 = sc.nextInt();
         System.out.println("Numero 2");
         int num2 = sc.nextInt();
         switch(caso){
             case 1: System.out.println("El resultado es: " + (suma(num1,num2)));break;
             case 2: System.out.println("El resultado es: " + (resta(num1,num2)));break;
             case 3: System.out.println("El resultado es: " + (producto(num1,num2)));break;
             case 4: System.out.println("El resultado es: " + (division(num1,num2)));break;
             if 
         }
         
         
         
    }
    //programa el usuario decide entre:
    //multiplicacion, suma, division, resta
    //introducir los dos numeros
    //se le muestra el resultado
    //usando funciones:
    //suma, producto resta y division
    

    
}
