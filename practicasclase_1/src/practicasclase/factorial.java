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
public class factorial {public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int divisor = 2;
    String resultado = "";
    String strOperador = "";
    while(num>=1){
        if(num%divisor==0){
            System.out.println(divisor);
            num = num/divisor;
            

        }else{
             divisor++;    
        }    
      if(divisor<=0){
          break;
      }
      
    }  
    }
       
    
    }
    

