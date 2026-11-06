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
public class P33dowhile {public static void main(String[] args) {
        
     System.out.println("Introduzca el pin");
            Scanner sc = new Scanner(System.in);
            int clave = 9999;
            int intentos = 0;
            
            do{  int intento = sc.nextInt();
               if(intento!=clave){
                   intentos++;
                   System.out.println("Incorrecto. Tiene "+ (3-intentos)+ " intentos restantes");
               }
               else{
                   System.out.println("El codigo es correcto. Bienvenido");
          
            }
    }while(intentos<=2);}
    
}
