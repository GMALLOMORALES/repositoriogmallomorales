/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.pkg19;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class p25 {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
       System.out.println("dame una letra");
     String texto = sc.nextLine();
     
     
     char letra = texto.charAt(0);
    switch(letra){
        case 'a','e','i','o','u':System.out.println("vocal");break;
        default: System.out.println("consonante");
    }
     
     
      
       
   }
}
