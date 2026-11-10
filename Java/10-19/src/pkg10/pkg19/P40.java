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
public class P40 { public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("dame un numero ENTERO mayor o igual a 0 y menor o igual que 999");
            int numero;
              do{
            numero = sc.nextInt();
            
               if(numero<0||numero>999){
                   System.out.println(" mayor o igual a 0 y menor o igual que 999");
               }
                
            }while(numero<0||numero>999);
              int longitudtexto = String.valueOf(numero).length();
              System.out.println("el texto tiene: " + longitudtexto + " cifras");
            
    }
    
}
