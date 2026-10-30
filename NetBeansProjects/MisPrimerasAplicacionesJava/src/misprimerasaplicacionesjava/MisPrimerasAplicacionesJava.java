/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package misprimerasaplicacionesjava;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class MisPrimerasAplicacionesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("un programa para calcular el perímetro");
        Scanner sc  = new Scanner(System.in);
        System.out.println("dame el lado 1");
        int ladoRectangulo1 = sc.nextInt();
        System.out.println("El número que has introducido es: " + ladoRectangulo1);
        
        System.out.println("dame el lado 2");
        int lado2 = sc.nextInt();
        System.out.println("El segundo lado es: " + lado2);
        
        int resultado = ladoRectangulo1 + lado2 + ladoRectangulo1 + lado2;
        System.out.println("El resultado del perímetro es: " + resultado );
      
    }
    
}
