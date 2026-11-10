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
public class P41 {public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
            System.out.println("dame un texto");
            String texto = sc.nextLine();
            
             String textoinvertido = new StringBuilder(String.valueOf(texto)).reverse().toString(); 
            System.out.println(textoinvertido);
    
    }
    
}
