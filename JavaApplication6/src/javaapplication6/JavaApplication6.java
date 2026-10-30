/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author alumno
 */
     import java.util.Scanner;
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
       Scanner myObj = new Scanner(System.in);
        System.out.println("Introduzca numero 1");
        int numero1 = myObj.nextInt();
         System.out.println("Introduzca numero 2");
        int numero2 = myObj.nextInt();
        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicacion: " + (numero1 * numero2));
       
        // TODO code application logic here
    }
    
}
