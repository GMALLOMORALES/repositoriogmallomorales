/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.pkg19;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejerciciojava2 {
public static void main(String args[]){
    
    Scanner ver1 = new Scanner(System.in);
    Scanner ver2 = new Scanner(System.in);
      System.out.println("Dame primer numero"); 
    int num1 = ver1.nextInt();
 System.out.println("Dame segundo numero");
    int num2 = ver2.nextInt();
    
  if ((num1<100 && num2<100)) {
   String resultado = "Num1 y num2 son menos que 100";
  } else if ((num1>100 && num2<100)) {String resultado = "num1 es mayor que 100 y num2 es menor que 100";   
   System.out.println(resultado);
  } else if((num1<100 && num2>100)) {String resultado ="num1 es menor que 100 y num2 es mayor que 100";  
 System.out.println(resultado);  
  } else {String resultado ="num1 y num2 son mayores que 100";
   System.out.println(resultado);
  }
  }  
    
   
}
  
