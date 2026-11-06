/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.pkg19;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class P30 {public static void main(String[] args) {
        
            System.out.println("pulsa c para un numero aleatorio");
            Scanner sc = new Scanner(System.in);
            String opcion = sc.nextLine();
        
            do{
            System.out.println((int)(Math.random()*10)+10);
            opcion = sc.nextLine();
            }while(opcion.equals("c") || opcion.equals("C"));
    }
    
}
