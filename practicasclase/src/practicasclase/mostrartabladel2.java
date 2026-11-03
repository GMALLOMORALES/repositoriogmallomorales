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
public class mostrartabladel2 {
   public static void main(String args[]){
       Scanner verNum = new Scanner(System.in);
       System.out.println("de que numero quieres ver su tabla");
       int num = verNum.nextInt();
       int mult = 1;
       while(mult<=10){
           System.out.println(num + " * " + mult + " = " + num*mult);
           mult++;
       }
       
       
   }
    
    
}
