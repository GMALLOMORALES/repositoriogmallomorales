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
public class P26 {public static void main(String[] args) {
            System.out.println("dame una letra");
    Scanner sc = new Scanner(System.in);
    String letra = sc.nextLine();
    switch(letra){
        case "a","e","i","o","u": System.out.println("es vocal");break;
        default: System.out.println("es consonante");break;
        
    }
    }
    
}
