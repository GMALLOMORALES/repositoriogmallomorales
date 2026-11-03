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
public class p24 {public static void main(String[] args) {
        
            System.out.println("Selecciona tu idioma preferido");
            System.out.println("(c para castellano)");
            System.out.println("(i para ingles");
            System.out.println("(f para frances)");
            System.out.println("(a para aleman)");
            Scanner sc = new Scanner(System.in);
            char idioma = sc.nextLine().charAt(0);
            switch(idioma){
                case 'c': System.out.println("Buenos dias");break;
                case 'i': System.out.println("Good morning");break;
                case 'f': System.out.println("Bonjour");break;
                case 'a': System.out.println("Guten Morgen");break;
                
                
            }
    }
    
}
