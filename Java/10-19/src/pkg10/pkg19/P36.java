/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg10.pkg19;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class P36 {public static void main(String[] args) {
        
            System.out.println("Lanza un dado");
            System.out.println("Introduce 'f' para acabar");
            Random rnd = new Random();
            String parar ="";
            int dado1, dado2, dado3;
            int lanzamientos = 0;
            Scanner sc = new Scanner(System.in);
            int totaldados = 0;
            
            while(!parar.equalsIgnoreCase("f") && !parar.equalsIgnoreCase("F")){
                parar = sc.nextLine();
                dado1 = rnd.nextInt(6)+1;
                dado2 = rnd.nextInt(6)+1;
                dado3 = rnd.nextInt(6)+1;
                System.out.println("Dado 1:" + dado1);
                System.out.println("Dado 2:" + dado2);
                System.out.println("Dado 3:" + dado3);
               totaldados = totaldados + dado1 + dado2 + dado3;
               lanzamientos++;
                parar = sc.nextLine();
            }
            
            System.out.println("Veces en las que los dados han sido lanzados: "+ lanzamientos);
            System.out.println("Suma de los numeros de los dados: "+ totaldados);
    }
    
}
