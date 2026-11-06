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
public class P33for {public static void main(String[] args) {
    



        Scanner sc = new Scanner(System.in);

        int clave = 9999;
        int intentos = 0;
        int intento = 0;
        for (intentos = 0; intentos < 3; intentos++) {
            
            System.out.println("Introduzca el pin");
            intento = sc.nextInt();
            if (intento == clave) {
                System.out.println("El codigo es correcto. Bienvenido");
                break;
            } else {
                System.out.println("Incorrecto. Tiene " + (2 - intentos) + " intentos restantes");
            }
        }
        if (intento != clave) {
            System.out.println("Ha agotado los 3 intentos");
        }

       
    }
}


    

