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
public class hallardivisores {
     public static void main(String args[]){
     
    //mostrar los multpiplos de 3 entre dos numeros que introduce el usuario
    Scanner verN = new Scanner(System.in);
         System.out.println("dame el primer numero");
 int n = verN.nextInt();
         System.out.println("dame el segundo numero");
         
 int m = verN.nextInt();
 int i = n;
 if(n>m){
     System.out.println("el primer numero debe ser menor que el segundo");
 }
 System.out.println("---------");
 while(i<=m){
     if(i%3==0){
         System.out.println(i);
        
     }
      i++;
 }
     
     
 }
    
}
