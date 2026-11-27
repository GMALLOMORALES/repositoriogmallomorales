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
public class Numerovalido {
    /**
     * verifica que el numero sea entre [20 y 50] y sea mútiplo de 3
     * @param numerValido
     * @return un boolean que diga si el numero cumple con los requisitos
     */
    
    
    public static boolean numeroValido(int num){
        boolean numeroEsValido = false;
        if(num>=20 && num<=50 && num%3==0){
        
           numeroEsValido = true;
        }else{numeroEsValido = false;}
        return numeroEsValido;
        
      
        
      
               
            
            
        } 
        
    
    
    public static void main(String[] args) {
        
            
        
        int num;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introducir un número;");
            num = sc.nextInt();
        }while (!numeroValido(num));
        System.out.println("El número cumple los requisitos. Se puede continuar");
        
        
    }
    
}
