/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.pkg19;

import java.util.Scanner;

/**
 *
 * @author Guillermo
 */

public class P39 { public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
            System.out.println("dame un numero mayor o igual que 10 o menor que 99");
            int numerin;
            do{
            numerin = sc.nextInt();
            
               if(numerin<10||numerin>99){
                   System.out.println("umero mayor o igual que 10 o menor que 99");
               }
                
            }while(numerin<10||numerin>99);
           
            String numero = new StringBuilder(String.valueOf(numerin)).reverse().toString();
            int evilnumerin = Integer.parseInt(numero);
            System.out.println(evilnumerin);
         
            
            

}
    
}
