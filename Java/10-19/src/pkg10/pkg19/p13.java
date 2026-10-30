/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.pkg19;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class p13 { 
    public static void main(String args[]) {
 Scanner cin = new Scanner(System.in);
 System.out.println("Introduzca un número mayor que 5 ");
 int numero = cin.nextInt();
 boolean comparaCon5;
 comparaCon5 = numero > 5;
 System.out.println("Es " + comparaCon5 + " que el número sea mayor que 5");  
  //Si el numero introducido es menor que 5, responde: "Es false que el n�mero sea mayor que 5"
  //Si el numero introducido es mayor que 5, responde: "Es true que el n�mero sea mayor que 5"
        
        
    }
    
}
