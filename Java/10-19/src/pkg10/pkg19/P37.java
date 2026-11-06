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
public class P37 {public static void main(String[] args) {
            int cantidadtotal = 0;
            System.out.println("Dame la cantidad de billetes de 500");
            Scanner sc = new Scanner(System.in);
            int dineroen500 = (sc.nextInt()*500);
            cantidadtotal = cantidadtotal + dineroen500;
                 System.out.println("Dame la cantidad de billetes de 200");
            
            int dineroen200 = (sc.nextInt()*200);
            cantidadtotal = cantidadtotal + dineroen200;
                 System.out.println("Dame la cantidad de billetes de 100");
          
            int dineroen100 = (sc.nextInt()*100);
            cantidadtotal = cantidadtotal + dineroen100;
                 System.out.println("Dame la cantidad de billetes de 50");
          
            int dineroen50 = (sc.nextInt()*50);
            cantidadtotal = cantidadtotal + dineroen50;
              System.out.println("Dame la cantidad de billetes de 20");
          
            int dineroen20 = (sc.nextInt()*20);
            cantidadtotal = cantidadtotal + dineroen20;
            
              System.out.println("Dame la cantidad de billetes de 10");
          
            int dineroen10 = (sc.nextInt()*10);
            cantidadtotal = cantidadtotal + dineroen10;
                  System.out.println("Dame la cantidad de billetes de 5");
          
            int dineroen5 = (sc.nextInt()*5);
            cantidadtotal = cantidadtotal + dineroen5;
              System.out.println("Dame la cantidad de billetes de 5");
              System.out.println("Tienes " + cantidadtotal + " en total ");
            
    }
    
}
