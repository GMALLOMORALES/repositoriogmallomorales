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
public class p23 {
    public static void main(String[] args) {
        Scanner verNum = new Scanner(System.in);
        System.out.println("dame a ");
        int a = verNum.nextInt();
        System.out.println("dame b");
        int b = verNum.nextInt();
        System.out.println("dame c");
        int c = verNum.nextInt();
        double raiz = Math.sqrt(b*b-4*a*c);
        double resultadoP = (-b+raiz)/(2*a);
        double resultadoN = (-b-raiz)/(2*a);
        System.out.println("Los dos posibles resultados para la ecuacion de segundo grado son:");
        System.out.println(resultadoP + " y " + resultadoN);
        
        
      
    }
}
