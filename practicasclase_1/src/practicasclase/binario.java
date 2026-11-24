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
public class binario {public static void main(String[] args) {
            System.out.println("dame un numero");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int cociente = num;
            String resultado = "";
            
            while(cociente>0){
                String resto=""+ cociente%2;
                cociente = cociente/2;
                
               if(cociente>=2 && cociente <=4)
                   cociente = cociente;
               
            }
                System.out.println(cociente);
      
         
         
         
     
        
}
    
}
