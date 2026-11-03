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
public class p21 {public static void main(String[] args) {
            System.out.println("dame un numero x");
            Scanner sc = new Scanner(System.in);
           int num = sc.nextInt();
           if ((num%3==0 && num%5==0)){ System.out.println("x es multiplo de 3 y 5");
           } 
           else if(num%3==0){ System.out.println("x es multiplo de 3 pero no de 5");
           }
           else if(num%5==0){ System.out.println("x es multiplo de 5 pero no de 3");
           }
           else{System.out.println("x no es multiplo de 5 ni de 3");
           }
               
           }
    }
    

