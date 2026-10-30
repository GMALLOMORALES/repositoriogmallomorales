/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationboolean;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class JavaApplicationboolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner verEdad = new Scanner(System.in);
        System.out.println("Introduzca edad");
        int edad = verEdad.nextInt();
        String resultado = (edad >=18) ? "Eres mayor de edad": "Eres menor de edad";
        System.out.println(resultado);
    }
    
}
