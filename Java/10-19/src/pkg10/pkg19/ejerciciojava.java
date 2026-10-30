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
public class ejerciciojava {
    public static void main(String args[]) {
        System.out.println("Dame la edad");
        Scanner verEdad = new Scanner(System.in);
        int edad = verEdad.nextInt();
        String resultado = "";
        if(edad<18) { resultado = "Es menor de edad";
            
        }else{if (edad<=67) {resultado = "Es mayor de edad";
            
        }else resultado = "Esta jubilado";}
        System.out.println(resultado);
    }
  
}
