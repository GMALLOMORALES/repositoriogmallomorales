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
public class P32 { public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("dame el primer numero");
        int num1 = sc.nextInt();
            System.out.println("dame el segundo numero");
            int num2 = sc.nextInt();
            int aux;
            int i;
            int suma = 0;
            if(num1>num2){
              aux=num2;
              num2=num1;
              num1=aux;
            }
            for(i=num1;i<=num2;i++ ){
            suma = suma + i;
            
            }      System.out.println(suma);
            }
           
    }
    

