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


public class Maximocomundivisorfuncion {
    public static int mcd(int c, int d){
           while (d != 0) {
               
           int r;
            r = c % d;
            c = d;
            d = r;}
           
           
        return c;
        
    } 
     public static void main(String[] args) {
        System.out.println("Dame dos numeros");
        System.out.println("Num a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Num b:");
        int b = sc.nextInt();
       
        
        
        System.out.println("MCD: " + mcd(a,b));
         System.out.println("MCM: " + a*b/mcd(a,b));
    }

    
}
