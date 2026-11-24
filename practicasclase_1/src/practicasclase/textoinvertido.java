/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicasclase;

import java.util.Scanner;

/**
 *
 * @author Guillermo
 */
public class textoinvertido {public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
     String texto = sc.nextLine();
     String inverso = "";
     int longitud = texto.length();
      for(int i =longitud-1;i>=0;i--){
          inverso = inverso + texto.charAt(i);
          
            }System.out.println(inverso);
    }
    
}
