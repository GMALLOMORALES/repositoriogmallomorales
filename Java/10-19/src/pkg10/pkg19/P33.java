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
//Se pretende imitar el comportamiento de un sistema de control por pin. El 
//usuario tiene 3 intentos para acertar con el pin, cada vez de esos tres intentos que falle se le 
//que diga: “El código es correcto. Bienvenido” Si no acierta en los tres intentos el programa 
//termina
//Hacer 3 versiones de este código una con while, otra con do while y finalmente for
public class P33 { public static void main(String[] args) {
            System.out.println("Introduzca el pin");
            Scanner sc = new Scanner(System.in);
            int clave = 9999;
            int intentos = 0;
            
           while(intentos<=2){
               int intento = sc.nextInt();
               if(intento!=clave){
                   intentos++;
                   System.out.println("Incorrecto. Tiene "+ (3-intentos)+ " intentos restantes");
               }
               else{
                   System.out.println("El codigo es correcto. Bienvenido");
          
            }
    
    
}
    }
    
}
