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
public class P39_2 {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dame un nimero");
        int numero = sc.nextInt();
        int resto;
        int inverso;
        do{numero = resto % 10;
        resto = resto /10;
        inverso = inverso * 10 + numero;
        
        
            
            
        }while(resto>1);
            
    }
    
}
