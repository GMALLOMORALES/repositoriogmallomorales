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
public class Secuencianumerosnegativos {public static void main(String[] args) {
            System.out.println("Dame un numero");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            
            for(;i>=0;i-=6){
                System.out.println(i);
               
            }
    }
    
}
