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
public class p17 {
  public static void main(String args[]){
      Scanner verPrecio = new Scanner(System.in);
      System.out.println("Dame el precio en euros");
      double precio = verPrecio.nextDouble();
      System.out.println("Al producto se le añade: " + (precio*0.07) + " euros de IGIC ");
      
      
  }
    
}
