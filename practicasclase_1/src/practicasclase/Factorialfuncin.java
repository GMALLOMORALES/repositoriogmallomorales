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
public class Factorialfuncin {
    /**
     * esta función no sirve con números negativos. Lanza una excepción
     * @param num
     * @return 
     */
    public static int factorial(int num) throws Exception{
        if( num < 0){
            throw new Exception("no se admiten negativos");
        }
         int suma = 1;

        for (int i = num; i > 0; i--) {
           
            suma = suma * i;
  
            
        };
   
        return suma;
    };
    
    public static void main(String[] args) throws Exception {
        System.out.println("Dame un numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        
        System.out.println("Factorial: " + factorial(numero));
        
    }
    
}
