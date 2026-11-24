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
public class textoalreves {public static void main(String[] args) {
        
    
            System.out.println("dame un texto");
            Scanner sc = new Scanner(System.in);
            String texto = sc.nextLine();
            int i;
            String textofinal = "";
            for(i=texto.length()-1; i>=0; i--){
            textofinal = textofinal + texto.charAt(i);
            }
            System.out.println(textofinal);
    }
    
}
